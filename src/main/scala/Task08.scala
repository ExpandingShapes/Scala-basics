import scala.annotation.tailrec

/**
 * In a string, find the maximum length of a substring with unique characters.
 */

object Task08 {
  def solution(s: String): Int = {
    @tailrec
    def iter(
        string: String,
        subString: String,
        currentStreak: Int,
        maxStreak: Int
    ): Int = {
      string.headOption match {
        case Some(c) if string.length == 1 =>
          if (!subString.exists(x => x == c) && currentStreak == maxStreak)
            maxStreak + 1
          else maxStreak
        case Some(c) if !subString.exists(x => x == c) =>
          iter(
            string.drop(1),
            s"$subString$c",
            currentStreak + 1,
            currentStreak.max(maxStreak)
          )
        case Some(c) =>
          iter(string.drop(1), "", 0, currentStreak.max(maxStreak))
        case None => maxStreak
      }
    }
    iter(s, "", 0, 0)
  }
}
