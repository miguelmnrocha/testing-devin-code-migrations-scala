import org.scalatest.funsuite.AnyFunSuite
import legacy.SparkOpInstance20

class SparkOpInstance20Test extends AnyFunSuite {
  test("SparkOpInstance20: name should be dataset/spark-op-instance-20") {
    assert(SparkOpInstance20.name == "dataset/spark-op-instance-20")
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
