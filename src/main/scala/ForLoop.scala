object ForLoop {
  def main(args: Array[String]): Unit = {
    var size = 10;
    for(i <- 0 to size){
      println(i)
    }
    for( i <- 0 until size){
      println("For until "+i)
    }

    for(i <- 1 to size ; j <- 1 to size -5){
      println("Nested For loop "+i+" "+j)
    }
    val lst = List(10,20,22,234,345,43,534,5,3,100,101)
    for(i <- lst; if i>100){
      println(i)
    }

    val res = for{i <- lst
                  if i >100}yield {i*10}
    println(res)
  }
}
