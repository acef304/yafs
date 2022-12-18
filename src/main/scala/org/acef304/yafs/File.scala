package org.acef304.yafs

import java.nio.ByteBuffer
import java.time.Instant

case class Time(timesec: Long, timensec: Int)

object Time {
  def ofNow(): Time = {
    val now = Instant.now
    Time(now.getEpochSecond, now.getNano)
  }
}

case class File(content: FileContent, attributes: Short, ctime: Time, atime: Time, mtime: Time, uid: Int, gid: Int) {
  def setAtime(time: Instant = Instant.now()): File =
    this.copy(atime = Time(time.getEpochSecond, time.getNano))

  def setCtime(time: Instant = Instant.now()): File =
    this.copy(ctime = Time(time.getEpochSecond, time.getNano))

  def setMtime(time: Instant = Instant.now()): File =
    this.copy(mtime = Time(time.getEpochSecond, time.getNano))
}

object File {
  val defaultAttribute: Short = (7 * 8 * 8 + 7 * 8 + 7).toShort //means 0777
  val defaultUid = 501
  val defaultGid = 20

  def withContent(content: Array[Byte]): File = {
    File(
      content = FileContent.fromByteArray(content),
      attributes = defaultAttribute,
      ctime = Time.ofNow(),
      atime = Time.ofNow(),
      mtime = Time.ofNow(),
      uid = defaultUid,
      gid = defaultGid
    )
  }
}


object readers {

  import tethys._
  import tethys.jackson._
  import tethys.derivation.auto._
  import tethys.derivation.semiauto._


  //  implicit val arrayWriter: JsonWriter[Byte] = JsonWriter.stringWriter.contramap[Byte](_.toString)
  implicit val arrayWriter: JsonWriter[Array[Byte]] = JsonWriter.stringWriter.contramap[Array[Byte]] {
    bytes =>
      "[" + bytes.toList.map(_.toString).mkString(",") + "]"
  }

  //  implicit val timeWriter: JsonWriter[Time] = jsonWriter[Time] //semiauto
  //  implicit val timeReader: JsonReader[Time] = jsonReader[Time]

  //  implicit val fileWriter: JsonWriter[File] = jsonWriter[File] //semiauto
  //  implicit val gggWriter: JsonWriter[(String, File)] = jsonWriter[(String, File)]
  //  implicit val gggdWriter: JsonWriter[List[(String, File)]] = JsonWriter.[List[(String, File)]]
  //  implicit val fileReader: JsonReader[File] = jsonReader[File]

}