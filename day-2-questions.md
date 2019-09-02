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

// Use foldLeft to get a list of the length of strings

// Length (with both fold left styles)
val list =  List("1212", "12121", "121212")
val count = list.foldLeft(0)((count, current) => count + 1)
val otherCount = (0 /: list) {(count, current) => count + 1}

println(count)
println(otherCount)

// Length if all strings were joined together (with both fold left styles)
val totalLength = list.foldLeft(0)((count, current) => count + current.length)
val totalLength2 = (0 /: list) {(count, current) => count + current.length}

println(totalLength)
println(totalLength2)


// Write a censor trait that will replace the curse words shoot and dark with Pucky and beans alternatives. Use a map to store the curse words and alternatives.

// Load the curse words and alternatives from a file

