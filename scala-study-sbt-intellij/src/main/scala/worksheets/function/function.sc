// Return type of function
def abs(x: Double) = if (x > 0) x else -1 //error

def abs2(x: Double) = if (x > 0) x else -1.0

// Recursive function need return type
def fac(n: Int) = if (n <= 0) 1 else n * fac(n - 1) // error
def fac2(n: Int): Int = if (n <= 0) 1 else n * fac2(n - 1)


def isVowel(ch: Char) = "aeiuo".contains(ch)

// Guard
def vowels(s: String) ={
    for (ch<-s if isVowel(ch)) yield ch
}