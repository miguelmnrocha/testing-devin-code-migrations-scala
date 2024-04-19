package platform.common_classes

import org.apache.spark.sql.DataFrame

trait SparkOp {
  def name: String
  def inputs: Set[String]
  def query(inputs: Map[String, DataFrame]): DataFrame
  def metadata: Metadata
  def runConfigurations: RunConfigurations
}
