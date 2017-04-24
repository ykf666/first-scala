object partial_func_example {
  //偏函数
  val signal: PartialFunction[Int, Int] = {
    case x if x >= 1 => 1
    case x if x <= -1 => -1
  }
  signal.isDefinedAt(0)
  signal.isDefinedAt(1)
  signal.apply(1)
  signal(-1)

  val composed_signal: PartialFunction[Int, Int] = signal.orElse {
    case 0 => 0
  }
  composed_signal(0)

  val new_signal: Function[Int, Int] = composed_signal.compose {
    case x => x - 1
  }
  new_signal(1)
  new_signal(0) //返回-1
  new_signal(2)
  // throw exception


  val another_signal: PartialFunction[Int, Int] = {
    case 0 => 0
    case x if x > 0 => x - 1
    case x if x < 0 => x + 1
  }
  val then_signal = another_signal andThen signal
  then_signal(2)

  //偏应用函数
  def sum(a: Int, b: Int, c: Int) = a + b + c

  sum(1, 2, 3)

  val x = sum(2, _: Int, 3)
  x(3)
}