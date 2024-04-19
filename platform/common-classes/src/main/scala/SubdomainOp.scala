package platform.common_classes

import org.apache.spark.sql.DataFrame

trait SubdomainOp {
  def name: String
  def query(inputs: Map[String, DataFrame]): DataFrame
  def metadata: Metadata
  def runConfigurations: RunConfigurations
  def inputs: Set[Input]
}

case class Input(name: String)
