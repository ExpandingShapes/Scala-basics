/**
  * Check if a string can be converted to a digital number.
  * Using regular expression is preferable.
  * Allowed characters are:
  * 0-9 integers
  * e exponent
  * + or - sign
  * . in a digital fraction
  */

object Task12 {
  def solution(s: String): Boolean = {
    val pattern = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?".r
    pattern.matches(s)
  }
}
