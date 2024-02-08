object IfElse {
  def main(args: Array[String]): Unit = {
    val x=10;
    val y =20;
    if(x>20 || y==20){
      println {
        "True"
      }
    }else println("False")
    println(if(x<20 && y==20)"True" else "False")
  }
}
