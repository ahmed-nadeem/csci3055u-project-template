# _Scala Programming Language_

- Ahmed Nadeem
- ahmed.nadeem1@uoit.net

## Introduction to Scala

### What is Scala?
Scala is a modern, general-purpose programming language designed to communicate common programming constructs in a concise, elegant and efficient manner. Scala is a blend of the two words, "scalable language," which imply the language is designed to grow per the demand of its users.

### History
Scala was created by German Scientist, Martin Odersky, who started its designs in 2001. It was influenced by many languages such as Erlang, Haskell, Standard ML, and most notably, Java. Its first version (1.0) was released in 2003, but made its way to the Java platform in 2004. Its second version (2.0) was released in 2006. The current most stable version, 2.12.8, was released on December 4, 2018. The langugage is approximately 15 years old, so its longevity does not give it as much credibility as the likes of C, C++, Python, and Java, but it has been maintained and updated frequently since its initial release, and it is getting very popular among programmers.

### Interesting features
- It is purely object-oriented
- It is a functional programming language
- It is statically typed with type-inference
- It runs on the Java Virtual Machine (JVM)

## About the syntax
Scala shares very similar syntax to Java, so if you have a strong understanding and working knowledge of Java, it will be easy and fast for you to learn Scala.

Some basic constructs include: 
- Expressions
- Blocks 
- Classes
- Objects
- Functions
- Methods
- Traits
- Closures.

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


## About the tools

> _Describe the compiler or interpreter needed_.

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.


