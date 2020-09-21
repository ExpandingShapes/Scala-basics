import Task06.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class Task06Test extends AnyFlatSpec {
  "Task06" must "return ListNode(7,ListNode(0,ListNode(8,null)))" in {
    assert {
      val ln1 = ListNode(2, ListNode(4, ListNode(3)))
      val ln2 = ListNode(5, ListNode(6, ListNode(4)))
      Task06.solution(ln1, ln2) == ListNode(7, ListNode(0, ListNode(8, null)))
    }
  }
}
