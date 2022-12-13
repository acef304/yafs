package org.acef304.yafs

import java.util.HashMap

object Model {
  val directories: HashMap[String, File] = new HashMap[String, File]
  val files: HashMap[String, File] = new HashMap[String, File]

  def isDir(path: String): Boolean = directories.containsKey(path)

  def addFile(filename: String): Unit = files.put(filename, File.withContent(new Array[Byte](0)))

  def isFile(path: String): Boolean = files.containsKey(path)
}
