package org.acef304.yafs

import scala.collection.concurrent.TrieMap


case class Model(directories: TrieMap[String, File], files: TrieMap[String, File]) {
  def isDir(path: String): Boolean = directories.contains(path)

  def addFile(filename: String): Unit = files.put(filename, File.withContent(new Array[Byte](0)))

  def isFile(path: String): Boolean = files.contains(path)

//  import readers._
//  def getDirectoriesString = directories.toList.asJson
//  def getFilesString = files.asJson
}

object Model{
  def apply(): Model = Model(new TrieMap[String, File], new TrieMap[String, File])
}
