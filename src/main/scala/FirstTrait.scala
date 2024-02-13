trait TraitA {
  def fullName(): Unit
  def details(name:String) :Unit

}
class Employee extends TraitA {
  override def fullName(): Unit = {
    println("First Trait example")
  }

  override def details(name: String): Unit = {
    println("My name is ",name)
  }


}


object FirstTrait {
  def main(args: Array[String]): Unit = {
    var e = new Employee
    println(e.fullName())
    println(e.details("Yash Vij"))
  }

}
