package org.acef304.yafs

import org.acef304.yafs.Model.{addFile, directories, files, isDir, isFile}
import org.fuse._
import org.fuse.fuse_h_1.fuse_main_real

import java.lang.foreign.{MemoryAddress, MemorySegment, MemorySession, ValueLayout}
import java.nio.{ByteBuffer, ByteOrder}
import java.util

object Handler {

  var mSession: MemorySession = null

  def main(): Unit = {
    System.load("/usr/local/lib/libfuse.dylib") // TODO

    val args = List("-f", "-d", "/users/aleksey/mnt").toArray
    Model.files.put("/file54", File.withContent("content of file54".getBytes)) // FIXME

    Model.directories.put("/", File.withContent(new Array[Byte](0)))
    try {
      val session = MemorySession.openShared
      try {
        mSession = session
        val arguments = args.map(session.allocateUtf8String)
        val argumentCount = args.length
        val argumentSpace = session.allocateArray(ValueLayout.ADDRESS, argumentCount)
        for (i <- 0 until argumentCount) {
          argumentSpace.setAtIndex(ValueLayout.ADDRESS, i, arguments(i))
        }
        val operationsMemorySegment = fuse_operations.allocate(session)
        fuse_operations.getattr$set(operationsMemorySegment, fuse_operations.getattr.allocate(getAttr, session).address)
        fuse_operations.readdir$set(operationsMemorySegment, fuse_operations.readdir.allocate(readDir, session).address)
        fuse_operations.read$set(operationsMemorySegment, fuse_operations.read.allocate(read, session).address)
        fuse_operations.mkdir$set(operationsMemorySegment, fuse_operations.mkdir.allocate(doMkdir, session).address)
        fuse_operations.mknod$set(operationsMemorySegment, fuse_operations.mknod.allocate(doMknod, session).address)
        fuse_operations.write$set(operationsMemorySegment, fuse_operations.write.allocate(doWrite, session).address)
        fuse_operations.unlink$set(operationsMemorySegment, fuse_operations.unlink.allocate(doUnlink, session).address)
        fuse_operations.rmdir$set(operationsMemorySegment, fuse_operations.rmdir.allocate(doRmdir, session).address)
        fuse_operations.chmod$set(operationsMemorySegment, fuse_operations.chmod.allocate(doChmod, session).address)
        fuse_main_real(argumentCount, argumentSpace, operationsMemorySegment, operationsMemorySegment.byteSize, MemoryAddress.NULL)
      } finally if (session != null) session.close()
    }
  }

  def getAttr(path: MemoryAddress, mStat: MemoryAddress): Int = {
    val jPath = path.getUtf8String(0)
    val statMemorySegment = stat.ofAddress(mStat, mSession)
    val S_IFDIR = 0x4000//0040000
    /* directory */
    val S_IFREG = 0x8000//0100000
    /* regular */
    var file: File = null
    var mask = 0
    if ("/" == jPath || isDir(jPath)) {
      file = directories.get(jPath)
      mask = S_IFDIR
      stat.st_nlink$set(statMemorySegment, 2.toShort)
    }
    else if (isFile(jPath)) {
      file = files.get(jPath)
      mask = S_IFREG
      stat.st_nlink$set(statMemorySegment, 1.toShort)
      stat.st_size$set(statMemorySegment, files.get(jPath).content.length)
    }
    else return -2
    // setting the stat atim (last access time)
    timespec.tv_sec$set(stat.st_atimespec$slice(statMemorySegment), file.atime.timesec)
    timespec.tv_nsec$set(stat.st_atimespec$slice(statMemorySegment), file.atime.timensec)
    // setting the stat mtim (last modify time)
    timespec.tv_sec$set(stat.st_mtimespec$slice(statMemorySegment), file.mtime.timesec)
    timespec.tv_nsec$set(stat.st_mtimespec$slice(statMemorySegment), file.mtime.timensec)
    // setting the stat ctim (last c time)
    timespec.tv_sec$set(stat.st_ctimespec$slice(statMemorySegment), file.ctime.timesec)
    timespec.tv_nsec$set(stat.st_ctimespec$slice(statMemorySegment), file.ctime.timensec)
    stat.st_uid$set(statMemorySegment, file.uid)
    stat.st_gid$set(statMemorySegment, file.gid)
    stat.st_mode$set(statMemorySegment, (mask | file.attributes).toShort)
    0
  }

  def readDir(path: MemoryAddress, buffer: MemoryAddress, filler: MemoryAddress, offset: Long, fileInfo: MemoryAddress): Int = {
    val jPath = path.getUtf8String(0)
    val fuse_fill_dir_t = org.fuse.fuse_fill_dir_t.ofAddress(filler, mSession)
    fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String(".").address, MemoryAddress.NULL, 0)
    fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String("..").address, MemoryAddress.NULL, 0)
    if ("/" == jPath) {
//      import scala.collection.JavaConversions._
      directories.keySet.stream.filter((d: String) => !(d == "/")).forEach { p =>
        fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String(p).address, MemoryAddress.NULL, 0)
      }

      files.keySet.forEach{ p =>
        fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String(p.substring(1)).address, MemoryAddress.NULL, 0)
      }
    }
    0
  }

  def read(path: MemoryAddress, buffer: MemoryAddress, size: Long, offset: Long, fileInfo: MemoryAddress): Int = {
    val jPath = path.getUtf8String(0)
    if (!isFile(jPath)) return -1
    val selected = files.get(jPath).content
    val byteBuffer = MemorySegment.ofAddress(buffer, size, mSession).asByteBuffer
    val src = util.Arrays.copyOfRange(selected, Math.toIntExact(offset), Math.toIntExact(size))
    byteBuffer.put(src)
    src.length
  }

  def doMkdir(path: MemoryAddress, mode: Short): Int = {
    val jPath = path.getUtf8String(0)
    directories.put(jPath, File.withContent(new Array[Byte](0)))
    0
  }

  def doMknod(path: MemoryAddress, mode: Short, rdev: Int): Int = {
    val jPath = path.getUtf8String(0)
    addFile(jPath)
    0
  }

  def doWrite(path: MemoryAddress, buffer: MemoryAddress, size: Long, offset: Long, info: MemoryAddress): Int = {
    val array = MemorySegment.ofAddress(buffer, size, mSession).toArray(ValueLayout.JAVA_BYTE.withOrder(ByteOrder.nativeOrder))
    val jPath = path.getUtf8String(0)
    if (files.containsKey(jPath)) {
      val existing = files.get(jPath).content
      val exFile = files.get(jPath)
      if (existing.length > offset + size) {
        System.arraycopy(array, 0, existing, offset.toInt, size.toInt)
        files.put(jPath, exFile.copy(content = existing))
      } else {
        val newArray = new Array[Byte](offset.toInt + size.toInt)
        val exFile = files.get(jPath)
        System.arraycopy(existing, 0, newArray, 0, offset.toInt)
        System.arraycopy(array, 0, newArray, offset.toInt, size.toInt)
        files.put(jPath, exFile.copy(content = newArray))
      }
    }
    Math.toIntExact(size)
  }

  def doUnlink(path: MemoryAddress): Int = {
    val jPath = path.getUtf8String(0)
    files.remove(jPath)
    0
  }

  def doRmdir(path: MemoryAddress): Int = {
    val jPath = path.getUtf8String(0)
    directories.remove(jPath)
    0
  }

  def doChmod(path: MemoryAddress, attrs: Short): Int = {
    val jPath = path.getUtf8String(0)
    if (files.containsKey(jPath)) {
      files.put(jPath, files.get(jPath).copy(attributes = attrs))
    }
    0
  }
}
