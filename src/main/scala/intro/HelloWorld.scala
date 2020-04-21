package intro

import cats.implicits._
import doodle.core._
import doodle.core.font._
import doodle.interact.syntax._
import doodle.syntax._
import doodle.java2d._

// If we were boring we would print "Hello, world!" to the console. We aren't boring.
object HelloWorld extends App {
  val monospaced = Font(
    FontFamily.monospaced,
    FontStyle.normal,
    FontWeight.bold,
    FontSize.points(36)
  )
  val hi = text[Algebra, Drawing]("Hello, world!").font(monospaced)

  (0.degrees
    .upTo(360.degrees))
    .forSteps(60)
    .map { angle =>
      // Construct a drop shadow under the words
      hi.strokeColor(Color.hsl(angle, 0.7, 0.7))
        .on(hi.strokeColor(Color.black).at(5, angle))
    }
    .repeatForever
    .animate(Frame.size(400, 400))
}
