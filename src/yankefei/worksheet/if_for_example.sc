object if_for_example {

  val l = List("Jack", "David", "Lucy")

  for {
    s <- l //generator
  } println(s)

  for {
    s <- l
    if (s.length > 4) //filter
  } println(s)

  val result_for = for {
    s <- l
    s1 = s.toUpperCase()
    if (s1 != "")
  } yield (s1)
}