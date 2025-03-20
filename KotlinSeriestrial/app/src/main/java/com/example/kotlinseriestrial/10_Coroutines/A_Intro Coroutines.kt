package com.example.kotlinseriestrial.`10_Coroutines`
import kotlinx.coroutines.*

/*

1. What are Coroutines in Kotlin?

Ans. Coroutines in Kotlin are lightweight threads that allow you to write asynchronous,
non-blocking code in a more readable and structured way.
Unlike traditional threads, coroutines do not create new system threads; instead,
they run within a single thread and can be suspended and resumed efficiently.

2. What is Asynchronous Programming or Non Blocking Code

3. Threads : Threads are the smallest unit of execution in a program.

4. Why Coroutine Introduced ?

a. Efficient & Lightweight:
   Coroutines avoid creating multiple threads, reducing memory and CPU usage.

b. Asynchronous & Non-blocking:
   Ideal for tasks like network requests, database operations,
   and file I/O without blocking the main thread.

c. Structured Concurrency: Makes it easier to manage background tasks without callback hell.

5. How Coroutine function made and what are types?

*/


fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}







// Now you want you use coroutine on other function, because you know that function take time in execution (like Network calling)

//fun main() = runBlocking { // this: CoroutineScope
//    launch { network() }
//    println("Hello")
//}
//
//// this is your first suspending function
//suspend fun network() {
//    delay(1000L)
//    println("World!")
//}


// See Real world example in the Fetching Data from database.