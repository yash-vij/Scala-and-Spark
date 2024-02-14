import scala.reflect.internal.util

sealed trait Message
case class Dog(sound : String) extends Message
case class Cat(sound:String) extends Message
case class Bird(sound:String) extends Message



object CaseClassAndObject {
  def Dog(sound:String) : Unit =  println("Dog sounds WOOF "+sound)
  def Cat(sound:String) : Unit =  println("Cat sounds Meow "+sound)
  def Bird(sound:String) : Unit =  println("Bird sounds Chirp "+sound)

  def handleMessage(sound: Message) :Unit = sound match {
    case Dog(sound) => Dog(sound)
    case Cat(sound) => Cat(sound)
    case  Bird(sound) => Bird(sound)
  }

  def main(args: Array[String]): Unit = {
    val Message = "Done"
    val d = new Dog(Message)
    val c = new Cat(Message)
    val b = new Bird(Message)
    handleMessage(d)
    handleMessage(c)
    handleMessage(b)
  }
}
