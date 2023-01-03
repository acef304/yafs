package org.acef304.yafs

object MyApp extends App {
  Model.restore() match {
    case Left(error) => println(s"Got error during restore fs: $error")
    case Right(model) =>
        Handler(model).main()
        model.dumpFs()
  }
}
