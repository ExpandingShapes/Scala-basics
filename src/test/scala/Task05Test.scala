import org.scalatest.flatspec.AnyFlatSpec

class Task05Test extends AnyFlatSpec {
  "Task05" must "return list of 8 lists" in {
    val nums = Array(1, 2, 3)
    val res = List(
      List(3),
      List(1),
      List(2),
      List(1, 2, 3),
      List(1, 3),
      List(2, 3),
      List(1, 2),
      List()
    )
    assert(Task05.solution(nums) == res)
  }
}
