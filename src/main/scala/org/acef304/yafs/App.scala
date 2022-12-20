package org.acef304.yafs

import java.util

object MyApp extends App {
  println("Hello world")
  val model = Model()
  Handler(model).main()
  model.dumpFs()
}
