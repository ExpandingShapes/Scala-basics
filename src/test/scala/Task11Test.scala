import org.scalatest.flatspec.AnyFlatSpec

class Task11Test extends AnyFlatSpec {
  "Task11" must "return list of 6 elements which are:" in {
    val nums = Array(1, 2, 3)
    val res = List(
      List(1, 2, 3),
      List(1, 3, 2),
      List(2, 1, 3),
      List(2, 3, 1),
      List(3, 1, 2),
      List(3, 2, 1)
    )
    assert(Task11.solution(nums) == res)
  }
}
