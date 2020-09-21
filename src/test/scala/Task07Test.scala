import org.scalatest.flatspec.AnyFlatSpec

class Task07Test extends AnyFlatSpec {
  "Task07" should "return true when an array end is reachable" in {
    assert(Task07.solution(Array(2, 3, 1, 1, 4)))
  }
  it should "return false when an array end is unreachable" in {
    assert(!Task07.solution(Array(3, 2, 1, 0, 4)))
  }
}
