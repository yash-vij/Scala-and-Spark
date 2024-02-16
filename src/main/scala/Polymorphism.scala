class A {
  def A1(a:String, b:Int): Unit = {
    println(s"$a and $b")
  }
  def A1(a:String,b:Int,c:Int ): Unit = {
    var sum = b+c
    println(s"$a and $sum")
  }
  def A1(a:String): Unit = {
    println(a)
  }
  def B1():Double = 0.0
}
class B(a:Double,b:Int) extends A{
  override def B1(): Double = a*b
}
class C() extends A{
  override def A1(a:String,b:Int,c:Int): Unit = {
    var mul = b*c
    println(s" $a and multiplication is $mul ")
  }
}
object Polymorphism {
  def main(args: Array[String]): Unit = {
    var ob = new A()
    ob.A1("Hello")
    ob.A1("Hello",1)
    ob.A1("Hello",1,4)
    var ob2 = new B(2.45,32)
    println(ob2.B1())
    var ob3 = new C()
    println(ob3.A1("Hello",2,3))
  }
}
