def sum(f: Int ⇒ Int): (Int, Int) => Int = {
  def sumF(a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sumF(a + 1, b)
  }
  sumF
}

def sumOfCubes(a: Int, b: Int) =  sum(x ⇒ x * x * x)

// syntactic sugar for sum function

def sum2(f: Int ⇒ Int)(a: Int, b: Int): Int = {
  if (a > b) 0 else f(a) + sum2(f)(a + 1, b)
}

def product(f: Int ⇒ Int)(a: Int, b: Int): Int = {
  if(a > b ) 1 else f(a) * product(f)(a + 1, b)
}
product(x⇒ x * x)(3,4)

def factorial(n: Int) = product(x ⇒ x)(1, n)

factorial(5)

def mapReduce(f: Int ⇒ Int, combine: (Int, Int) ⇒ Int, zero: Int)(a: Int, b: Int): Int = {
  if (a > b) zero else combine(f(a), mapReduce(f, combine,zero)(a+1, b))
}

//product now becomes

def product1(f: Int ⇒ Int)(a: Int, b: Int): Int = mapReduce(f, (x,y)⇒ x * y, 1)(a,b)

product1(x ⇒ x * x)(3, 4)