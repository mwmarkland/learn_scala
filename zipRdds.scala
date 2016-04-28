/* \file zipFiles.scala
 * \author Matthew Markland
 * 
 *  Simple example using arrays to show how to zip two RDDs together
 *  with the goal of using it on file input.
 *  
 *  One key item is that provided you haven't done any operations that
 *  repartition the RDDs you want to zip, they should have the original
 *  ordering of the members.
 */

val rddOne = sc.parallelize(Array(1,2,3,4,5))
val rddTwo = sc.parallelize(Array(10,20,30,40,50))
val rddThree = rddOne.zip(rddTwo)
val rddOut = rddThree.map({case (a,b) => a.toString + "\t" + b.toString})
rddOut.coalesce(1).saveAsTextFile("file:///home/markland/snap.txt")

/* 
 ~> cd snap.txt/
 ~/snap.txt> ls
 part-00000  _SUCCESS
 ~/snap.txt> more part-00000
 1       10
 2       20
 3       30
 4       40
 5       50
 ~/snap.txt>
 */
