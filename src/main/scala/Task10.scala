/**
  * Input is n x n 2D matrix (two dimensional array).
  * Turn it 90 degrees clockwise. The given matrix must be changed,
  * creating a new 2D matrix is not allowed.
  */

object Task10 {
  def solution(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val length = matrix.length
    //def
    for (i <- 0 until length / 2) {
      for (j <- i until length - i - 1) {
        //swap elements of each cycle
        val temp: Int = matrix(i)(j)
        matrix(i)(j) = matrix(length - 1 - j)(i)
        matrix(length - 1 - j)(i) = matrix(length - 1 - i)(length - 1 - j)
        matrix(length - 1 - i)(length - 1 - j) = matrix(j)(length - 1 - i)
        matrix(j)(length - 1 - i) = temp
      }
    }
    matrix
  }
}
