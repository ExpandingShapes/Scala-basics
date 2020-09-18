import org.scalatest.flatspec.AnyFlatSpec

class Task01Test extends AnyFlatSpec{
  "Task01" should "return indexes of array elements which sum is target parameter" in {
    assert(Task01.solution(Array(2, 7, 11, 15), 9) sameElements Array(0, 1))
  }
  it should "return Array(-1, -1) if the given array is empty" in {
    assert(Task01.solution(Array.empty, 0) sameElements Array(-1, -1))
  }
  it should "return Array(-1, -1) if no corresponding elements found" in {
    assert(Task01.solution(Array(6, 7, 5), 8) sameElements Array(-1, -1))
  }
  it should "return element indexes when target < 0" in {
    assert(Task01.solution(Array(5, 24, 44, -54), -10) sameElements Array(2, 3))
  }
  it should "return element indexes when an element < 0" in {
    assert(Task01.solution(Array(-7, 17, 65, 6), 10) sameElements Array(0, 1))
  }
  it should "return elements indexes when both of them < 0" in {
    assert(Task01.solution(Array(-5, -2, 5, 6), -7) sameElements Array(0, 1))
  }
  it should "return element indexes when target == 0" in {
    assert(Task01.solution(Array(0, 0), 0) sameElements Array(0, 1))
  }
}
