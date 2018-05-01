//(x: Int, y: Int) => x + y

// equivalent

{ def f(x: Int, y: Int) = x + y; f(5,2) }

def sumBetweenIntervals(f: Int ⇒ Int, a: Int, b: Int): Int = {
  if (a > b) 0
  else f(a) + sumBetweenIntervals(f, a + 1, b)
}

def sumOfCubes(a: Int, b: Int) =  sumBetweenIntervals(x ⇒ x * x * x, a, b);sumOfCubes(2,3)

def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a, 0)
} ; sum(x ⇒ x * x, 3, 5)