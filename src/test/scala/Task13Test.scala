import org.scalatest.flatspec.AnyFlatSpec

class Task13Test extends AnyFlatSpec {
  "Task13" must "return two IP adresses" in {
    val s = "25525511135"
    val res = List("255.255.11.135", "255.255.111.35")
    assert(Task13.solution(s) == res)
  }
}
