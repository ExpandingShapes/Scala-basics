import org.scalatest.flatspec.AnyFlatSpec

class Task02Test extends AnyFlatSpec {
  "Task02" must "return true for a given palindrome with odd number of digits" in {
    assert(Task02.solution(121))
  }
  it must "return false for negative numbers" in {
    assert(!Task02.solution(-121))
  }
  it must "return false for a number ending with 0" in {
    assert(!Task02.solution(10))
  }
  it must "return false for a non-palindrome number with even number of digits" in {
    assert(!Task02.solution(4324))
  }
  it must "return false for a non-palindrome number with odd number of digits" in {
    assert(!Task02.solution(45853))
  }
  it must "return true for a given palindrome with even number of digits" in {
    assert(Task02.solution(432234))
  }
}
