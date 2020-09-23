/**
  * Given a string containing digits only, return
  * all possible combinations of IP addresses
  */

object Task13 {
  def solution(s: String): List[String] = {
    def iter(s: String, segmentsLeft: Int): List[String] = {
      //are there too few/many chars in s to be an IP address?
      if (s.length < segmentsLeft || s.length > segmentsLeft * 3) {
        Nil
      } else if (segmentsLeft == 1) {
        s :: Nil
      } else {
        (1 to 3)
          .flatMap(n =>
            iter(s.drop(n), segmentsLeft - 1)
              .filter(_ => s.take(n).toInt <= 255)
              .map(i => s"${s.take(n)}.$i")
          )
          .toList
      }
    }
    iter(s, 4)
  }
}
