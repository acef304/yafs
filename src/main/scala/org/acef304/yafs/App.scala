package org.acef304.yafs

import org.slf4j.Logger
import org.slf4j.LoggerFactory

object MyApp extends App {
  private val logger: Logger = LoggerFactory.getLogger("MyApp")

  implicit val config: Config = Config.readFromArgs(args).getOrElse(Config("."))

  implicit val metrics: Metrics = new Metrics
  val loggerFlag = metrics.loggerThread()

  Model.restore() match {
    case Left(error) => logger.error(s"Got error during restore fs: $error")
    case Right(model) =>
        Handler(model).main()
        Model.store(model)
  }
  loggerFlag.flag = false
}
