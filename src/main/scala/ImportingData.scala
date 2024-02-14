import AbstractClass._
object ImportingData {
  def main(args: Array[String]): Unit = {
    var a = new AbstractClass("Sam",101, "Pass")
    var b = new AbstractClass("Ram",111, "Fail")
    println(a)
    println(b)

  }
}
