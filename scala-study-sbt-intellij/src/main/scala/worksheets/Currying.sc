//https://www.youtube.com/watch?v=Vriy8D97kwE

def add(x: Int): Int => Int =
  y => x + y

add(5)

add(5)(6)

var plus7 = add(7)

plus7(3)

