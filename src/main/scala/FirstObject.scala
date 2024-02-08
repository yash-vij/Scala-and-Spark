object FirstObject {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
  def main(args: Array[String]): Unit = {
    val newId : Int = FirstObject.create()
    println(newId)
    val newId2 : Int = FirstObject.create()
    println(newId2)

  }
}



