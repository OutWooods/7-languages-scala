Why are there larger and larger multicore processors?,Computer clock rate has started to slow as heat dissipation is a pain. The shift has been to multi-core processors. 
The traditional way of doing concurrency isi?, threads and locks
What solution does erlang and scala use for concurrency?,the actor model
What two key parts does an actor have?,a mailbox and a behaviour
Why do you not need locking in actor models?,state is not shared between actors. Messages are immuatble and owned by the reciever so they don't need locking
How connected are actors?,completely disconnected the only way they communicate is by messages. which are immutable
What can actors do?,send messsages to other actors - create new actors - run its thread
In the actor model are messages synchronous or asynchronous?,asynchronous - mailboxes hold all messages for them to be acted on
How do mailboxes decide what to do with messages?,pattern matching
What is key about processes in the actor model?,they're small and fast to create
Is there global state in actors?,Fundamentally there is no global state. Everything outside the actor is the external world. 
Each actor is running concurrently with other actors. It can be seen as a?, small independently running process. 
Erlang variables start with a?, capital letter or a _ 
Erlang variables can be assigned...?,only once
In Erland = is?, not an assignment. It is a pattern matcher - in the case of an unbound variable the pattern is unmatched and will bind a value on the right hand. 
words starting with lowercase are what in erlang?, atoms - fixed symbols that always represent a constant number or string of same name. 
