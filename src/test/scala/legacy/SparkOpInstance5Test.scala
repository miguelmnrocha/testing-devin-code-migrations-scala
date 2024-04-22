import org.scalatest.funsuite.AnyFunSuite
import legacy.SparkOpInstance5

class SparkOpInstance5Test extends AnyFunSuite {
  test("SparkOpInstance5: name should follow naming conventions") {
    assert(SparkOpInstance5.name.matches("^dataset/.+-.+$") || SparkOpInstance5.name.matches("^nu-br/dataset/.+-.+$"))
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
