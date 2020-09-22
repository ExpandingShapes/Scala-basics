import scala.annotation.tailrec

/**
  * Input is Array[Int] of non-negative numbers.
  * You stand at the first array element. An element represents
  * your maximum jump from your current position. Figure out if
  * you can reach the end of the array.
  */

object Task07 {
  def solution(nums: Array[Int]): Boolean = {
    @tailrec
    def iter(maxJump: Int, nums: Array[Int]): Boolean = {
      //We have reached the end
      if (nums.length == 1) {
        true
      } else {
        if ((nums.head max (maxJump - 1)) != 0) {
          //We still can jump. Jump by one
          iter(nums.head max maxJump - 1, nums.tail)
        } else {
          false
        }
      }
    }

    if (nums.isEmpty || nums(0) == 0) {
      false
    } else {
      iter(nums.head, nums.tail)
    }
  }
}
