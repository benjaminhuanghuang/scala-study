package scala_magic

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import Anagrams._
/**
  * Created by hhuang on 4/25/17.
  */
@RunWith(classOf[JUnitRunner])
class AnagramsSuite extends FunSuite  {
  test("wordOccurrences: abcd") {
    assert(wordOccurrences("abcd") === List(('a', 1), ('b', 1), ('c', 1), ('d', 1)))
  }
}
