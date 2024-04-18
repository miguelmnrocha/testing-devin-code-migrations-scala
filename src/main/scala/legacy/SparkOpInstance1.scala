package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.{Metadata, RunConfigurations, SparkOp}
import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkOpInstance1 extends SparkOp {
  override def name: String = "SparkOpInstance1"
  override def inputs: Set[String] = Set("input1", "input2")
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
