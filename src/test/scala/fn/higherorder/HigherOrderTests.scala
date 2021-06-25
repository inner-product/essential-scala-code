package fn
package higherorder

class HigherOrderSpec extends munit.FunSuite {
  val ints = IntPair(1, IntPair(3, IntPair(5, IntNil())))

  test("intList.exists".ignore) {
    // assertEquals(ints.exists(_ > 0), (true))
    // assertEquals(ints.exists(_ < 0), (false))
    // assertEquals(ints.exists(_ % 2 == 0), (false))
    // assertEquals(ints.exists(_ % 2 == 1), (true))
  }

  test("intList.filter".ignore) {
    // assertEquals(ints.filter(_ > 0), (ints))
    // assertEquals(ints.filter(_ < 0), (IntNil()))
    // assertEquals(ints.filter(_ > 3), (IntPair(5, IntNil())))
  }

  test("intList.find".ignore) {
    // assertEquals(ints.find(_ > 0), (IntSome(1)))
    // assertEquals(ints.find(_ < 0), (IntNone()))
    // assertEquals(ints.find(_ > 3), (IntSome(5)))
  }
}
