package org.acef304.yafs

import java.nio.file.{Files, Path, StandardOpenOption}

trait Block {
  def hash: String
  def content: Array[Byte]
}

case class FullBlock(hash: String, content: Array[Byte]) extends Block

case class LiteBlock(hash: String)(implicit config: Config) extends Block {
  lazy val content: Array[Byte] = BlockStorage.readBlock(hash)
}

object Block {
  private def getMd5Hash(content: Array[Byte]): String = {
    import org.apache.commons.codec.digest.DigestUtils
    DigestUtils.md5Hex(content).toUpperCase
  }

  def apply(content: Array[Byte]): Block = FullBlock(getMd5Hash(content), content)
  def apply(hash: String)(implicit config: Config): Block = LiteBlock(hash)
}

object BlockStorage {
  private final val blockDir = "blocks"

  def readBlock(hash: String)(implicit config: Config): Array[Byte] = Files.readAllBytes(Path.of(config.workdir, blockDir, hash))
  def storeBlock(block: Block)(implicit config: Config): Unit = Files.write(Path.of(config.workdir, blockDir, block.hash), block.content, StandardOpenOption.CREATE)
}