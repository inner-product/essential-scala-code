package adt.shape

final case class Color(red: Double, green: Double, blue: Double) {
  def lightness: Double =
    (red + green + blue) / 3.0

  def lighterThan(c: Color): Boolean =
    lightness > c.lightness
}

sealed trait Shape {
  def color: Color
}

object Shape {
  def area(s: Shape): Double =
    s match {
      case Circle(r, _)  => r * r * math.Pi
      case Rect(w, h, _) => w * h
    }
}

final case class Circle(radius: Double, color: Color)
  extends Shape

final case class Rect(width: Double, height: Double, color: Color)
  extends Shape

object Main extends App {
  val shape1 = Circle(10, Color(1, 0, 0))
  val shape2 = Rect(3, 5, Color(0, 1, 0))

  println(s"$shape1 ${Shape.area(shape1)}")
  println(s"$shape2 ${Shape.area(shape2)}")
}
