import org.scalatest.funsuite.AnyFunSuite
import legacy.SparkOpInstance3

class SparkOpInstance3Test extends AnyFunSuite {
  test("SparkOpInstance3: name should follow naming conventions") {
    assert(SparkOpInstance3.name.matches("^dataset/.+-.+$") || SparkOpInstance3.name.matches("^nu-br/dataset/.+-.+$"))
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
