
/* Starting from
 *  http://docs.scala-lang.org/tutorials/tour/unified-types.html
 */

// The original implementation looks very much like C++ code with
// iterators. Going to try to change that to do a map. This compiled
// and ran on the first try. Nifty! :-)


object UnifiedTypes_MAP extends App {
  val set = new scala.collection.mutable.LinkedHashSet[Any];
  set += "This is a string" // Add a string.
  set += 732                // add a number.
    set += 'c'                // Add a character.
  set += true                 // Add a boolean.
    set += main _               // Add the main function.

  // After thinking about why you would choose map or a while for this
  // particular piece of code I came to the conclusion that it has to
  // do with "side-effects" in a sense. The while loop is simply going
  // to print. The map will create a new list whether you use it or
  // not (I think). This may be part of how you choose idiomatic forms
  // in scala.


  // val iter: Iterator[Any] = set.iterator
  // while (iter.hasNext) {
  //   println(iter.next.toString())
  // }

  set.map(x => println(x))
}
