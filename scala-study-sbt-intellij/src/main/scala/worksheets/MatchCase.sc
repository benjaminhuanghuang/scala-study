import java.util.NoSuchElementException

val country = "China"
var currency = country match {
  case "A" => "Dollar"
  case "B" => "Yuan"
  case _ => throw new NoSuchElementException()
}

import java.io._

val data = try {
  val fp = new FileReader("test.txt")
} catch {
  case e: FileNotFoundException => "no file"
  case e: IOException => "IO exception"
  case _: Throwable => "unexpected error"

}