
import scala.collection.mutable.ListBuffer
import Array._
object Collections {

  def main(args: Array[String]): Unit = {



    //List in scala
    val list1 :List[Int] = List(1,2,3,4,5,6)
    val list2 :List[List[String]] = List(
      List("A","B"),
      List("C","D"),
      List("E")
    )
    val list3 = List.fill(12)("A")

    //Iterating each element
    println("Iterating each element : ")
    for(ele<-list1){
      println(ele)
    }
    println("Each element of 2D list : ")
    for(ele<-list2;e<-ele){
      println(e)
    }
    println(list3)



    //ListBuffer in Scala
    var listBuf = new ListBuffer[String]()
    listBuf += ("A","B","A","C","A")
    listBuf.insert(2,"DF")
    println(listBuf)
    listBuf -= ("A")
    println(listBuf)



    //Map in Scala
    //Immutable map
    val newMap = Map(1->"A",2->"B",3->"C")
    println("Map data : "+ newMap(1))

    //Mutable Map
    val muMap = scala.collection.mutable.Map[Int,String]()
    muMap += (1->"First")
    muMap += (2->"Second")
    muMap += (3->"Third")
    for((k,v)<- muMap){
      println("Key : "+k+" Value : "+v)
    }


    // Scala Arrays
    var arr = new Array[Int](20)
    var arr2 = new Array[Int](10)

    for(i<- 0 until arr.length){
      arr(i) = i
    }

    for(i <-  0 until arr2.length){
      arr2(i) = i
    }
    var arr3 = concat(arr, arr2)
    println("Array is : ")
    for(i <- 0 until arr3.length){
      print(" "+arr3(i))
    }
    println("")
    println("2D Array : ")
    //2D- Array
    val rows = 2
    val cols = 3
    val names = Array.ofDim[String](rows,cols)

    names(0)(0) = "gfg"
    names(0)(1) = "Geeks"
    names(0)(2) = "GeeksQuize"
    names(1)(0) = "GeeksForGeeks"
    names(1)(1) = "Employee"
    names(1)(2) = "Author"

    for(i<- 0 until rows; j<- 0 until cols){
      print(" "+names(i)(j))
    }

  }

}
