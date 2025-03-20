package com.example.kotlinseriestrial.`10_Coroutines`

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun main() {  //The main function runs on the main thread.

    println("Code Start: ${Thread.currentThread().name}")

    // Launching a coroutine in the background, asynchronous programming
    CoroutineScope(Dispatchers.IO).launch {     // launch, async is the coroutine builder and GlobalScope,CoroutineScope,  is Coroutine Scope
        val result = fetchUserData()
        println("User Data: $result on ${Thread.currentThread().name}")
    }

    println("this is UI code is running : ${Thread.currentThread().name}")
    Thread.sleep(3000) // Prevents the program from exiting immediately
}

/*

1. Dispatchers.IO → Optimized for network & disk operations
                    Used for API calls, database operations, file I/O, etc.
                    Example: Fetching user data from a server.

2. Dispatchers.Default → Optimized for CPU-intensive tasks
                         Used for heavy calculations, sorting, data processing, etc.
                         Example: Processing user data after fetching it.

3.Dispatchers.Main → Runs on the Main/UI thread
                     Used for updating UI (only works in Android apps).
                     Example: Displaying data on the screen.

4.Dispatchers.Unconfined → Starts in the current thread, but may switch
                           Used for lightweight coroutines that don’t need a specific dispatcher.


 */


