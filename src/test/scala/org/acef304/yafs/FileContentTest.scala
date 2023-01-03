package org.acef304.yafs

import org.scalatest._

import java.nio.ByteBuffer

class FileContentTest extends org.scalatest.flatspec.AnyFlatSpec {
  private def bufferToString(buffer: ByteBuffer): String = arrayToString(buffer.array())

  private def arrayToString(array: Array[Byte]): String = "[" + array.map(_.toString).mkString(",") + "]"

  private def baToString(blocks: FileContent): String = "{" + blocks.blocks.map(_.content).map(arrayToString).mkString(";") + "}"

  def arrayOf(seed: Byte, count: Int): Array[Byte] = Array.fill(10) {
    seed
  }

  val blockArray = new FileContent(List(
    Block(arrayOf(0, 10)),
    Block(arrayOf(1, 10)),
    Block(arrayOf(2, 10)),
    Block(arrayOf(3, 10))
  ))

  implicit val metrics: Metrics = new Metrics

  "readToBuffer" should "work for empty BlockArray" in {
    val blockArray = FileContent.fromByteArray(new Array[Byte](0))
    val buffer = ByteBuffer.allocate(10)
    assert(blockArray.readToBuffer(buffer, 10, 20) == 0)
  }

  "readToBuffer" should "work for non-empty BlockArray" in {
    val buffer = ByteBuffer.allocate(25)

    assert(blockArray.readToBuffer(buffer, 15, 22) == 22)
    assert(bufferToString(buffer) == "[1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,0,0,0]")
    buffer.clear()

    assert(blockArray.readToBuffer(buffer, 9, 2) == 2)
    assert(bufferToString(buffer).take(4) == "[0,1")
    buffer.clear()

    assert(blockArray.readToBuffer(buffer, 35, 10) == 5)
    buffer.clear()
  }

  "take" should "work for non-empty BlockArray" in {
    assert(new FileContent(blockArray.take(0, 40)).compareByContent(blockArray));
  }


  "write" should "work for empty BlockArray" in {
    val emptyBlockArray = FileContent.fromByteArray(new Array[Byte](0))
    val array: Array[Byte] = Array.fill(10) {
      0
    }
    offset: 1 111 459 654 880 remain: 9 223 370 925 396 169 503


    val written = emptyBlockArray.insert(array, 0)
    assert(written compareByContent FileContent.fromByteArray(array))
  }

  "write" should "work for non-empty BlockArray" in {
    val array: Array[Byte] = Array.fill(7)(9)

    val written = blockArray.insert(array, 15)
    assert(baToString(written) == "{[0,0,0,0,0,0,0,0,0,0];[1,1,1,1,1];[9,9,9,9,9,9,9];[2,2,2,2,2,2,2,2];[3,3,3,3,3,3,3,3,3,3]}")
  }
}
