package string_list

object string_demo {
  def test = {
    val str: string = "Hello world!"
    val char_list: List[Char] = str.toList // conver string to char list

    char_list.isEmpty

    char_list.head

    char_list.tail

    println(char_list)
  }

  test()
}