class Person{
  var name = ""
  var age = 0
  override def toString = s"$name is $age years old"
}
object Person{
  def apply(name : String) : Person = {
    var p = new Person
    p.name = name
    p
  }
  def apply(name :String , age :Int): Person = {
    var p = new Person
    p.name = name
    p.age = age
    p
  }

}
object CompanionObject {
  def main(args: Array[String]): Unit = {
    var a = Person("Yash")
    var b = Person("Yash",27)
    println(a)
    println(b)
  }
}
