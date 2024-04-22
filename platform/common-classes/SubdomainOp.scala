import org.apache.spark.sql.DataFrame

trait SubdomainOp {
  def name: String
  def inputs: Set[String]
  def query(inputs: Map[String, DataFrame]): DataFrame
}
