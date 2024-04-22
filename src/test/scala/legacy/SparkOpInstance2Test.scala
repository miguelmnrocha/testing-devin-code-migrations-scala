import org.scalatest.funsuite.AnyFunSuite
import subdomains.domainA.sparkops.SparkOpInstance2

class SparkOpInstance2Test extends AnyFunSuite {
  test("SparkOpInstance2: name should be dataset/spark-op-instance-2") {
    assert(SparkOpInstance2.name == "dataset/spark-op-instance-2")
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
