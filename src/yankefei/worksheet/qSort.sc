object qSort {

  def qSort(a: List[Int]): List[Int] =
    if (a.length < 2) a
    else
      qSort(a.filter(_ < a.head)) ++ a.filter(_ == a.head) ++
        qSort(a.filter(_ > a.head))

  qSort(List(3,5,2,1,8,4,6))
}