package demo

import org.scalatest.FunSuite

/**
  * Created by hhuang on 3/29/17.
  */
class HelloTest extends FunSuite {
  test("sayHello method works correctly")
  {
    var hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }


}
