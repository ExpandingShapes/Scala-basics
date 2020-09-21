import scala.annotation.tailrec

/**
 * Input is Array[Int] and target: Int. Find in the array two numbers
 * whose sum equals target and return their indexes in a new array.
 * For every input, there is only one solution.
 * Using the same array element twice is not allowed.
 */

object Task01 {
  def solution(nums: Array[Int], target: Int): Array[Int] = {
    @tailrec
    def checkSum(array: Array[Int], n: Option[Int]):  Array[Int] = {
      n match {
        case Some(n) if array.exists(x => x + n == target) =>
          Array(nums.indexOf(n), nums.lastIndexOf(target - n))
        case Some(_) => checkSum(array.drop(1), array.headOption)
        case None => Array(-1, -1)
      }
    }
    checkSum(nums.drop(1), nums.headOption)
  }
}
