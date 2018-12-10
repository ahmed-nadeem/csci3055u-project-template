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
println("Hello!") // Hello!
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
Although very similar to functions, Methods have some key differences. they are defined with the keyword *def*, followed by an identifier, parameter lists, a return type, and a body. The return type is declared after the parameter list and a colon *':'*. Methods can have multi-line expressions, where the last expression is the return value.
```scala
def sumOfSquares(x: Int, y: Int): Int = {
  val x2 = x * x
  val y2 = y * y
  x2 + y2         // return value
}
(println(sumOfSquares(3, 4)) // 25
```
### Classes
Classes can be defined with the *class* keyword followed by its name and constructor parameters. An instance of a class can be made using the *new* keyword.
```scala
class Welcome(prefix: String, suffix: String) {
  def greet(name: String): Unit =    // return type of greet is Unit, which is similar to void from Java
    println(prefix + name + suffix)
}

val person = new Welcome("Hello, ", "!")
person.greet("Ahmed Nadeem") // Hello, Ahmed Nadeem!
```
### Objects
As stated above, Objects are singleton instances of their own classes and can be defined using the keyword *object*. Classes usually have an "object companion" where the per-instance behavior is captured in the classes themselves, but behavior related to all instances of that class go in the object.
```scala
object Count {         // creating an object
  private var counter = 0
  def create(): Int = {    // defining a method within object
    counter += 1
    counter
  }
}

val countId1: Int = Count.create()    // accessing object
println(countId1) // 1
val countId2: Int = Count.create()
println(countId2) // 2
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
As mentioned Scala runs on the JVM so Java is a necessity, specifically Java SDK 8.0 or higher. Scala can be installed on any of the Linux, Windows, or Mac based systems. Incase you do not have Java SDK, download and install its current version from: http://www.oracle.com/technetwork/java/javase/downloads/index.html and add it your path.
- You can check your version in windows by going to command prompt and typing in *'javac -version'*
- Similarly, in linux by going to terminal and typing in *'javac -version'*

### Downloading Scala
There are many ways of downloading Scala. You can either use an IDE, such as IntelliJ and the Scala Build Tool (SBT), the commandline and SBT alongside your favourite text editor, or directly via commandline with Scala binaries. Whichever you prefer can be downloaded from: https://www.scala-lang.org/download/. 

With SBT you can create a Scala project with a template which can run, compile, and test your project. To get comfortable with the basics of SBT, follow the steps in this link: https://docs.scala-lang.org/getting-started-sbt-track/getting-started-with-scala-and-sbt-on-the-command-line.html
- You can check your version in windows by going to command prompt and typing in *'scala -version'*
- Similarly, in linux by going to terminal and typing in *'scala -version'*

Once installed, you can type in *'scala'* into your command prompt or terminal window to start the REPL. With this you can practice coding in the language.

## About the standard library
The Scala standard libary comes with a plethora of packages to support large scale code development. Some of the packages are collections, concurrent, io, math, sys, and matching. These allow for more convenient and efficient approaches to programming. To import a package, the notation *import.foo._* is used. The underline imports everything from the package, but you can specify the exact subpackage you might need.

**Some interesting functions of the collections library include:**
- **Arrays:** can be Int, Double, String, or generic. Although not directly sequences, can be converted to them and use more functionalities
- **Strings:** Same as arrays in that they can be converted to sequences and use operations such as *reverse*, *slice*
- **Iterators:** A way to access collections 1 by 1, with *it*. The two basic operations of *it* are *next* and *hasNext*
- **Maps:** A Map is an Iterable consisting of pairs of keys and values. 
  - Ex: Map("x" -> 24, "y" -> 25, "z" -> 26). It has many operations for further usability
- **Sets:** A Set is an Iterable that contains no duplicate elements, and it has many usable operations as well
- **Seqs:** A Seq is a sequence which allows for many operations such as sorting, indexing, updating, reversing, etc.

**Some interesting data structures of the collections libary include:**
- HashMap
- Queue
- Stack
- Vector
- TreeMap
- LinkedList

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

**The style of programming supported by the language: functional vs procedural programming**
> Scala is a multi-paradigm programming language so it supports more than one style to better suit the constructs for a task. With that being said, Scala supports many functional programming features, such as currying, type inference, immutability, higher-order functions, lazy evaluation, and pattern matching, but its main focus is on object-oriented programming in that almost everything in Scala is an object. The behaviours of objects are explained through the functionalities of classes and traits. Scala has case classes which are instantiable classes that are better for modeling immutable data, and especially for pattern matching. 

**The ability to perform meta-programming such as macros**
> Before the release of Scala 2.10, Scala did not officially have metaprogramming tools but there were some work arounds such as importing *java.lang.reflect*, the reflection library. Reflection is a commonly used term in many programming languages and it allows the ability to turn implicit elements of a program into explicit, or otherwise known as *reify*. Scala now supports compile-time reflections, and this is mainly in the form of *macros*. Defining macros is very similar to defining normal functions, except the body is defined by the keyword *macro* and is followed by an identifier that refers to a static macro implementation method. You can also use macros with SBT. Here is an example: https://github.com/scalamacros/sbt-example-newstyle.

**Symbol resolution and its support for closure**
> Scala supports closure functionality, in which a fuction's return value is dependent on the variables declared outside of its scope. This is allowed because code blocks can be passed as values, anyone with the values can execute the code block, and it can refer to the variables from the cotext it was created in.

**Scoping rules supported by the language: lexical vs dynamic scoping**
> Scala primarily uses lexical scoping with the implementations of blocks via code in curly brackets *{}*. Outer blocks are visible within inner blocks. Dynamic scoping is also possible, but is generally a bad idea as programmers have no control over how their functions will be called.

**Functional programming constructs either as part of the language or supported by the standard library of the runtime**
> Scala consists of many functional programming contructs: currying, type inference, immutability, higher-order functions, lazy evaluation, and pattern matching. Currying is technique of transforming a function with multiple parameters into a function with just one. This provides an example of currying in Scala: http://baddotrobot.com/blog/2013/07/21/curried-functions/. Type-inference is explained more below. Immutability refers to not being able to change the value of a variable, which in turn helps manage concurrency control. Scala permits higher-order functions because it treats functions as first-class citizens, and thus functions can take other functions as their parameters. Scala supports lazy evaluation, which allows for more concise programming. This gives an example of lazy evaluation and comparing it to the recursive alternative: https://www.scala-exercises.org/scala_tutorial/lazy_evaluation. Lastly, Scala allows pattern matching for processing strings, and this can be established using the keyword *case*.

**Its type system: static vs dynamic types**
> Scala is statically typed with type-inference, as mentioned in one of its interesting features. This means that Scala allows the programmer to avoid verbose typing (does not need to specify the type of variables), but still maintain compile-time type safety. This results in a middle-ground between static and dynamic typing by getting their best component and merging it into one.

**Strengths and weaknesses of the language**
> Many of Scala's strengths come from addressing the issues developers have with Java. So some of the advantages of Scala are: better coding and performance from the complex features, being a multi-paradigm language allows for concise and functional code (fewer lines of code, faster development, testing, and deployment), being compatible with Java and Interoperability (Developers can keep Java libaries and take further advantage of JVM), having advanced features (string comparison, pattern matching, mixins; which allow functions in class definitions), includes a full-featured API library that is not bloated, and because of its versatility scalable mediums (LinkedIn, Amazon, and Twitter) are integrating Scala into their development. Scala has a lot of advantages, but it also has its disadvantages as well, such as: debugging domain specific language (DSL) is a pain because of insufficient tooling, it can be hard to learn because of the many functional programming constructs, the community is still expanding so there is not as much presence as Java/C/C++/Python.
