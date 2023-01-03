package org.acef304.yafs

import org.slf4j.{Logger, LoggerFactory}

import scala.collection.concurrent.TrieMap

case class Metric(name: String, value: Long)

class MetricRecord {
  var count = 0L
  var sum = 0L

  def addMetric(metric: Metric): Unit = {
    count += 1
    sum += metric.value
  }

  override def toString: String = s"Count: $count Sum: $sum"
}

class Metrics {
  final val logger: Logger = LoggerFactory.getLogger("Metrics")

  val metricContainer = TrieMap.empty[String, MetricRecord]

  def addMetric(metric: Metric) =
    metricContainer.getOrElseUpdate(metric.name, new MetricRecord).addMetric(metric)

  class MutableBoolean(var flag: Boolean)

  def loggerThread(): MutableBoolean = {
    val isRunning = new MutableBoolean(true)
    val loggerThread = new Thread {
      override def run: Unit = {
        while (isRunning.flag) {
          logger.info("Metrics:\n\t" + metricContainer.toList.sortBy(_._1).mkString("\n\t"))
          Thread.sleep(5000)
        }
      }
    }
    loggerThread.start()
    isRunning
  }
}


