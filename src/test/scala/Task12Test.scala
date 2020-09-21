import org.scalatest.flatspec.AnyFlatSpec

class Task12Test extends AnyFlatSpec {
  "Task12" must "return true for 0" in {
    assert(Task12.solution("0"))
    it must "return true for 0.1" in {
      assert(Task12.solution("0.1"))
    }
    it must "return false for abc" in {
      assert(!Task12.solution("abc"))
    }
    it must "return false for 1a" in {
      assert(!Task12.solution("1a"))
    }
    it must "return true for 2e10" in {
      assert(Task12.solution("2e10"))
    }
    it must "return true for -90e3" in {
      assert(Task12.solution("-90e3"))
    }
    it must "return false for 1e" in {
      assert(!Task12.solution("1e"))
    }
    it must "return false for e3" in {
      assert(!Task12.solution("e3"))
    }
    it must "return true for 6e-1" in {
      assert(Task12.solution("6e-1"))
    }
    it must "return false for 99e2.5" in {
      assert(!Task12.solution("99e2.5"))
    }
    it must "return true for 53.5e93" in {
      assert(Task12.solution("53.5e93"))
    }
    it must "return false for --6" in {
      assert(!Task12.solution("--6"))
    }
    it must "return false for -+3" in {
      assert(!Task12.solution("-+3"))
    }
    it must "return false for 95a54e53" in {
      assert(!Task12.solution("95a54e53"))
    }
  }
}
