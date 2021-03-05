package generic.mylist

// TODO: Implement MyList

object Main extends App {
  // val ints = MyPair(1, MyPair(3, MyPair(5, MyNil())))
  // val strs = MyPair("foo", MyPair("bar", MyPair("baz", MyNil())))

  // println(ints.toString + """.exists(_ > 1)         == """ + ints.exists(_ > 1))
  // println(ints.toString + """.filter(_ > 1)         == """ + ints.filter(_ > 1))
  // println(ints.toString + """.find(_ > 1)           == """ + ints.find(_ > 1))

  // println(strs.toString + """.exists(_.head == 'b')   == """ + strs.exists(_.head == 'b'))
  // println(strs.toString + """.filter(_.head == 'b')   == """ + strs.filter(_.head == 'b'))
  // println(strs.toString + """.find(_.head == 'b')     == """ + strs.find(_.head == 'b'))

  // def add(ints: MyList[Int], num: Int): MyList[Int] =
  //   ???

  // println("""add(""" + ints + """, 1))     == """ + add(ints, 1))
  // println(strs.toString + """.map(_ + "!"))         == """ + strs.map(_ + "!"))

  // def processInt(x: Int): MyList[Int] =
  //   MyPair(x, MyPair(x * 10, MyNil()))

  // def processStr(x: String): MyList[String] =
  //   MyPair(x, MyPair(x + "!", MyNil()))

  // println(ints.toString + """.flatMap(processInt)   == """ + ints.flatMap(processInt))
  // println(strs.toString + """.flatMap(processStr)   == """ + strs.flatMap(processStr))

  // println(ints.toString + """.foldLeft(0)(_ + _))   == """ + ints.foldLeft(0)(_ + _))
  // println(ints.toString + """.foldRight(0)(_ + _))  == """ + ints.foldRight(0)(_ + _))

  // println(strs.toString + """.foldLeft("")(_ + _))  == """ + strs.foldLeft("")(_ + _))
  // println(strs.toString + """.foldRight("")(_ + _)) == """ + strs.foldRight("")(_ + _))
}
