// This file will go over useful functionalities of the Scala standard library

// File I/O (Scala makes use of many java libraries)
// writing to a file
import java.io._

object Writing {
   def main(args: Array[String]) {
      val writer = new PrintWriter(new File("test.txt"))

      writer.write("Hello Scala")
      writer.close()
   }
}

// reading a line from commandline
object Reading {
   def main(args: Array[String]) {
      print("Please enter your input : " )
      val line = Console.readLine
      
      println("Thanks, you just typed: " + line)
   }
}

// reading file content
import scala.io.Source

object ReadFileContent {
   def main(args: Array[String]) {
      println("Following is the content read:")

      Source.fromFile("test.txt").foreach { 
         print 
      }
   }
}

// Regular Expressions
// find word Scala from statement
import scala.util.matching.Regex

object Matching {
   def main(args: Array[String]) {
      val pattern = "Scala".r
      val str = "Scala is Scalable and cool"
      
      println(pattern findFirstIn str)
   }
}

// Arrays
import Array._

object Matrix {
   def main(args: Array[String]) {
      var myMatrix = ofDim[Int](3,3)
      
      // build a matrix
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            myMatrix(i)(j) = j;
         }
      }
      
      // Print two dimensional array
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            print(" " + myMatrix(i)(j));
         }
         println();
      }
   }
}

// Iteration
import scala.collection.Iterator

object Iteration {
   def main(args: Array[String]) {
      val it = Iterator("a", "number", "of", "words")
      
      while (it.hasNext){
         println(it.next())
      }
   }
}

// find min and max with Iteration
object MinMax {
   def main(args: Array[String]) {
      val itA = Iterator(20,40,2,50,69,90)
      
      println("Maximum valued element " + itA.max )
      println("Minimum valued element " + itA.min )
   }
}
