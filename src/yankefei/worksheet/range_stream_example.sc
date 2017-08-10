object range_stream_example {

  //range就是一个整数序列
  1 to 10

  1 to 10 by 2

  (1 to 10).toList

  1 until 10

  //stream is a lazy list,惰性求值
  1 #:: 2 #:: 3 #:: Stream.empty

  val stream = (1 to 10000000).toStream

  stream.head

  stream.tail

}
