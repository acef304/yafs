package org.acef304.yafs

object MyApp extends App {
  implicit val config: Config = Config.readFromArgs(args).getOrElse(Config("."))

  Model.restore() match {
    case Left(error) => println(s"Got error during restore fs: $error")
    case Right(model) =>
        Handler(model).main()
        Model.store(model)
  }
}
