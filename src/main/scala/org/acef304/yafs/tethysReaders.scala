package org.acef304.yafs

object tethysReaders {

  import tethys._
  //  import tethys.jackson._
//  import tethys.derivation.auto._
  import tethys.derivation.semiauto._


  implicit val timeWriter: JsonWriter[Time] = jsonWriter[Time] //semiauto
  implicit val timeReader: JsonReader[Time] = jsonReader[Time]

  implicit val blockWriter: JsonWriter[Block] = JsonWriter.stringWriter.contramap(_.hash) //..stringWriter.contramap(_.hash)
  implicit val fileContentWriter: JsonWriter[FileContent] = jsonWriter[FileContent]
  implicit val fileWriter: JsonWriter[File] = jsonWriter[File] //semiauto
  //  implicit val gggWriter: JsonWriter[(String, File)] = jsonWriter[(String, File)]
  //    implicit val gggdWriter: JsonWriter[List[(String, File)]] = JsonWriter.[List[(String, File)]]


  def blockCreator(hash: String): Block = LiteBlock(hash)

  implicit val blockReader: JsonReader[Block] = JsonReader.stringReader.map(hash => blockCreator(hash))
  implicit val fileContentReader: JsonReader[FileContent] = jsonReader[FileContent]
  implicit val fileReader: JsonReader[File] = jsonReader[File]

}
