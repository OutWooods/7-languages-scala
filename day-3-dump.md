Scala makes XML a firs class programming construct. So you can save XML as a variable and access different elements. 

scala has a query language for XML. 
You can get indexs () or nodes \ "moves" or attributes with @

Pattern matching lets you conditinally execute code based on some piece od data. 

chore match {
	case "wait" => "go"
	case "see" => "bird"
	case _ => "nothing"
}


next to each choe you have a code block, which simply return strings. _ is a wild card for anything else. 
So it will run different blocks if you give it different messages

You can also do guards aswell
so 

def factorial(n: Intt): Int = n match {
	case 0 => 1
	case x if x > 0 => factorial(n - 1) * n 
}

so you have the first case. But also a guard, in the second  = if x is > 0

Scala also has first class regex patterns. .r can translated a string to a regulat expression. Then you just do
    regularEpression.findFirstIn("message string")
    or regulatExpression.findAllIn("this message")

That also means you can loop through XML and do things conditionally based on pattern matching. 

Scala uses actors and message passing in its concurrency. Actors have pools of threads and queues, when you send a message to an actor using !. YOu place an object on its queue. The actor reads the message and takes action. 

You have an actor which you can extend in scala. 
Then, you can react to particualr cases - these could be objects
case Poke => 

Then you pass the messages to the actor, and you define these int he act method

actor !message

val caller = self 
YOu can do actor { caller ! (url, Do something with URL)}

use the recieve method to call something 
recieve {
	case(url, size) => 
	    println()
	}

Then the time method you can pass a method in, run it, and it'll wait until the actor is fully executed. The beauty of the actor model is you can get that to run synchronously, so your code waits for the result of the actor. 

Scala's pattern matching is very powerful, you can use guards, types amd regex. 

ACtors usually have a loppp statement around a react or recieve method. WHich does the work of recieving queued messages. 




