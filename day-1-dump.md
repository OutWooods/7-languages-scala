Scala runs on the JVM - so it can run side by side with existing deployments

Scala is statically typed.
Scala's syntax is close to java's
You can do both OO and functional scala

Type interface - in Scala you must declare the type of every variable, argument or parameter. It infers where possible. 

You can use code blocks, higher order functions and collections. 

Scala makes you decide if a variable is mutable. 

A functional language has these characteristics:

Functional programms are made up of functions. 
A function always returns a value
A function given the same inputs will return the same values (deterministic).
A functional programm avoids changing state or mutating data. Once you've set a value you leave it alone. 

But scala does allow mutable values. Which can lead to functions with the same inputs but different outputs. 

The biggest problem facing concurrency minded programmers in OO is mutable state - data can change. If two threads can edit data at the same time...then it's difficulut to guarantee the execution with leave it in a valid state. 

Databases deal with this with transactions and locking. 

Functional programming languages solve this problem by eliminating mutable state. 

Practically everything in scala is an object. 

Scala is actually strongly typed, it will use type inference so most of the time it will understand the types of variables through syntactic clues. Scala does the type checking at compile time. 

Scala binds types at compile time - but it can infer it so you can do val a = 1 and it knows 1 is an int. 
The message you get back is the bound type to the actual value. 

variable declarations start with val - var is valid. Val is immutable. Var is not. 
You can see this - you can't use 0 in place of a boolean, it'll tell you what type it's found and what type was required. 

You can't even test 0 and NIl if they are true of false with normal methods, as they're not the right type to use in boolean operations. 
Nils and numbers are not booleans...so don't treat them like them.

you can define a range with  0 until 10. 
(0 to 20) by 4 will make a rangewith 0, 4,8,12,16,20

until is noninclusive
to is

Scala has tuples. 
In functional languages programmers often express objects and their attributes with tuples

() <- tuple. person = ("eliv", "pers"). person._1  -> "eliv"

val (x, y) = (1,2)

classes in scala
class Person(firstName: String, lastName: String)
new Person("gareth","gates")

OO classes mix data and behaviour. 

in a class
val sets immutable values (consts)
var sets changable ones (variables)
and def creates methods. 

Everthing gets defined in the onstructor. 
You can have an auxilery constructor - say you want two parameters instead of one. You can do def this(.. , ..) and it'll intialise if there are two parameters sent through. 

In Java you have static methods - which are class methods. 
Ruby has self.class_method
Scala You can make Objects - not just classes. 

E.g. object TrueRing {
	}
This is a singleton object. 

This is called companion objects. In Scala you can have an object definition and a class definition with the same name. you can create class methods with the object definition and instance methods within the class declaration. 

Inheritance - class () extends () {
	}

	You have to specifically say if you're overiding amethod from a parent. So you say overaide def. 

Every OO language has to solve the problem that one object can have several different roles. Java uses interfaces, Ruby mixins and Scala - traits. 
A trait is like a java interface with the implentation. 
You say 'with' to get a class to implement a trait. 

Scala is strongly and statically typed. It is trying to bridge oo and functional. 
scala's static typing is inferred so users do not always need to declare types for all variables. 
The compiler can coerce types when they make sense. 


What is a REPL?,Read-eval-print- loop. The language shell. Interactive environment for working with a language.
