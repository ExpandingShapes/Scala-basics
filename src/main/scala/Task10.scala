/**
 * Input is n x n 2D matrix (two dimensional array).
 * Turn it 90 degrees clockwise. The given matrix must be changed,
 * creating a new 2D matrix is not allowed.
 */

object Task10 {
  def solution(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val matrixSize = matrix.length
    val firstRow = matrix(0)
    val lastColumn = matrix.map(row => row(matrixSize - 1))
    val lastRow = matrix(matrixSize - 1)
    val firstColumn = matrix.map(row => row(0))

    def updateColumn(newColumn: Array[Int])(isFirstColumn: Boolean): Unit = {
      if(isFirstColumn) {
        for (i <- 0 until matrixSize) {
          matrix(i)(0) = newColumn(i)
          //matrix(i)(matrixSize - 1) = newColumn(i)
        }
      }
      else {
        for (i <- 0 until matrixSize) {
          matrix(i)(matrixSize - 1) = newColumn(i)
          //matrix(0)(i) = newColumn(i)
        }
      }
    }

    def updateRow(newRow: Array[Int])(isFirstRow: Boolean): Unit = {
      if(isFirstRow) {
        for (i <- 0 until matrixSize) {
          matrix(0)(i) = newRow(i)
        }
      }
      else {
        for (i <- 0 until matrixSize) {
          matrix(matrixSize - 1)(i) = newRow(i)
        }
      }
    }

    def updateFirstColumn(newRow: Array[Int]): Unit = updateColumn(newRow)(true)
    def updateLastColumn(newRow: Array[Int]): Unit = updateColumn(newRow)(false)
    def updateFirstRow(newColumn: Array[Int]): Unit = updateRow(newColumn)(true)
    def updateLastRow(newColumn: Array[Int]): Unit = updateRow(newColumn)(false)

    updateLastColumn(firstRow)
    updateLastRow(lastColumn.reverse)
    updateFirstColumn(lastRow)
    updateFirstRow(firstColumn.reverse)
    matrix

//    for(i <- 1 to 4) {
//      if(i % 2 == 1) updateColumn() else updateRow()
//    }
  }
}
