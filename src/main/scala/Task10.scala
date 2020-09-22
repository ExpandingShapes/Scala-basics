/**
  * Input is n x n 2D matrix (two dimensional array).
  * Turn it 90 degrees clockwise. The given matrix must be changed,
  * creating a new 2D matrix is not allowed.
  */

/**
  * For a 3 x 3 array, there will be 2 iterations:
  * (1, 2, 3),    (7, 2, 1),    (7, 4, 1)
  * (4, 5, 6), => (4, 5, 6), => (8, 5, 2)
  * (7, 8, 9)     (9, 8, 3)     (9, 6, 3)
  */
object Task10 {
  def solution(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val length = matrix.length
    for (i <- 0 until length / 2) {
      for (j <- i until length - i - 1) {
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
