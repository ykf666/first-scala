object func_example {

  def hello(name: String): String = {
    s"Hello, ${name}!"
  }

  hello("yankefei")

  def hello2(name: String) = {
    s"Hello, ${name}"
  }

  hello2("ykf")

  def add(x: Int, y: Int) = x + y

  add(3, 5)
}