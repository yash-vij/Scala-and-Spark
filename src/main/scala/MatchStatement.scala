import scala.io.StdIn.readLine

object MatchStatement {
  class Student(name:String, ID:Int, marks:Int) {
    val marks_ : Int = marks

    def stuResult(): Unit = {
      marks match {
        case marks_ if marks > 80 => println(s"${name} got First Division")
        case marks_ if marks > 60 && marks <= 80 => println(s"${name} got Second Division")
        case marks_ if marks <= 60 && marks >33 => println(s"${name} got Third Division")
        case _ => println("Failed")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    var status = "Y"
    do {
      val name = readLine("Enter your name : ")
      val ID = readLine("Enter your ID : ").toInt
      val marks = readLine("Enter your marks : ").toInt
      val data = new Student(name, ID, marks)
      println(data.stuResult())
      var s = readLine("Do you want to enter data again ? Y/N : ")
      status = s
    }while(status != "N")

  }

}
