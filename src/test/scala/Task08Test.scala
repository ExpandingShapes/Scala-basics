import org.scalatest.flatspec.AnyFlatSpec

class Task08Test extends AnyFlatSpec{
  "Task08" should "return 3 when given abcabcbb" in {
    assert(Task08.solution("abcabcbb") == 3)
  }
  it should "return 1 when given bbbbb" in {
    assert(Task08.solution("bbbbb") == 1)
  }
  it should "return 3 when given pwwkew" in {
    assert(Task08.solution("pwwkew") == 3)
  }
}
