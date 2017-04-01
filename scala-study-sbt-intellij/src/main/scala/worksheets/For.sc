for (i <- 0 to 3)
  println(i)

for (i <- 0 until 3) //exclude 3
  println(i)


val strings = Array("a", "b", "c")

for (s <- strings)
  println(s)


for {
  i <- 1 until 9
  if i > 3
} yield i

for (i <- 1 to 3; j <- 1 to 4) print((10 * i + j) + " ")

// Guard
for (i <- 1 to 3; j <- 1 to 4 if i != j) print((10 * i + j) + " ")