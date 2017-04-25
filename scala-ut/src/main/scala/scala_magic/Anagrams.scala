package scala_magic

import scala.collection.immutable._

object Anagrams {

  type Word = String
  type Occurrences = List[(Char, Int)]

  def wordOccurrences(w: Word): Occurrences = {
    val unsorted = (w.toLowerCase groupBy identity) map { case (c,cs) => (c, cs.length) }

    (SortedMap[Char,Int]() ++ unsorted) toList
  }
}
