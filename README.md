# Scala Programming Language

- Ahmed Nadeem (100619947)
- ahmed.nadeem1@uoit.net

## Introduction to Scala

### What is Scala?
Scala is a modern, general-purpose programming language designed to communicate common programming constructs in a concise, elegant and efficient manner. Scala is a blend of the two words, "scalable language," which imply the language is designed to grow per the demand of its users. 

### History
Scala was created by German Scientist, Martin Odersky, who started its designs in 2001. It was influenced by many languages such as Erlang, Haskell, Standard ML, and most notably, Java. Its first version (1.0) was released in 2003, but made its way to the Java platform in 2004. Its second version (2.0) was released in 2006. The current most stable version, 2.12.8, was released on December 4, 2018. The langugage is approximately 15 years old, so its longevity does not give it as much credibility as the likes of C, C++, Python, and Java, but it has been maintained and updated frequently since its initial release, and it is getting very popular among programmers.

### Interesting features
- It is purely **object-oriented**
- It runs on the **Java Virtual Machine (JVM)**
- **Type-Inference:** Scala compiler usually automatically detects data type of an expression
- **Singleton Object:** Scala does not have static variables and methods, instead it uses an *Object* which is an instance of a class
- **Immutability:** Scala by default declares every variable as immutable, but it can explicitly be declared to be mutable as well 
- **Lazy Evaluation:** Scala supports call-by-need which improves performance
- **Higher-Order Functions:** A function that takes another function as a parameter or returns it

## About the syntax
Scala shares very similar syntax to Java, so if you have a strong understanding and working knowledge of Java, it will be easy and fast for you to learn Scala. 

- **Comments:** can be single-line with // or multi-line with /* ... */
- **Data Types:** Int (1), Double (1.0), Float (1.0) String ("Hello"), Char ('C'), Boolean (true/false), etc.

### Syntax Rules:
- **Case-Sensitive:** This means that Scala treats the identifiers *hello* and *Hello* differently
- **Class Names:** For all class names, the first letter should be capitalized. If several words are used to form a name of the class, each inner word's first letter should be capitalized
  - Ex: *class FirstScalaProgram*
- **Method Names:** All method names should start with a lower case letter. If multiple words are used to form the name of the method, then each inner word's first letter should be capitalized
  - Ex: *def myMethodName()*
- **Program File Name:** The name of the program should be the name of the Object (if file name and Object name do no match, program will not compile)
  - Ex: *'FirstProgram'* is Object name, then file name should be *'FirstProgram'.scala*
- **Main Method:** Every Scala program starts processing from the main() method which is mandatory
  - Ex: *def main(args: Array[String])*
- **Keywords:** Scala reserves some words which cannot be used as constant, variable, or any identifier names
  - Ex: *def*, *abstract*, *lazy*, *object*, *if*, *else*, *for*, *while*, etc.

**There are many syntactic differences to Java as well, some of them are:**
- In Scala, a *semicolon* is optional to end statements
- Value types are capitalized: *Int*, *Double*, *Float* instead of *int*, *double*, *float*
- Methods must be preceded by *def*
- Local or class variables must be preceded by *val* or *var*
- The *return* operator is allowed, however it is unnecessary as it only returns from the inner most *def* that surrounds it, so      it can be error prone
- Scala uses *import foo._* instead of Java's *import foo.*\*;

**Some basic constructs include:** expressions, blocks, functions, methods, classes, objects, and traits
### Expressions
Expressions are just computable statements, such as 1 + 1. These statements can be displayed using the *println()* statement.
```scala
println(1) // 1
println(1 + 1) // 2
println("Hello!") // Hello!
println("Hello" + " World!") // Hello World!
```
#### Values
Expressions results can be named using the keyword, *val*. These results are called values, so referencing a value does not re-compute it, and it also cannot be re-assigned as val declarations are immutable.
```scala
val sum = 2 + 2
println(sum) // 4
sum = 5 // This does not compile
```
Although statically typed, Scala has a built in type-inference mechanism and so for example, it is usually not necessary to specify the type of variable since the compiler can automatically figure out what type it is during its initialization. However, you can declare the type incase the compiler is not able to infer its type.
```scala
val x: Int = 1 + 1 // declaring type Int, comes after the identifier and a ':'
```
#### Variables
Variables are values that can be re-assigned as they are mutable. You can declare a variable using the keyword, *var*.
```scala
var product = 3 * 3 // product var assigned to 9
product = 10 // re-assigned to 10
println(x * x) // 100
```
### Blocks
Expressions can be combined by surrounding them with *{}*. This is called a block. The result of the last expression in the block is the result of the overall block.
```scala
println({
  val x = 1 + 1
  x + 1
}) // 3 because of last expression
```
### Functions
Functions are expressions that can take multiple parameters or no parameters. They can be defined with or without an identifier.
```scala
(x: Int) => x + 1 // defined without an identifier

val add = (x: Int, y: Int) => x + y // defined with an identifier and multiple parameters
println(add(3, 3)) // 6

val getAge = () => 20 // defined with an identifier and no parameters
println(getAge()) // 20
```
### Methods
Although very similar to functions, Methods have some key differences. they are defined with the keyword *def*, followed by an identifier, parameter lists, a return type, and a body. The return type is declared after the parameter list and a colon ':'. Methods can have multi-line expressions, where the last expression is the return value.
```scala
def sumOfSquares(x: Int, y: Int): Int = {
  val x2 = x * x
  val y2 = y * y
  x2 + y2
}
(println(sumOfSquares(3, 4)) // 25
```
### Classes
Classes can be defined with the *class* keyword followed by its name and constructor parameters. An instance of a class can be made using the *new* keyword.
```scala
class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit =    // return type of greet is Unit, which is similar to void from Java
    println(prefix + name + suffix)
}

val greeter = new Greeter("Hello, ", "!")
greeter.greet("Scala developer") // Hello, Scala developer!
```
### Objects
As stated above, Objects are singleton instances of their own classes and can be defined using the keyword *object*. Classes usually have an "object companion" where the per-instance behavior is captured in the classes themselves, but behavior related to all instances of that class go in the object.
```scala
object IdFactory {         // creating an object
  private var counter = 0
  def create(): Int = {    // defining a method within object
    counter += 1
    counter
  }
}

val newId: Int = IdFactory.create()    // accessing object
println(newId) // 1
val newerId: Int = IdFactory.create()
println(newerId) // 2
```
### Traits
Traits hold fields and methods, and they can be defined using the *trait* keyword. They can also be combined.
```scala
trait Dog {           // creating trait
    def breed: String
    def colour: String
    def bark: Boolean = true
    def bite: Boolean
}
class SaintBernard extends Dog {    // class extends trait
    val breed = "Saint Bernard"
    val colour = "brown"
    def bite = false
}

val b = new SaintBernard
println (b.colour) // brown
```

## About the tools
### Java SDK
As mentioned Scala runs on the JVM so Java is a necessity, specifically Java SDK 8.0 or higher. Scala can be installed on any UNIX flavour or Windows based system. Incase you do not have Java SDK, download and install its current version from: http://www.oracle.com/technetwork/java/javase/downloads/index.html and add it your path.
- You can check your version in windows by going to command prompt and typing in *'java -version'*
- Similarly, in linux by going to terminal and typing in *'java -version'*

### Downloading Scala
There are many ways of downloading Scala. You can either use an IDE, such as IntelliJ or through commandline/terminal and using your favourite editor. Whichever you prefer can be downloaded from: https://www.scala-lang.org/download/. 
- You can check your version in windows by going to command prompt and typing in *'scala -version'*
- Similarly, in linux by going to terminal and typing in *'scala -version'*

Once installed, you can type in *'scala'* into your command prompt or terminal window to start the REPL. With this you can practice coding in the language.

## About the standard library
> _Give some examples of the functions and data structures
> offered by the standard library_.
The Scala standard libary comes with a plethora of packages to support large scale code development. One of them is the collections library, which Scala states is easy to use, concise, safe, fast, and universal.
- **scala.collection** and its subpackages contain the collections framework
- 


## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _1. The style of programming supported by the language: functional vs procedural programming_.

> _2. The ability to perform meta-programming such as macros_.

> _3. Symbol resolution and its support for closure_.

> _4. Scoping rules supported by the language: lexical vs dynamic scoping_.

> _5. Functional programming constructs either as part of the language or supported by the standard library of the runtime_.

> _6. Its type system: static vs dynamic types_.

> _7. Strengths and weaknesses of the language_.


