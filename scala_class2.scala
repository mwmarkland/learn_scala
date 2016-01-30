/* Starting from 
 *  http://docs.scala-lang.org/tutorials/tour/unified-types.html
 */

// In this example, rather than extending App, create a singleton
// object with a main method to create the executable.

object UnifiedTypes2 {
  def main(args: Array[String]) {
    val set = new scala.collection.mutable.LinkedHashSet[Any];
    set += "This is a string" // Add a string.
    set += 732                // add a number.
      set += 'c'                // Add a character.
    set += true                 // Add a boolean.
      set += main _               // Add the main function.
    val iter: Iterator[Any] = set.iterator
    while (iter.hasNext) {
      println(iter.next.toString())
    }
  }
}
