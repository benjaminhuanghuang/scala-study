import scala.io.Source

object file_demo {
  def main(args: Array[String]) {
    var file = Source.fromURL("http://spark.apache.org")
    for (line <- file.getLines)
      println(line)
    file.close
  }
}