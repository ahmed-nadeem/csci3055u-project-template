// This file will go over basic syntax and constructs of Scala

// Expressions
// print statement
println(1)
println("Hello!")

// values are immutable
// declare value w/o identifying type (Scala automatically can determine this)
val sum = 2 + 2
// declare value of type Int
val x: Int = 1 + 1

// variables are mutable
var product = 3 * 3
product = 10
println(product * product)

// Blocks
println( {
  val x = 1 + 1
  x + 1
} )

// Functions
// without identifier
(x: Int) => x + 1
// with identifier
val add = (x: Int, y: Int) => x + y
println(add(3, 3))

// conditionals
val x = 10
if (x == 10) 
  println("yeah") 
else 
  println ("nope")

// Iterators
// while loop
var a = 10
while (a < 20) {
  println ("Value of a: " + a)
  a = a + 1
}

// for loop
var a = 0
for (a <- 1 to 5) {
  println ("Value of a: " + a)
}

// Methods
def sumOfSquares(x: Int, y: Int): Int = {
  val x2 = x * x
  val y2 = y * y
  x2 + y2
}
(println(sumOfSquares(3, 4))

// Classes
class Welcome(prefix: String, suffix: String) {
  def greet(name: String): Unit =   
    println(prefix + name + suffix)
}
val person = new Welcome("Hello, ", "!")
person.greet("Ahmed Nadeem")

// Objects
object Count {         
  private var counter = 0
  def create(): Int = {    
    counter += 1
    counter
  }
}
val countId1: Int = Count.create()    
println(countId1) 
val countId2: Int = Count.create()
println(countId2)

// Traits
trait Dog {           
    def breed: String
    def colour: String
    def bark: Boolean = true
    def bite: Boolean
}
class SaintBernard extends Dog {    
    val breed = "Saint Bernard"
    val colour = "brown"
    def bite = false
}
val b = new SaintBernard
println (b.colour)
