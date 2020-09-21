import org.scalatest.flatspec.AnyFlatSpec

class Task14Test extends AnyFlatSpec {
  "Task14" must "return list of 2 elements which are:" in {
    assert {
      val s1 = "catsanddog"
      val dict1 = List("cat", "cats", "and", "sand", "dog")
      val res1 = List("cats and dog", "cat sand dog")
      Task14.solution(s1, dict1) == res1
    }
  }
  it must "return list of 3 elements which are:" in {
    assert {
      val s2 = "pineapplepenapple"
      val dict2 = List(
        "apple",
        "pen",
        "applepen",
        "pine",
        "pineapple"
      )
      val res2 = List(
        "pine apple pen apple",
        "pineapple pen apple",
        "pine applepen apple"
      )
      Task14.solution(s2, dict2) == res2
    }
  }
  it must "return an empty list" in {
    assert {
      val s3 = "catsandog"
      val dict3 = List("cats", "dog", "sand", "and", "cat")
      Task14.solution(s3, dict3) == List.empty
    }
  }
}
