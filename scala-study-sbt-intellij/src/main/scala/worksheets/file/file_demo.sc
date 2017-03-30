import scala.io.Source

def main(args: Array[String]) {
  var file = Source.fromFile(".\test.txt")
  for (line <- file.getLines)
    println(line)
  file.close
}

object file_demo
{
  def main(args: Array[String]) {
    var file = Source.fromFile(".\test.txt")
    for (line <- file.getLines)
      println(line)
    file.close
  }
}