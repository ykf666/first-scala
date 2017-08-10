object collection_list_map {
  val a = List(1, 2, 3, 4)

  val b = 0 :: a

  val c = "x" :: "y" :: "z" :: Nil

  val d = a ::: c

  a.head

  a.tail

  a.isEmpty

  def walkthru(l: List[Int]): String = {
    if (l.isEmpty) ""
    else l.head + " " + walkthru(l.tail)
  }

  walkthru(a)

  a.filter(x => x % 2 == 1)

  val e = "99 Red Ball".toList

  e.filter(x => Character.isDigit(x))

  e.takeWhile(x => x != 'B')

  c.map(x => x.toUpperCase())

  c.map(_.toUpperCase())

  a.filter(_ % 2 == 1)

  a.filter(_ % 2 == 1).map(_ + 10)

  val q = List(a, List(4, 5, 6))

  q.map(_.filter(_ % 2 == 0))

  q.flatMap(_.filter(_ % 2 == 0))

  val p = List(1, 2, 3)

  p.reduceLeft((x, y) => x + y)

  p.reduce(_ + _)

  p.foldLeft(0)(_ + _)

  p.foldLeft(1)(_ * _)

}