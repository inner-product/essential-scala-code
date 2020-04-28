package fn
package firstorder

class FirstOrderTests extends munit.FunSuite {
  import FirstOrder._

  test("sumSquares") {
    assertEquals(sumSquares(3, 4), (3*3 + 4*4))
    assertEquals(sumSquares(5, 7), (5*5 + 7*7))
  }

  test("longer") {
    assertEquals(longer("fooo", "bar"), ("fooo"))
    assertEquals(longer("foo", "baaar"), ("baaar"))
  }

  test("factorial") {
    assertEquals(factorial(5), (5 * 4 * 3 * 2 * 1))
    assertEquals(factorial(3), (3 * 2 * 1))
    assertEquals(factorial(1), (1))
  }
}
