import org.scalatest.flatspec.AnyFlatSpec

class Task03Test extends AnyFlatSpec{
  "Task3" should "return last word's length" in {
    assert(Task03.solution("Hello world") == 5)
  }
  it should "return 0 if string is empty" in {
    assert(Task03.solution("") == 0)
  }
  it should "return 0 if no last word found" in {
    assert(Task03.solution("Hello") == 0)
  }
}
