package intro

class HelloWorldTests extends munit.FunSuite {
  test("greeting message") {
    assertEquals(HelloWorld.message, "Hello world!")
  }
}
