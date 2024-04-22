import munit.FunSuite

class SparkOpNamingConventionTest extends FunSuite {

  test("SparkOp instances should follow naming conventions") {
    DAG.ops.foreach { sparkOp =>
      val name = sparkOp.name
      assert(
        name.matches("^dataset/.+-.+$") || name.matches("^nu-br/dataset/.+-.+$"),
        s"SparkOp name '${name}' does not follow the naming convention."
      )
    }
  }
}
