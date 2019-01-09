package com.test

object HelloWorld extends App {

  override def main(args: Array[String]): Unit = {
    val glazedDonut = Donut("Glazed Donut", 1111)
    println("--- "+glazedDonut.product)
  }
}
