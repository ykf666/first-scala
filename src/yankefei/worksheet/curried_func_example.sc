object curried_func_example {
  def curriedAdd(a: Int)(b: Int) = a + b

  curriedAdd(2)(2)

  val addOne = curriedAdd(1) _
  addOne(2)
}