/* Example from 
 *  http://docs.scala-lang.org/tutorials/tour/unified-types.html
 */

// UnifiedTypes is a top-level singleton object extending App.  By
// extending App, an executable can be built. You can compile with
// scalac and then run with scala UnifiedTypes.

// Not sure why the emacs indentation screws up.

// This looks very much like C++ code with iterators.

object UnifiedTypes extends App {
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
