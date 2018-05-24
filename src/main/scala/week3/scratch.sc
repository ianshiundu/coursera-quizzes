import week3._

object scratch {
//  new Rational(1, 2)

  def error(msg: String) = throw new Error(msg)

  error("test")

}

val x = null
val y: String = x
//Null is incompatible with subTypes of AnyVal e.g Int