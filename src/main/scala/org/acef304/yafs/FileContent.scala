package org.acef304.yafs

import java.nio.ByteBuffer

case class FileContent(blocks: List[Block]) {
  lazy val length: Long = blocks.foldLeft(0L)((sum, block) => sum + block.content.length)

  def readToBuffer(buffer: ByteBuffer, offset: Long, size: Long)(implicit metrics: Metrics): Long = {
    take(offset, size).map(block => buffer.put(block.content))
    buffer.position()
  }

  def take(offset: Long, length: Long)(implicit metrics: Metrics): List[Block] = {
    val startTime = System.nanoTime()

    val res = if (offset + length >= this.length)
      blocks
    else
      blocks.foldLeft((0L, length, List.empty[Block])) {
        case (acc, block) if acc._1 + block.content.length < offset =>
          (acc._1 + block.content.length, acc._2, acc._3)
        case (acc, _) if acc._2 == 0 => return acc._3.reverse
        case (acc, block) =>
          val blockOffset = Math.max(0L, offset - acc._1).toInt
          val readCount = Math.min(acc._2, block.content.length - blockOffset).toInt
          val cutLeft = if (blockOffset == 0) block else Block(block.content.drop(blockOffset))
          val cutRight = if (readCount == block.content.length - blockOffset) cutLeft else Block(cutLeft.content.take(readCount))
          (acc._1 + blockOffset + readCount, acc._2 - readCount, cutRight :: acc._3)
      }._3.reverse
    metrics.addMetric(Metric("FileContent.take", System.nanoTime() - startTime))
    res
  }

  def insert(insertion: Array[Byte], offset: Long)(implicit metrics: Metrics): FileContent = {
    new FileContent(
      (take(0, offset) ++ (Block(insertion) :: take(offset + insertion.length, this.length))).filter(_.content.length > 0)
    )
  }

  def compareByContent(other: FileContent): Boolean = {
    blocks.length == other.blocks.length &&
      (blocks zip other.blocks).forall(pair => pair._1.content sameElements pair._2.content)
  }

}

object FileContent {
  def fromByteArray(content: Array[Byte])(implicit metrics: Metrics) = FileContent(List(Block(content)))
}

