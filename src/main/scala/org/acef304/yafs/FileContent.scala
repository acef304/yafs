package org.acef304.yafs

import java.nio.ByteBuffer

case class FileContent(val blocks: List[Block]) {
  def length(): Long = blocks.foldLeft(0L)((sum, block) => sum + block.content.length)

  def readToBuffer(buffer: ByteBuffer, offset: Long, size: Long): Long = {
    take(offset, size).map(block => buffer.put(block.content))
    buffer.position()
  }

  def take(offset: Long, length: Long): List[Block] = {
    blocks.foldLeft((0L, length, List.empty[Block])) {
      case (acc, block) if acc._1 + block.content.length < offset => (acc._1 + block.content.length, acc._2, acc._3)
      case (acc, _) if acc._2 == 0 => return acc._3.reverse
      case (acc, block) =>
        val blockOffset = Math.max(0L, offset - acc._1).toInt
        val readCount = Math.min(acc._2, block.content.length - blockOffset).toInt
        val cutLeft = if (blockOffset == 0) block.content else block.content.drop(blockOffset)
        val cutRight = if (readCount == block.content.length - blockOffset) cutLeft else cutLeft.take(readCount)
        (acc._1 + blockOffset + readCount, acc._2 - readCount, Block(cutRight) :: acc._3)
    }._3.reverse
  }

  def insert(insertion: Array[Byte], offset: Long): FileContent = {
    new FileContent(
      take(0,offset) ++ (Block(insertion) :: take(offset + insertion.length, Long.MaxValue))
    )
  }

  def compareByContent(other: FileContent): Boolean = {
    blocks.length == other.blocks.length &&
      (blocks zip other.blocks).forall(pair => pair._1.content sameElements pair._2.content)
  }

  private def arrayToString(array: Array[Byte]): String = "[" + array.map(_.toString).mkString(",") + "]"

  def baToString(): String = "{" + blocks.map(_.content).map(arrayToString).mkString(";") + "}"
}

object FileContent {
  def fromByteArray(content: Array[Byte]) = new FileContent(List(Block(content)))
}

case class Block(hash: String, content: Array[Byte])

object Block {
  private def getMd5Hash(content: Array[Byte]): String = {
    import org.apache.commons.codec.digest.DigestUtils
    DigestUtils.md5Hex(content).toUpperCase
  }

  def apply(content: Array[Byte]): Block = Block(getMd5Hash(content), content)
}

