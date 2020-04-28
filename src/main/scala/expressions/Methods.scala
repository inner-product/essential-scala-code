package expressions

object Methods {
  def palindrome(str: String): Boolean =
    str == str.reverse

  def greeting(name: String): String =
    s"Hello $name!"

  def factorial(n: Int): Int =
    if(n == 0 || n == 1) 1 else n * factorial(n - 1)
}

object Main extends App {
  import Methods._

  println(s"""palindrome("taco") == ${palindrome("taco")}""")
  println(s"""greeting("Earthlings") == ${greeting("Earthlings")}""")
  println(s"""factorial(10) == ${factorial(10)}""")
}
