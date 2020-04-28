package generic.mylist

sealed trait MyOption[A] {
  def map[B](func: A => B): MyOption[B] =
    this match {
      case MySome(value) => MySome(func(value))
      case MyNone()      => MyNone()
    }

  def flatMap[B](func: A => MyOption[B]): MyOption[B] =
    this match {
      case MySome(value) => func(value)
      case MyNone()      => MyNone()
    }
}

final case class MySome[A](value: A) extends MyOption[A]
final case class MyNone[A]() extends MyOption[A]

sealed trait MyList[A] {
  def exists(func: A => Boolean): Boolean =
    this match {
      case MyPair(head, tail) =>
        func(head) || tail.exists(func)

      case MyNil() => false
    }

  def filter(func: A => Boolean): MyList[A] =
    this match {
      case MyPair(head, tail) =>
        if(func(head)) {
          MyPair(head, tail.filter(func))
        } else {
          tail.filter(func)
        }

      case MyNil() => MyNil()
    }

  def find(func: A => Boolean): MyOption[A] =
    this match {
      case MyPair(hear, tail) =>
        if(func(hear)) {
          MySome(hear)
        } else {
          tail.find(func)
        }

      case MyNil() => MyNone()
    }

  def append(that: MyList[A]): MyList[A] =
    this match {
      case MyPair(hear, tail) =>
        MyPair(hear, tail append that)
      case MyNil() => that

    }

  def map[B](func: A => B): MyList[B] =
    this match {
      case MyPair(hear, tail) =>
        MyPair(func(hear), tail.map(func))

      case MyNil() => MyNil()

    }

  def flatMap[B](func: A => MyList[B]): MyList[B] =
    this match {
      case MyPair(head, tail) =>
        func(head) append tail.flatMap(func)

      case MyNil() => MyNil()

    }

  def foldLeft[B](memo: B)(func: (B, A) => B): B =
    this match {
      case MyPair(head, tail) =>
        tail.foldLeft(func(memo, head))(func)

      case MyNil() => memo
    }

  def foldRight[B](memo: B)(func: (A, B) => B): B =
    this match {
      case MyPair(head, tail) =>
        func(head, tail.foldRight(memo)(func))

      case MyNil() => memo
    }
}

final case class MyPair[A](head: A, tail: MyList[A]) extends MyList[A]

final case class MyNil[A]() extends MyList[A]

object Main extends App {
  val ints = MyPair(1, MyPair(3, MyPair(5, MyNil())))
  val strs = MyPair("foo", MyPair("bar", MyPair("baz", MyNil())))

  println(s"""$ints.exists(_ > 1)               == ${ints.exists(_ > 1)}""")
  println(s"""$ints.filter(_ > 1)               == ${ints.filter(_ > 1)}""")
  println(s"""$ints.find(_ > 1)                 == ${ints.find(_ > 1)}""")

  println(s"""$strs.exists(_.head == 'b') == ${strs.exists(_.head == 'b')}""")
  println(s"""$strs.filter(_.head == 'b') == ${strs.filter(_.head == 'b')}""")
  println(s"""$strs.find(_.head == 'b')   == ${strs.find(_.head == 'b')}""")

  def add(ints: MyList[Int], num: Int): MyList[Int] =
    ints.map(_ + num)

  println(s"""add($ints, 1))                    == ${add(ints, 1)}""")
  println(s"""$strs.map(_ + "!"))         == ${strs.map(_ + "!")}""")

  def processInt(x: Int): MyList[Int] =
    MyPair(x, MyPair(x * 10, MyNil()))

  def processStr(x: String): MyList[String] =
    MyPair(x, MyPair(x + "!", MyNil()))

  println(s"""$ints.flatMap(processInt)         == ${ints.flatMap(processInt)}""")
  println(s"""$strs.flatMap(processStr)   == ${strs.flatMap(processStr)}""")

  println(s"""$ints.foldLeft(0)(_ + _))         == ${ints.foldLeft(0)(_ + _)}""")
  println(s"""$ints.foldRight(0)(_ + _))        == ${ints.foldRight(0)(_ + _)}""")

  println(s"""$strs.foldLeft("")(_ + _))  == ${strs.foldLeft("")(_ + _)}""")
  println(s"""$strs.foldRight("")(_ + _)) == ${strs.foldRight("")(_ + _)}""")
}
