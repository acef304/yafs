package org.acef304.yafs

import java.nio.ByteBuffer

class FileContent(val blocks: List[Array[Byte]]) {
  def length(): Long = blocks.foldLeft(0L)((sum, arr) => sum + arr.length)

  def readToBuffer(buffer: ByteBuffer, offset: Long, size: Long): Long = {
    take(offset, size).blocks.map(buffer.put)
    buffer.position()
  }

  def take(offset: Long, length: Long): FileContent = {
    new FileContent(blocks.foldLeft((0L, length, List.empty[Array[Byte]])) {
      case (acc, block) if acc._1 + block.length < offset => (acc._1 + block.length, acc._2, acc._3)
      case (acc, _) if acc._2 == 0 => return new FileContent(acc._3.reverse)
      case (acc, block) =>
        val blockOffset = Math.max(0L, offset - acc._1).toInt
        val readCount = Math.min(acc._2, block.length - blockOffset).toInt
        val cutLeft = if (blockOffset == 0) block else block.drop(blockOffset)
        val cutRight = if (readCount == block.length - blockOffset) cutLeft else cutLeft.take(readCount)
        (acc._1 + blockOffset + readCount, acc._2 - readCount, cutRight :: acc._3)
    }._3.reverse)
  }

  def insert(insertion: Array[Byte], offset: Long): FileContent = {
    new FileContent(
      take(0,offset).blocks ++ (insertion :: take(offset + insertion.length, Long.MaxValue).blocks)
    )
  }

  def compareByContent(other: FileContent): Boolean = {
    blocks.length == other.blocks.length &&
      (blocks zip other.blocks).forall(pair => pair._1 sameElements pair._2)
  }

  private def arrayToString(array: Array[Byte]): String = "[" + array.map(_.toString).mkString(",") + "]"

  def baToString(): String = "{" + blocks.map(arrayToString).mkString(";") + "}"
}

object FileContent {
  def fromByteArray(content: Array[Byte]) = new FileContent(List(content))
}

case class Block(hash: String, content: Array[Byte])

object Block {
  private def getMd5Hash(content: Array[Byte]): String = {
    import org.apache.commons.codec.digest.DigestUtils
    DigestUtils.md5Hex(content).toUpperCase
  }

  def ofData(content: Array[Byte]): Block = Block(getMd5Hash(content), content)
}

