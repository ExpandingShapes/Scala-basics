import scala.annotation.tailrec

/**
 * Input: two non-empty linked lists representing positive numbers.
 * Digits are stored in reversed order, every node contain one digit.
 * Return the sum of the numbers as a new linked list.
 */

object Task06 {
  case class ListNode(
     var x: Int = 0,
     var next: ListNode = null
   )

  def solution(l1: ListNode, l2: ListNode): ListNode = {
    @tailrec
    def getNumberFromListNode(
       listNode: ListNode,
       acc: Int = 0,
       multiplier: Int = 1
       ): Int = {
      if(listNode.next != null) {
        getNumberFromListNode(listNode.next, acc + listNode.x * multiplier, multiplier * 10)
      }
      else {
        acc + listNode.x * multiplier
      }
    }
    def buildListNode(number: Int): ListNode = {
      if(number > 9) {
        ListNode(number % 10, buildListNode(number / 10))
      }
      else {
        ListNode(number, null)
      }
    }
    buildListNode(getNumberFromListNode(l1) + getNumberFromListNode(l2))
  }
}
