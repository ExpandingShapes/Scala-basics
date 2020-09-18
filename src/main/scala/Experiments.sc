import scala.annotation.tailrec

val matrix = Array(
  Array(5, 1, 9, 11),
  Array(2, 4, 8, 10),
  Array(13, 3, 6, 7),
  Array(15, 14, 12, 16),
)

val matrixSize = matrix.length

val firstRow = matrix(0).toSeq
val lastColumn = matrix.map(x => x(matrix.length - 1))
val lastRow = matrix(matrix.length - 1)
val firstColumn = matrix.map(row => row(0))

//def updateColumn(newColumn: Array[Int]): Unit = {
//  //matrix.foreach(row => row(matrixSize - 1) = newColumn(0))
//  for(i <- 0 until matrixSize) {
//    matrix(i)(matrixSize - 1) = newColumn(i)
//    println(newColumn(i))
//  }
//}
//updateColumn(matrix(0))
  for(i <- 0 until matrixSize) {
    matrix(i)(matrixSize - 1) = firstRow(i)
  }
matrix(0)(3)
firstRow



