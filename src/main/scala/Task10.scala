object Task10 extends App {
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
val b = solution(Array(
    Array(5, 1, 9, 11),
    Array(2, 4, 8, 10),
    Array(13, 3, 6, 7),
    Array(15, 14, 12, 16),
  ))
  for (i <- 0 to 3) {
    for ( j <- 0 to 3) {
      print(" " + b(i)(j));
    }
    println();
  }
}
