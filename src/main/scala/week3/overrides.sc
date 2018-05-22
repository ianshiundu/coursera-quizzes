abstract class Base {
  def foo = 2
  def bar: Int
}

class Sub extends Base {
  override def foo: Int = 2
  def bar = 3
}