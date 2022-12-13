package org.acef304.yafs

import java.time.Instant

case class Time(timesec: Long, timensec: Int)
object Time {
  def ofNow(): Time = {
    val now = Instant.now
    Time(now.getEpochSecond, now.getNano)
  }
}

case class File(content: Array[Byte], attributes: Short, ctime: Time, atime: Time, mtime: Time, uid: Int, gid: Int)
object File {
  val defaultAttribute: Short = (7*8*8 + 7*8 + 7).toShort //means 0777
  val defaultUid = 501
  val defaultGid = 20
  def withContent(content: Array[Byte]): File = {
    File(
      content = content,
      attributes = defaultAttribute,
      ctime = Time.ofNow(),
      atime = Time.ofNow(),
      mtime = Time.ofNow(),
      uid = defaultUid,
      gid = defaultGid
    )
  }
}
