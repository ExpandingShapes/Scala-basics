import org.scalatest.flatspec.AnyFlatSpec

class Task15Test extends AnyFlatSpec {
  "Task15" must "return 1" in {
    assert {
      val grid1 = Array(
        Array('1', '1', '1', '1', '0'),
        Array('1', '1', '0', '1', '0'),
        Array('1', '1', '0', '0', '0'),
        Array('0', '0', '0', '0', '0')
      )
      Task15.solution(grid1) == 1
    }
  }
  it must "return 3" in {
    assert {
      val grid2 = Array(
        Array('1', '1', '0', '0', '0'),
        Array('1', '1', '0', '0', '0'),
        Array('0', '0', '1', '0', '0'),
        Array('0', '0', '0', '1', '1')
      )
      Task15.solution(grid2) == 3
    }
  }
}
