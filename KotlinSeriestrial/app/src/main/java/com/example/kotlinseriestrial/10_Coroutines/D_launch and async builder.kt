package com.example.kotlinseriestrial.`10_Coroutines`
import kotlinx.coroutines.*

// async and launch Uses
fun main() = runBlocking {
    val launchJob = launch {
        println("Launch: Start")
        delay(1000)
        println("Launch: End")
    }

    val asyncJob = async {
        println("Async: Start")
        delay(1000)
        "Async: End" // Returning a value
    }

    launchJob.join()  // Waits for launch to finish
    println(asyncJob.await())  // Retrieves async result
}

/*

A. launch : Does not return a value

B. async :  It return a value (Deferred Type)
            async returns a Deferred object.
            Deferred<T> is like a future/promise (it holds a result that will be available later).
            You must call .await() to retrieve the result.

 */