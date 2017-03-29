package string_list

object string_demo {
    val str: String = "Hello world!"
    val char_list: List[Char] = str.toList // convert string to char list

    char_list.isEmpty

    char_list.head

    char_list.tail

    println(char_list)
}