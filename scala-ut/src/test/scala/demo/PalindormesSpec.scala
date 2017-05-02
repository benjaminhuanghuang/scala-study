package demo

import org.specs2.mutable._

/**
  * Created by hhuang on 5/2/17.
  */
class PalindormesSpec extends Specification {
  "The phrase 'Never odd or even'" should{
    "be a palindrome" in {
      Introduction.isPalindrome("Never odd or even") must beTrue
    }
  }
  "The phrase 'Mr. Owl ate my metal worm'" should{
    "be a palindrome" in {
      Introduction.isPalindrome("Mr. Owl ate my metal worm") must
        beTrue
    }
  }
  "The date '20:02 02/20 2002'" should{
    "be a palindrome" in{
      Introduction.isPalindrome("20:02 02/20 2002") must beTrue
    }
  }
}
