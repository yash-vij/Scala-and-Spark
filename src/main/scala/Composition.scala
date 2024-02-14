trait Greeting{
  def translate(text:String) :String
  def message = translate("Message is Hello")
}
trait Translation{
  def translate(text:String) :String ="Message 1"
}
trait CompositionTrait extends Greeting with Translation
object Composition extends CompositionTrait {
  def main(args: Array[String]): Unit = {
    println(message)

  }
}
