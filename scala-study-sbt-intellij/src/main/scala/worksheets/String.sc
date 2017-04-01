var s = "Hello" + " world"
s.length

s = "111112222333331122"

s.distinct

s = "abcd"
val ls = s.permutations.toArray

// char is not int in Scala
"ABC".sum
'A' + 'B' + 'C'
('A' + 'B' + 'C').toChar
'Æ'.toInt


//
// vowels version 1
//
def isVowel(ch: Char) = "aeiuo".contains(ch)

def vowels_java(s: String) = {
  var result = ""
  for (ch <- s) {
    if (isVowel(ch)) result += ch
  }
  result
}

def vowels(s: String) = for (ch <- s if isVowel(ch)) yield ch
vowels("Hello")

def vowels_recursion(s: String): String = {
  if (s.length == 0) ""
  else {
    val ch = s(0)
    val rest = vowels(s.substring(1))
    if (isVowel(ch)) ch + rest else rest
  }
}
vowels_recursion("Hello")
//
// vowels version 2
//
def isVowel(ch: Char, vowelChars: String) = vowelChars.contains(ch)

def vowels(s: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true) =
  for (ch <- (if (ignoreCase) s.toLowerCase() else s) if isVowel(ch, vowelChars)) yield ch


def vowels_recursion(s: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true): String =
  if (ignoreCase) vowels_recursion(s.toLowerCase, vowelChars, false)
  else for (ch <- s if isVowel(ch, vowelChars)) yield ch