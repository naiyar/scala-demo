package com.test

class Donut(name: String, productCode: Long){


  def product: String = {
    if (name.isEmpty) "Invalid Donut" else name + " : " + productCode
  }

}


object Donut {

  def apply(name: String, productCode: Long): Donut = {
    new Donut(name, productCode)
  }

}
