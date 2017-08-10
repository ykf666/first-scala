object toupe_map_example {

  (1, 2)

  1 -> 2

  val t = ("1", "Alice", "Math", 95.5)

  t._1

  t._2

  val a = List(1, 2, 3)

  def sumSq(in: List[Int]): (Int, Int, Int) =
    in.foldLeft((0, 0, 0))((t, v) => (t._1 + 1, t._2 + v, t._3 + v * v))

  sumSq(a)

  val p = Map(1 -> "David", 9 -> "Elwood")

  p(1)

  p.contains(9)

  p.contains(2)

  p.keys

  p.values

  p + (8 -> "Archer")

  p - 1

  p ++ List(2 -> "Alice", 5 -> "Bob")

  p -- List(1, 9, 2)

}
