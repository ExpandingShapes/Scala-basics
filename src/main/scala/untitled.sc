//5
import scala.collection.mutable.ListBuffer
def solution(nums: Array[Int]) = {//: List[List[Int]] = {
  def iter() = ???

  val numsL = nums.toList
  var res: List[List[Int]] = List(List.empty)
  var temp = res
  //var single =
  for(i <- nums.indices) {
    temp = res
    temp.foreach(x => numsL(i) +: x)//::
    List(numsL(i)) +: temp
    println(s"temp = $temp")
    res ++= temp

  //temp
  }
  res
  //val singleLists = for(i <- nums) yield List(i)
  //singleLists :: nums.toList :: List.empty
}

println(solution(Array(1, 2, 3)).toString)//.mkString(", "))

