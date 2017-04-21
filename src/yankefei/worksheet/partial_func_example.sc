object partial_func_example {
  val signal: PartialFunction[Int, Int] = {
    case x if x > 1 => 1
    case x if x < -1 => -1
  }

  signal.isDefinedAt(0)
  signal.apply(2)
}