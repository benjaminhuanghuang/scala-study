val str: String = "Hello world!"

val char_list: List[Char] = str.toList // convert string to char list

for (i <- 0 to char_list.length - 1)
  println(char_list(i))

char_list.isEmpty

char_list.head

char_list.tail

println(char_list)

val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
  "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

for (breed <- dogBreeds)
  println(breed)