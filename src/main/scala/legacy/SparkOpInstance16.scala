package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.SparkOp
import org.apache.spark.sql.DataFrame
import platform.common_classes.Metadata
import platform.common_classes.RunConfigurations
import platform.common_classes.Metadata
import platform.common_classes.RunConfigurations

object SparkOpInstance16 extends SparkOp {
  override def name: String = "SparkOpInstance16"
  override def inputs: Set[String] = Set("SparkOpInstance15") // Reference to SparkOpInstance15 as an input
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
