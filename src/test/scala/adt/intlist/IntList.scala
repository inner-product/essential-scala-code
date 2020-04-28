package adt
package intlist

class IntListTests extends munit.FunSuite {
  val ints = IntPair(1, IntPair(2, IntPair(3, IntNil())))

  test("contains") {
    assertEquals(ints.contains(1), true)
    assertEquals(ints.contains(5), false)
  }

  test("add") {
    assertEquals(IntNil().add(4), IntNil())
    assertEquals(ints.add(5), IntPair(6, IntPair(7, IntPair(8, IntNil()))))
  }

  test("total") {
    assertEquals(IntNil().total, 0)
    assertEquals(ints.total, 6)
  }
}
