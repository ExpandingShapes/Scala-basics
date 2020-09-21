import org.scalatest.flatspec.AnyFlatSpec

class Task03Test extends AnyFlatSpec {
  "Task03" must "return last word's length" in {
    assert(Task03.solution("Hello world") == 5)
  }
  it must "return 0 if string is empty" in {
    assert(Task03.solution("") == 0)
  }
  it must "return 0 if no last word found" in {
    assert(Task03.solution("Hello") == 0)
  }
}
