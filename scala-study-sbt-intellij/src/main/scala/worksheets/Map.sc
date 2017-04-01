// immutable map
var scores = Map("Alice" -> 10,
  "Bob" -> 3,
  "Cindy" -> 8)


var mutable_scores = scala.collection.mutable.Map("Alice" -> 10,
  "Bob" -> 3,
  "Cindy" -> 8)

var score = scores("Bob")
//score = scores("Bot") //Exception
score = scores.getOrElse("Bot", 0)
score = scores("Cindy")

//scores += ("Ben" -> 5)  //Error

mutable_scores
mutable_scores.updated("Bob", 8)
mutable_scores
mutable_scores += ("Ben" -> 5)

for ((k, v) <- scores)
  yield(v, k)
