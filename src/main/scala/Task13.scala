/**
  * Given a string containing digits only, return
  * all possible combinations of IP addresses
  */

object Task13 {
  def solution(s: String): List[String] = {
    //remove zeros in front of s
    val filteredS = s.dropWhile(c => c == '0')
    def snapshot(
        res: List[String],
        string: String,
        index: Int,
        path: Array[Int],
        segment: Int
    ): List[String] = {
      if (segment == 4 && index == string.length) {
        s"${path.mkString(".")}" :: res
      } else if (segment == 4 || index == string.length) {
        res
      }
      res
//      var len = 1
//      while (len <= 3 && index + len <= string.length) {
//        if (num > 255 || len >= 2 && (string.charAt(index) eq '0'))
//          break
//      }

//      for (len <- 1 to 3 if index + len <= string.length) {
//        val snap: String = string.substring(index, index + len)
//        val num: Int = snap.toInt
//        //if (num > 255 || len >= 2 && string.charAt(index) == '0') {} //br}
//        path(segment) = num
//        snapshot(res, string, index + len, path, segment + 1)
//        path(segment) = -1
//      }

      //res
    }
    if (filteredS.length < 3 || filteredS.length > 12) {
      List.empty
    } else {
      snapshot(List.empty, filteredS, 0, Array[Int](4), 0)
    }
  }
}
