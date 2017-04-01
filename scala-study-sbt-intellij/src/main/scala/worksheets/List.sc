// filter
val nums = List(1, 2, 3, 4, 5).filter(_ < 4)

val nums2 = List(1, 2, 3, 4, 5).filter(_ < 4).map(_ * 2)

var a = nums.reverse

var add = nums ++ nums2

var a1 = 0 :: a //add to head
var a2 = a :+ 4 //add to end

// Create two list
List(1, 2, 3, 4).partition(x => x > 2)

