package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.SparkOp
import org.apache.spark.sql.DataFrame
import platform.common_classes.Metadata
import platform.common_classes.RunConfigurations

object SparkOpInstance7 extends SparkOp {
  val randomValue: Int = 1357 // Hardcoded random value

  override def name: String = "nu-br/dataset/spark-op-instance-7"
  override def inputs: Set[String] = Set(SparkOpInstance6.name) // Reference to SparkOpInstance6 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue from SparkOpInstance6 as instructed
    val _ = SparkOpInstance6.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
