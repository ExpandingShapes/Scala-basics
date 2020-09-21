/**
 * In a string containing letters and spaces,
 * return the length of the last word in the string.
 * If there is no last word, return 0.
 */

object Task03 {
  def solution(s: String): Int = if(s.isEmpty || !s.exists(_.isWhitespace)) 0 else
    s.length - s.lastIndexWhere(_.isWhitespace) - 1
}
