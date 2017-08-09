object try_match_example {

  val result_try = try {
    Integer.parseInt("dog")
  } catch {
    case _ => "0"
  } finally {
    println("always be printed")
  }

  val code = 9
  val result_match = code match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }

}