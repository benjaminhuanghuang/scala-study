package demo

/**
  * Created by hhuang on 5/2/17.
  */
object Palindromes {
  def isPalindrome(word: String) = {
    val modifiedWord = word.toLowerCase.replaceAll("[^a-z0-9]", "")
    val reversed = modifiedWord.reverse
    modifiedWord == reversed
  }

}
