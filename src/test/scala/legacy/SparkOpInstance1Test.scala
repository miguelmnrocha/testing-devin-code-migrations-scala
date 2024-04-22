import org.scalatest.funsuite.AnyFunSuite
import subdomains.domainA.sparkops.SparkOpInstance1

class SparkOpInstance1Test extends AnyFunSuite {
  test("SparkOpInstance1: name should follow naming conventions") {
    assert(SparkOpInstance1.name.matches("^dataset/.+-.+$") || SparkOpInstance1.name.matches("^nu-br/dataset/.+-.+$"))
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
