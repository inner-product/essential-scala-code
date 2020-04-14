package expressions

class MethodTests extends munit.FunSuite {
  test("greeting".ignore) {
    assertEquals(Methods.greeting("Essential Scala"), "Hello Essential Scala!")
    assertEquals(Methods.greeting("Noel"), "Hello Noel!")
  }

  test("palindrome".ignore) {
    assertEquals(Methods.palindrome("tacocat"), true)
    assertEquals(Methods.palindrome("purrito"), false)
  }

  test("factorial".ignore) {
    assertEquals(Methods.factorial(1), 1)
    assertEquals(Methods.factorial(2), 2)
    assertEquals(Methods.factorial(3), 6)
    assertEquals(Methods.factorial(4), 24)
    assertEquals(Methods.factorial(5), 120)
  }
}
