package com.test

import collection.mutable.Stack
import org.scalatest._

class HelloWorldTest extends FlatSpec with Matchers {




  "HelloWorld" should "return Donut successfully" in {
    val testService = new Donut("Demo", 90)
    assert(testService.product === "Demo : 90")
  }

  "HelloWorld" should "not return Donut with invalid name" in {
    val testService = new Donut("", 90)
    assert(testService.product === "Invalid Donut")
  }

}
