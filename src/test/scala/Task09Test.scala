import org.scalatest.flatspec.AnyFlatSpec

class Task09Test extends AnyFlatSpec {
  "Task09" must "return false for s = aa, p = a" in {
    assert(!Task09.solution("aa", "a"))
  }
  it must "return true for s = aa, p = a*" in {
    assert(Task09.solution("aa", "a*"))
  }
  it must "return true for s = ab, p = .*" in {
    assert(Task09.solution("ab", ".*"))
  }
  it must "return true for s = aab, p = c*a*b" in {
    assert(Task09.solution("aab", "c*a*b"))
  }
  it must "return false for s = mississippi, p = mis*is*p*." in {
    assert(!Task09.solution("mississippi", "mis*is*p*."))
  }
}
