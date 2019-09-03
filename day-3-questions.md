// What would happen for your page size programme if you ran it without actors, so you did it synchronously. What would happen to performance?

It would start to get painfully slow the more and more links you add. As execution would have to wait for each page to be loaded and sent back. This process means the system scales much better.

// take the size application and add a message to count the number of https:// links on the page
// I wanted to mainly use the regex, so here I focused on getting https links, as this made sense for the next task. Could be easily extended to other urls and set to only anchor tags

import scala.io.Source
import scala.actors._
import scala.actors.Actor._

object PageLoader {
    def getUrls(url : String):Int = {
        val result = Source.fromURL(url).mkString
        val reg = "https://.+?(?=\")".r
        val count = reg.findAllIn(result).toList
        return count.length
    }
}

val urls = List("https://www.twitter.com",
                "https://www.bbc.co.uk")

def timeMethod(method: () => Unit) = {
    val start = System.nanoTime
    method()
    val result = start - System.nanoTime / 1000000000.0
    println("Method took " + result + " seconds.")
}

def getPageSizeConcurrently() = {
    val caller = self

    for(url <- urls) {
        actor { caller ! (url, PageLoader.getUrls(url)) }
    }

    for(i <- 1 to urls.size) {
        receive {
            case(url, size) =>
                println("Size for " + url + ": " + size)
        }
    }
}


timeMethod { getPageSizeConcurrently }


// Bonus problem - make the size follow the links on a given page and laod them as well. So size for google would go to all the pages it links to.


