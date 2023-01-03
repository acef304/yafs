package org.acef304.yafs

import tethys._
import tethys.jackson._
import tethys.derivation.auto._

case class Config(workdir: String)

object Config{
  def readFromArgs(args: Array[String]) = {
    args.find(_.startsWith("conf:"))
      .map(_.dropWhile(_ != ':').drop(1))
      .flatMap(_.jsonAs[Config].toOption)
  }
}