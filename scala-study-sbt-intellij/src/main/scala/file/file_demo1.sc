import scala.io.Source

object file_demo
{
  def main(args: Array[String]) {
    var file = Source.fromFile(".\test.txt")
    for (line <- file.getLines)
      println(line)
    file.close
  }
}