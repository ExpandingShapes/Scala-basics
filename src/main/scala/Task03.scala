object Task03 extends App {
  //return 0 if the string is empty or
  // no whitespaces found which means there is one and only word
  def solution(s: String): Int = if(s.isEmpty || !s.exists(_.isWhitespace)) 0 else
    s.length - s.lastIndexWhere(_.isWhitespace) - 1
}
