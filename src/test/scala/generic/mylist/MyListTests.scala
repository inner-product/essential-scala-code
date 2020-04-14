package generic.mylist

class MyListSpec extends munit.FunSuite {
  // val ints    = MyPair(1, MyPair(3, MyPair(5, MyNil())))
  // val strings = MyPair("foo", MyPair("bar", MyPair("baz", MyNil())))

  test("myList.exists".ignore) {
    // assertEquals(ints.exists(_ > 0), (true))
    // assertEquals(ints.exists(_ < 0), (false))
    // assertEquals(ints.exists(_ % 2 == 0), (false))
    // assertEquals(ints.exists(_ % 2 == 1), (true))
  }

  test("myList.filter".ignore) {
    // assertEquals(ints.filter(_ > 0), (ints))
    // assertEquals(ints.filter(_ < 0), (MyNil()))
    // assertEquals(ints.filter(_ > 3), (MyPair(5, MyNil())))
  }

  test("myList.find".ignore) {
    // assertEquals(ints.find(_ > 0), (MySome(1)))
    // assertEquals(ints.find(_ < 0), (MyNone))
    // assertEquals(ints.find(_ > 3), (MySome(5)))
  }

  test("myList.map on integers".ignore) {
    // val actual   = ints.map(_ + 1)
    // val expected = MyPair(2, MyPair(4, MyPair(6, MyNil())))
    // assertEquals(actual, (expected))
  }

  test("myList.map on strings".ignore) {
    // val actual   = strings.map(_ + "!")
    // val expected = MyPair("foo!", MyPair("bar!", MyPair("baz!", MyNil())))
    // assertEquals(actual, (expected))
  }

  test("myList.flatMap on integers".ignore) {
    // val actual   = ints.flatMap(x => MyPair(x, MyPair(x * 10, MyNil())))
    // val expected = MyPair(1, MyPair(10, MyPair(3, MyPair(30, MyPair(5, MyPair(50, MyNil()))))))
    // assertEquals(actual, (expected))
  }

  test("myList.flatMap on strings".ignore) {
    // val actual   = strings.flatMap(x => MyPair(x, MyPair(x + "!", MyNil())))
    // val expected = MyPair("foo", MyPair("foo!", MyPair("bar", MyPair("bar!", MyPair("baz", MyPair("baz!", MyNil()))))))
    // assertEquals(actual, (expected))
  }

  test("myList.foldLeft".ignore) {
    // assertEquals(ints.foldLeft(10)(_ + _), (19))
    // assertEquals(strings.foldLeft("nil")(_ + _), ("nilfoobarbaz"))
  }

  test("myList.foldRight".ignore) {
    // assertEquals(ints.foldLeft(10)(_ + _), (19))
    // assertEquals(strings.foldRight("nil")(_ + _), ("foobarbaznil"))
  }

  test("myOption.map on MySom".ignore) {
    // val actual   = MySome(41).map(_ + 1)
    // val expected = MySome(42)
    // assertEquals(actual, (expected))
  }

  test("myOption.map on MyNone".ignore) {
    // val actual   = MyNone[Int]().map(_ + 1)
    // val expected = MyNone()
    // assertEquals(actual, (expected))
  }

  test("myOption.flatMap on MySome".ignore) {
    // val actual = for {
    //   x <- MySome(10)
    //   y <- MySome(32)
    // } yield x + y
    // val expected = MySome(42)
    // assertEquals(actual, (expected))
  }

  test("myOption.flatMap on MyNone".ignore) {
    // val actual = for {
    //   x <- MyNone[Int]()
    //   y <- MySome(32)
    // } yield x + y
    // val expected = MyNone()
    // assertEquals(actual, (expected))
  }
}
