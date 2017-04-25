package scala_magic

/**
  * Created by hhuang on 4/25/17.
  */
object RecursionFun {

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }


  def balance_1(chars: List[Char]): Boolean = {
    // find parentheses pairs in the string
    def recursion(chars: List[Char], countOfLeftParentheses: Int): Boolean = {
      if (chars.isEmpty) {
        countOfLeftParentheses == 0
      }
      else {
        val first_char = chars.head
        val countOfLeftParenthesesAdjusted =
          if (first_char == '(') countOfLeftParentheses + 1
          else if (first_char == ')') countOfLeftParentheses - 1
          else countOfLeftParentheses

        if (countOfLeftParenthesesAdjusted >= 0) recursion(chars.tail, countOfLeftParenthesesAdjusted) //chars.tail returns the list without the first element
        else false
      }
    }

    recursion(chars, 0)
  }

  def balance(chars: List[Char]): Boolean = {

    def balanced(chars: List[Char], countOfLeftParentheses: Int): Boolean =
      if (chars.isEmpty) countOfLeftParentheses == 0
      else if (chars.head == '(') balanced(chars.tail, countOfLeftParentheses + 1)
      else if (chars.head == ')') countOfLeftParentheses > 0 && balanced(chars.tail, countOfLeftParentheses - 1)
      else balanced(chars.tail, countOfLeftParentheses)

    balanced(chars, 0)
  }

  def countChange(money: Int, coins: List[Int]): Int = {
    def count(money: Int, coins: List[Int]): Int = {
      if (coins.isEmpty) 0
      else if (money - coins.head == 0) 1 // money == first coin
      else if (money - coins.head < 0) 0 // money is not enough
      else countChange(money - coins.head, coins) + countChange(money, coins.tail) // use the first coin and don't user first coin
    }

    count(money, coins.sorted)
  }
}
