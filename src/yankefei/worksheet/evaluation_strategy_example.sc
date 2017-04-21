object evaluation_strategy_example {
  def test1(x: Int, y: Int): Int = x * x

  def test2(x: => Int, y: => Int): Int = x * x

  test1(3 + 4, 8)
  test2(3 + 4, 8)

  test1(7, 2 * 4)
  test2(7, 2 * 4)

  def bar(x: Int, y: => Int): Int = 1

//  def loop(): Int = loop

//  bar(1, loop)
//  bar(loop, 1)
}