In Scala what's the difference between lists and arrays?,list But they are immutable so elements of a list cannot be changed by assignment.
In scala how do you a 2d list of strings?,List[List[String]] is a list of lists with strings in them.
How do you loop through a list or array in scala?,map or foreach
In scala how do you do foreach (2)?,There is a shorthand method for quick returns (row => do something) but if not you can use curly brackets { row => lots of things }
If you want an idnex in a loop you do what in scala foreach loops?, .zipWithIndex.map{ case(row index) }
You can tell scala the type of a variable with what?, : Boolean but it will infer it for you.
You can define an empty list with what in scala?, List[String]().
Write a doubel method in scala with return type?,def double(X:Int):Int = x * 2
What should you do to opimise for concurrency with scala?,Make as much as you can immutable. Mutable state limits concurrency.
What's one thing that functional languages great features for?, dealing with collections.
Lisp is one of the early functional languages. What does it name come from?, Lisp comes from LISt Processing.
Scala's key structures are(3)?, Lists sets and maps.
In scala how do you have a list with multiple types?, List[Any]
How do you access an element in a list in scala?,() its a function so it will throw an exception
What is Nil in scala?,an empty list.
What is a set compared to a list in scala?,A set is like a list but with no explicit order. Set().
How do you add or remove from a list?,Set is easy to add and remove from Set + thing or - thing and it removes it.
When you do a transform method on a set what happens?,Each operation makes a new set rather than modifying an old one. By default they are immutable.
How do you merge (union) a set in scala?,++
How do you how do you dinf the difference between sets scala?,--
How do you how do you dinf the intersection between sets scala?,&
Set(1  2  3) == Set(3 2 1) in scala?,yes - sets are unordered
How do you make a map in scala?,Map(0 -> "test"  1 -> "another")
To add you can do map in scala if it's mutable?, map += 4 -> "another"
what is the root class of the scala heirarchy?,Any is the root class in the Scala class hierachy.
..... is a subtype of every type?,Nothing
Everything inherits from ..... And ..... inherits from everything in scala?,any and nothing
What is a higher order function?,A higher order function is one that produces or consumes functions. More specifically one that takes other functions as inputs or returns them as outputs.
What is hobbit => println(hobbit) in list.foreach(hobbit => println(hobbit))?,an anonmyouse function
How do you check a list has no values in scala?,isEmpty
How do you check a lists length in scala?,length or size
How do you get a lists first value scala?,head
How do you get a lists  values other than the first scala?,tail
How do you get a lists end value scala?,last
How do flip a lists order in scala?,reverse
How do you remove a particular column in scala?,drop
How do you see how many elements in a list meet a condition in scala?,count
How do you see what elements in a list meet a condition in scala?,filter
How do you see if at least one element in a list meet a condition in scala?,exists
How do you see if all elements in a list meet a condition in scala?,forall
What is like inject in ruby in scala?,foldLeft
How does fold left work?,YOu supply an inial value and a code block. The foldLeft will pass the code block will pass each element of the array and another value. /: is one way
What does fold left use to chain arguments?,Fold left uses an idea called currying. functional languages use currying to transform a function with multiple parameters into several functions with their own parameter lists.
Why is  .foldLeft(0))((sum  value) => sum + value) like lambda calculus?,It has essentially two parameter lists. A bit like lambda calculus. You curry functions so you can have multiple arguments.
What is scala's file library?,import scala.io.Source
Scala To open a file you do?, Source.fromFile('filename')
Scala If you want to convert it to list or array you do?,[].getLines.toList or .getLines.toArray
Scala file to a string?,m.mkString
Scala you Want to loop over the file lines?,.getLines.foreach()
How long does a file remain open in scala? Note the file remains oepn as long as the JVM is running. You can close it by saving the file as a val:
WHat is the loan pattern?,You can also use the loan pattern which ensures that a resource is deterministically disposed of when it goes out of scope.
What is a block?,block is a piece of code that can be composed by statements and declarations but nothing else.
WHat is a closure?,A closure is a real first class object a real variable that has a block as it's value.
What is closure the functional answer to in OOP?,Closures are a way to define custom behaviour of objects (Whilst you'd use interfacts in OOP).aka a closure is a record storing a function.