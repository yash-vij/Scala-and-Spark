abstract class FirstAbstractClass(name : String) {
  def result :String
  def ID : Int

  override def toString: String = s" Result of $name who's ID is $ID is $result"
}
class AbstractClass(name:String , ID_ : Int, res:String) extends FirstAbstractClass (name){
  val result:String = res
  val ID:Int = ID_

}
object AbstractClass {
  def main(args: Array[String]): Unit ={

    var a = new AbstractClass("Yash",10, "Pass")
    var b = new AbstractClass("Jai",11, "Fail")
    println(a)
    println(b)
  }
}
