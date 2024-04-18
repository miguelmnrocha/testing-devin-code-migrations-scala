package testing_devin_code_migrations_scala

class HelloSpec extends munit.FunSuite {
  test("say hello") {
    assertEquals(testing_devin_code_migrations_scala.Hello.greeting, "hello")
  }
}
