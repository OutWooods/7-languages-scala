Scala is ______ typed,statically
Scala's syntax is close to?, java's
What paradigms can you do in scala?,You can do both OO and functional scala
What is Type interface in scala?, in Scala you must declare the type of every variable argument or parameter. It infers where possible. 
Are variables mutable in scala?,Scala makes you decide if a variable is mutable or not
What are three key facts about functional languages?,A function always returns a value-A function given the same inputs will return the same values (deterministic) - A functional programm avoids changing state or mutating data. Once you've set a value you leave it alone. 
The biggest problem facing concurrency minded programmers in OO?,is mutable state - data can change. If two threads can edit data at the same time...then it's difficulut to guarantee the execution with leave it in a valid state. 
How do databases deal with concurrency and multiple state risks?,Databases deal with this with transactions and locking. 
How does functional programming solve the problem of concurrency and mutable state?,Functional programming languages solve this problem by eliminating mutable state. 
In scala how do you differentiate between mutable and immutable types?,val and var (im and mutable)
Give a example of why scala is strongly typed?,If you try to use 0 in if - it'll tell you the type is wrong and you can only use booleans
What's scala's views on 0 and Nil in terrms of booleans?,Nils and numbers are not booleans...so don't treat them like them.
In functional languages programmers often express objects and their attributes with?, tuples
What is a REPL?,Read-eval-print- loop. The language shell. Interactive environment for working with a language.
When does Scala bind types?,compile time
DO you need to explictly state types in scala?,no - it will try to infer it - so 1 is int
How do you write a tuple in scala?,("" "")
("eliv" "pers"). person._1?,"eliv"
Show a person class in scala?,[class Person(firstName: String lastName: String)
In a class val - var and -def?,val sets immutable values (consts) - var sets changable ones (variables)- and def creates methods. 
What's different about scala and ruby classes?,everything gets defined in the constructor in scalaj
Can you have different arguements for classes in scala?,Yes - an You can have an auxilery constructor - say you want two parameters instead of one. You can do def this(..  ..) and it'll intialise if there are two parameters sent through. 
Why is scala like a mix of IO and Ruby?,Scala You can make Objects - not just classes. 
How do you make class methods in scala?,You can mae objects - these are companion objects so you can have an object and class with the same name. The object is a singleton so you can have 'class' methods here
What's interesting about methods and class inheritance in scala?,You have to specifically say if you're overiding amethod from a parent. So you say overaide def. 
What is a trait in scala like?,A trait is like a java interface with the implentation. 
How do you implement a trait in scala?,You say 'with' to get a class to implement a trait. 

