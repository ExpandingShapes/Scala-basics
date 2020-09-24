/**
  * Given a set of unique integers, return all its permutations.
  */

object Task11 {
  def solution(nums: Array[Int]): List[List[Int]] = {
    def permutateList(list: List[Int]): List[List[Int]] =
      list match {
        //if there are no more elements, build a permutation
        case List(elem) => List(List(elem))
        case list =>
          for {
            i <- List.range(0, list.length)
            p <- permutateList(
              list.slice(0, i) ++ list.slice(i + 1, list.length)
            )
          } yield list(i) :: p
      }
    permutateList(nums.toList)
  }
}
