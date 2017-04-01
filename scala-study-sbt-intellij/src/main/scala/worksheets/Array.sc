var nums = new Array[Int](10)
var strs = Array("Hello", "World") //without new
strs(0) = "Bye"

Array(1, 2, 3).foreach(println)

val arr: Array[Int] = Array(1, 2, 3)


import scala.collection.mutable.ArrayBuffer

var b = new ArrayBuffer[Int]
b += 1
b += (1, 2, 3, 4) // Add elements at end
//b += Array(8, 9, 10) //Error!
b ++= Array(8, 9, 10)

b.remove(3)

b.trimEnd(5) //remove last 5 elements

var a = b.toArray
var b2 = a.toBuffer

// Transforming Arrays
val arr3 = Array(2, 3, 4, 5, 7)
val result = for (elem <- arr3) yield 2 * elem

// Algorithms
b.sorted
b.reverse

Array(1, 2, 3).toString
Array(1, 2, 3).mkString("|")

val buf = ArrayBuffer(1, 2, -3, 4, -5, 6, -7, 8)
// remove negative numbers
