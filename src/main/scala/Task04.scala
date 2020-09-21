/***
  * Given a sorted Array[Int] and then rotated in an unknown point
  * e.g. [1, 2, 3, 4, 5, 6, 7] -> [4, 5, 6, 7, 1, 2, 3] and
  * a target value of type Int, search for target's index in the array.
  * Return -1 if the array does not contain target.
  * The array has no duplicates. Time complexity must be O(log n)
  */

import scala.annotation.tailrec

object Task04 {
  def solution(nums: Array[Int], target: Int): Int = {
    val isRotationPointInSecondHalf: (Int, Int) => Boolean =
      (lowIndex, midIndex) => nums(midIndex) >= nums(lowIndex)

    val isFirstHalfIncreasing: (Int, Int) => Boolean = (lowIndex, midIndex) =>
      nums(midIndex) > target && nums(lowIndex) <= target
    val isSecondHalfIncreasing: (Int, Int) => Boolean = (midIndex, highIndex) =>
      nums(midIndex) < target && nums(highIndex) >= target

    @tailrec
    def iter(lowIndex: Int, highIndex: Int): Int = {
      val midIndex = (lowIndex + highIndex) / 2
      if (nums(midIndex) == target) {
        //element found
        midIndex
      } else {
        if (lowIndex == midIndex && midIndex == highIndex) {
          //element not found
          -1
        } else {
          if (isRotationPointInSecondHalf(lowIndex, midIndex)) {
            if (isFirstHalfIncreasing(lowIndex, midIndex)) {
              //continue searching in the first half
              iter(lowIndex, midIndex - 1)
            } else {
              //continue searching in the second half
              iter(midIndex + 1, highIndex)
            }
          } else {
            //rotation point is in the first half
            if (isSecondHalfIncreasing(midIndex, highIndex)) {
              //continue searching in the second half
              iter(midIndex + 1, highIndex)
            } else {
              //continue searching in the first half
              iter(lowIndex, midIndex + 1)
            }
          }
        }
      }
    }
    //start searching in the whole array
    iter(0, nums.length - 1)
  }
}
