import org.scalatest.flatspec.AnyFlatSpec

class Task04Test extends AnyFlatSpec {
  "Task04" must "return 4" in {
    assert(Task04.solution(Array(4, 5, 6, 7, 0, 1, 2), 0) == 4)
  }
  it must "return -1 when the target element not found in the array" in {
    assert(Task04.solution(Array(4, 5, 6, 7, 0, 1, 2), 3) == -1)
  }
}
