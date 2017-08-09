object recursion_example {

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

  factorial(5)

  @annotation.tailrec
  def factorial(n: Int, m: Int): Int =
    if (n <= 0) m
    else factorial(n - 1, m * n)

  factorial(5, 1)
}