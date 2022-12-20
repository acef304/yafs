package org.acef304.yafs

import tethys.JsonObjectWriter.lowPriorityWriter
import tethys.JsonWriterOps
import tethys.derivation.auto.jsonWriterMaterializer
import tethys.jackson.jacksonTokenWriterProducer

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}
import scala.collection.concurrent.TrieMap


case class Model(directories: TrieMap[String, File], files: TrieMap[String, File]) {
  def isDir(path: String): Boolean = directories.contains(path)

  def addFile(filename: String): Unit = files.put(filename, File.withContent(new Array[Byte](0)))

  def isFile(path: String): Boolean = files.contains(path)

  import readers._
  def getDirectoriesString = directories.toList.asJson
  def getFilesString = files.toList.asJson

  def dumpFs() = {
    Files.write(Paths.get("directories"), getDirectoriesString.getBytes(StandardCharsets.UTF_8))
    Files.write(Paths.get("files"), getFilesString.getBytes(StandardCharsets.UTF_8))
  }
}

object Model{
  def apply(): Model = Model(new TrieMap[String, File], new TrieMap[String, File])
}
