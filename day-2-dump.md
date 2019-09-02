Lists are similar to arrays  - all elements of a list have the same type. But they are immutable so elements of a list cannot be changed by assignment.

List[List[String]] is a list of lists with strings in them.

Scala also has Arrays, whose values are mutable.

YOu can loop through a list or an array with map or foreach
There is a shorthand method for quick returns (row => do something) but if not you can use curly brackets { row => lots of things }
If you want an idnex in a loop you do .zipWithIndex.map{ case(row, index) }

You can tell scala the type of a variable with : Boolean, but it will infer it for you.

You can define an empty list with List[String]().

Scala does let you mutate things more but it feels a little bit more resistant, I found it easier to map over rather than loop through arrays and push them.

Hard to find a good linter for VSCode, maybe not a super popular editor to use?

I didn't like the syntax at first, but it's growing on me. It's much simpler than the Java code I've seen.
Having strict types is also, to be honest, annoying, but I imagine reduces errors in the long term.
The really good thing is compilation, it's so much easier to spot mistakes as scala's compiler gives you way clearer feedback. I can see why people say it's like having a load of pre-built tests. I've found scala much easier to debug.

I've found prolog has been affecting my thinking - in a good way. It's helped me structure my thoughts around, one rule at a time.

You can specify a method definition in block form.

def double(X:Int):Int = x * 2
You can define the optional return type  but Scala can often infer it.

Make as much as you can mutable. Mutable state limits concurrency.

Functional languages often have great features for dealing with collections. Lisp is one of the early functional languages. Lisp comes from LISt Processing.
Scala's key structures are Lists, sets and maps.

Java has a feature called generics which allows you to type the items within a data structure like a list or array. If you have List[Any] that means it'll take a mixture.

List access is a function so you use () not []. Early versions of scala return the first element with neg numbers. And it throws an exception when you try to access an index which does not exist.

Nil in scala is an empty list.

A set is like a list but with no explicit order. Set().
Set[String]
Set is easy to add and remove from Set + thing, or - thing and it removes it.
Each operation makes a new set rather than modifying an old one. By default they are immutable.

++ merges sets and -- for union and difference.
** is intersection (in 2.8 its now &)
Sets are unordered so Set(1,2,3) == Set(3,2,1)


Maps like a hash. Map(0 -> "test", 1 -> "another")
To add you can do map += 4 -> "another"

Any is the root class in the Scala class hierachy.
Nothing is a subtype of every type.
Everything inherits from any. And nothing inherits from everything.

Higher order functions. Scala will let you pass functions into foreach. A higher order function is one that produces or consumes functions. More specifically one that takes other functions as inputs or returns them as outputs.
higher oder functions is key to functional programming.

list.foreach(hobbit => println(hobbit))
hobbit => println(hobbit)
is an anoymous function - a function without a name. Left is the argument, right is the code.

isEmpty
length
size
head, tail (first and rest)
and just last
reverse
drop(1) will remove the one at the column they don't modify the original list
count - all that meet a rule
filter - all that meet a rule
map - returns new list
exists - does one meet a rule
forall - does all apply to this
.sort

foldLeft is like inject in ruby. YOu supply an inial value and a code block. The foldLeft will pass the code block will pass each element of the array and another value. /: is one way
val sum = (0 /: list) {(sum, i) => sum + i}
we invoke the operator with a value and a code block. It takes two values sum and i
Initially /: takes 0 and the first element of the list.
Then it takes 1 the first return fvalue and folds left to make that sum. Then it gets i the next element of the list. And runs it.
Finally it returns the end.

Fold left uses an idea called currying. functional languages use currying to transform a function with multiple parameters into several functions with their own parameter lists.

You can also do .foldLeft(0))((sum, value) => sum + value)
It has essentially two parameter lists. A bit like lambda calculus. You curry functions so you can have multiple arguments.

Much of functional programming is earning to manipulate collections with higher level constructs instead of java style iteration.


// Find a discussion on how to use scala files

So it's pretty simple (hopefully).
1. You can use Scala or Java's libraries. I'd prefer to use Scalas whic is scala.io.Source

import scala.io.Source

2. To open a file you do Source.fromFile('filename')

3. If you want to convert it to list, or array you do
    [].getLines.toList or .getLines.toArray

4. To a string.
    .toList.mkString

5. Want to loop over the file lines?
    .getLines.foreach()

6. Note the file remains oepn as long as the JVM is running. You can close it by saving the file as a val:
    val  file = Source.fromFile()
     then call   file.close

7. You can also use the loan pattern which ensures that a resource is deterministically disposed of when it goes out of scope.

// What makes a closure different from a code block

Stack overflow - a block is a piece of code that can be composed by statements and declarations but nothing else. A closure is a real first class object, a real variable that has a block as it's value.

A block groups instructions together. But a closure contains some code that can be executed.
Closures are a way to define custom behaviour of objects (Whilst you'd use interfacts in OOP).

aka a closure is a record storing a function.

// Use foldLeft to compute the total size of a list of strings

// Write a censor trait that will replace the curse words shoot and dark with Pucky and beans alternatives. Use a map to store the curse words and alternatives.

// Load the curse words and alternatives from a file

