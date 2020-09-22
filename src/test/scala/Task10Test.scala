import org.scalatest.flatspec.AnyFlatSpec

class Task10Test extends AnyFlatSpec {
  "Task10" must "return rotated 3 x 3 array" in {
    val matrix1 = Array(
      Array(1, 2, 3),
      Array(4, 5, 6),
      Array(7, 8, 9)
    )
    val res1 = Array(
      Array(7, 4, 1),
      Array(8, 5, 2),
      Array(9, 6, 3)
    )
    assert(
      Task10.solution(matrix1).map(_.mkString(",")).mkString("|") ==
        res1.map(_.mkString(",")).mkString("|")
    )
  }
  it must "return rotated 4 x 4 array" in {
    val matrix2 = Array(
      Array(5, 1, 9, 11),
      Array(2, 4, 8, 10),
      Array(13, 3, 6, 7),
      Array(15, 14, 12, 16)
    )
    val res2 = Array(
      Array(15, 13, 2, 5),
      Array(14, 3, 4, 1),
      Array(12, 6, 8, 9),
      Array(16, 7, 10, 11)
    )
    assert(
      Task10.solution(matrix2).map(_.mkString(",")).mkString("|") ==
        res2.map(_.mkString(",")).mkString("|")
    )
  }
}
