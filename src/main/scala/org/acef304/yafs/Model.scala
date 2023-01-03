package org.acef304.yafs

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}
import scala.collection.concurrent.TrieMap
import tethys._
import tethys.jackson._
import tethys.derivation.auto._
import tethysReaders._


case class Model(directories: TrieMap[String, File], files: TrieMap[String, File]) {
  def isDir(path: String): Boolean = directories.contains(path)

  def addFile(filename: String): Unit = files.put(filename, File.withContent(new Array[Byte](0)))

  def isFile(path: String): Boolean = files.contains(path)

  def getDirectoriesString = directories.toList.asJson

  def getFilesString = files.toList.asJson

  def dumpFs() = {
    Files.write(Paths.get("directories"), getDirectoriesString.getBytes(StandardCharsets.UTF_8))
    Files.write(Paths.get("files"), getFilesString.getBytes(StandardCharsets.UTF_8))
    files.toList.map(_._2.content).flatMap(_.blocks).foreach(BlockStorage.storeBlock)
  }

}

object Model {
  def apply(): Model = Model(new TrieMap[String, File], new TrieMap[String, File])

  def restore(): Either[Exception, Model] =
    for {
      directoryPairs <- Files.readString(Paths.get("directories")).jsonAs[List[(String, File)]]
      filePairs <- Files.readString(Paths.get("files")).jsonAs[List[(String, File)]]
      directories = new TrieMap[String, File]()
      files = new TrieMap[String, File]()
      _ = directoryPairs.foreach(pair => directories.put(pair._1, pair._2))
      _ = filePairs.foreach(pair => files.put(pair._1, pair._2))
    } yield Model(directories, files)
}
