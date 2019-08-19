// Find a comparison of Java and Scala

/*

   Geeks for Geeks - Scala is designed to express the general programming patterns in a refined, succint and type safe way. 

   Java is pure OO but Scala is mixed. 
   Compiling code is slower in scala, and less readable due to nested code. 

   Operator overloading is a case of polymorphism where operators have different implementations depending on their arguements

   Other sources suggest that Scala is more concise than java. But this seems to have a cost of being more complex.  

   Scala uses an actor based concurrency model (whislt java is thread based).

*/

// A discussion of val versus var

/*

   An object assigned to val cannot be replaced 
   An object assigned to var can be

   However a val can still have its internal state modified. 

   If you use val exclusively and only immutable data structures - avoid arrays and scala.collection.mutable types then you can be confident you won't have race condition issues in multi-threaded systems. 

   The second advantage is with var you can be tempted to use var for multiple purposes. So it's harder to read and follow. Val leads to more readable code. `

   But not having mutable values makes loops harder - and you often resort to recursion instead. As for or while loops with a mutable counter are super simple and expressive. 



*/


// Write a game that will take a tic-tac-toe board with X, O and blank characters and detec the winner or whthere there is a tie or no winner yet. Use classes where appropriate

// Let two players play tic tac toe
