package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.{Metadata, RunConfigurations, SparkOp}
import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkOpInstance2 extends SparkOp {
  override def name: String = "dataset/spark-op-instance-2"
  override def inputs: Set[String] = Set(SparkOpInstance1.name) // Reference to SparkOpInstance1 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Mock implementation for query
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    // Mock implementation for metadata
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    // Mock implementation for runConfigurations
    new RunConfigurations()
  }
}
