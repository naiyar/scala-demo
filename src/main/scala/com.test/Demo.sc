



class Convert(dValue: Double, n: Int) {
  def convertToInt: Int = dValue.toInt
}

object UseConvert {
  implicit def processConvert(dValue: Double, n: Int): Convert = new Convert(dValue, n)
}


import UseConvert._

val result = (4.5,9)

class HelloWorld extends App {

  override def main(args: Array[String]): Unit = {
    println("Hello World")
  }
}

object HelloWorld extends HelloWorld