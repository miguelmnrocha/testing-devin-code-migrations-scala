import munit.FunSuite
import platform.common_classes.SparkOp

class SparkOpNamingConventionTest extends FunSuite {

  // Assuming SparkOp instances have a 'name' method returning the name of the dataset
  // and that they are objects, not classes, so they can be referenced directly
  val sparkOpInstances: Set[SparkOp] = Set(
    legacy.SparkOpInstance1,
    legacy.SparkOpInstance2,
    legacy.SparkOpInstance3,
    legacy.SparkOpInstance4,
    legacy.SparkOpInstance5,
    legacy.SparkOpInstance6,
    legacy.SparkOpInstance7,
    legacy.SparkOpInstance8,
    legacy.SparkOpInstance9,
    legacy.SparkOpInstance10,
    legacy.SparkOpInstance11,
    legacy.SparkOpInstance12,
    legacy.SparkOpInstance13,
    legacy.SparkOpInstance14,
    legacy.SparkOpInstance15,
    legacy.SparkOpInstance16,
    legacy.SparkOpInstance17,
    legacy.SparkOpInstance18,
    legacy.SparkOpInstance19,
    legacy.SparkOpInstance20
  )

  test("SparkOp instances should follow naming conventions") {
    sparkOpInstances.foreach { sparkOp =>
      val name = sparkOp.name
      assert(
        name.matches("^dataset/.+-.+$") || name.matches("^nu-br/dataset/.+-.+$"),
        s"SparkOp name '\$name' does not follow the naming convention."
      )
    }
  }
}
