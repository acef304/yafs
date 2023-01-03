package org.acef304.yafs

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}
import scala.collection.concurrent.TrieMap
import tethys._
import tethys.jackson._
import tethys.derivation.auto._
import tethys.derivation.semiauto.{jsonReader, jsonWriter}


case class Model(directories: TrieMap[String, File], files: TrieMap[String, File])(implicit config: Config, metrics: Metrics) {
  def isDir(path: String): Boolean = directories.contains(path)

  def addFile(filename: String): Unit = files.put(filename, File.withContent(new Array[Byte](0)))

  def isFile(path: String): Boolean = files.contains(path)
}

object Model {
  private final val DIRECTORIES = "directories"
  private final val FILES = "files"

  implicit val timeWriter: JsonWriter[Time] = jsonWriter[Time]
  implicit val blockWriter: JsonWriter[Block] = JsonWriter.stringWriter.contramap(_.hash)
  implicit val fileContentWriter: JsonWriter[FileContent] = jsonWriter[FileContent]
  implicit val fileWriter: JsonWriter[File] = jsonWriter[File]

  def apply(implicit config: Config, metrics: Metrics): Model = Model(new TrieMap[String, File], new TrieMap[String, File])

  def restore()(implicit config: Config, metrics: Metrics): Either[Exception, Model] = {
    implicit val timeReader: JsonReader[Time] = jsonReader[Time]
    implicit val blockReader: JsonReader[Block] = JsonReader.stringReader.map(hash => LiteBlock(hash))
    implicit val fileContentReader: JsonReader[FileContent] = jsonReader[FileContent]
    implicit val fileReader: JsonReader[File] = jsonReader[File]

    for {
      directoryPairs <- Files.readString(Paths.get(config.workdir, DIRECTORIES)).jsonAs[List[(String, File)]]
      filePairs <- Files.readString(Paths.get(config.workdir, FILES)).jsonAs[List[(String, File)]]
      directories = new TrieMap[String, File]()
      files = new TrieMap[String, File]()
      _ = directoryPairs.foreach(pair => directories.put(pair._1, pair._2))
      _ = filePairs.foreach(pair => files.put(pair._1, pair._2))
    } yield Model(directories, files)
  }

  def store(model: Model)(implicit config: Config): Unit = {
    val directories = model.directories.toList.asJson
    val files = model.files.toList.asJson

    Files.write(Paths.get(config.workdir, DIRECTORIES), directories.getBytes(StandardCharsets.UTF_8))
    Files.write(Paths.get(config.workdir, FILES), files.getBytes(StandardCharsets.UTF_8))
    model.files.toList.map(_._2.content).flatMap(_.blocks).foreach(BlockStorage.storeBlock)
  }
}
