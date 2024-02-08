object WhileDoWhile {
  def main(args: Array[String]): Unit = {
    var count = 0;
    var count2 = 0;
    while(count < 0){
      println("While count "+count)
      count += 1;
    }
    do{
      println("Do while count "+count2)
      count2 += 1;
    }while(count2 < 0)


  }
}
