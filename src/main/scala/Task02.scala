import scala.annotation.tailrec

object Task02 extends App {
  def solution(x: Int): Boolean = {
    val DIVIDE_FOR_MAX_INT = 1000000000
    @tailrec
    def checkTwoEdgeDigits(x: Int, dividedBy: Int): Boolean = {
      x / dividedBy match {
        case 0 if x > 10 =>
          checkTwoEdgeDigits(x, dividedBy / 10)
        case 0 => true
        case n if n == x % 10 =>
          checkTwoEdgeDigits(x % dividedBy / 10, dividedBy / 10)
        case n if n != x % 10 => false
      }
    }
    //negative numbers and numbers ending with 0 can't be palindromes
    if(x < 0 || x % 10 == 0) false else checkTwoEdgeDigits(x, DIVIDE_FOR_MAX_INT)
  }
}
