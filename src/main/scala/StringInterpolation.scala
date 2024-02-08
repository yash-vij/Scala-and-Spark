object StringInterpolation {
  def main(args: Array[String]): Unit = {
    val name = "yash"
    val age = 20
    println(name+" is "+age+" years old")
    println(s"$name is $age years old")  //Not type safe
    println(f"$name%s is $age%f years old")
    println(f"$name%s is $age%d years old")
  }

}
