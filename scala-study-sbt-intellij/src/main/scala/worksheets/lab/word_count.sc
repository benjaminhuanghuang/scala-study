import java.util.Scanner
import java.net.URL

val url = "http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt"

val in = new Scanner(new URL(url).openStream)

var count = scala.collection.mutable.Map[String, Int]()

while (in.hasNext) {
  val word = in.next
  //count(word) = count.getOrElse(word,0) +1  // version 1
  count = count + (word -> (count.getOrElse(word, 0) + 1))  // version 2

}

count("Alice")