package com.example.kotlinseriestrial.`10_Coroutines`

import kotlinx.coroutines.*


// Example of Simulating a network request (mimic)
suspend fun fetchUserData(): String {
    delay(2000) //  Here code of fetching data from database (Simulating network delay)
    return "Shivam Sharma"
}


fun main() {  //The main function runs on the main thread.

    println("Code Start: ${Thread.currentThread().name}")

    // Launching a coroutine in the background, asynchronous programming
    GlobalScope.launch {     // launch, async is the coroutine builder and GlobalScope,CoroutineScope,  is Coroutine Scope
        val result = fetchUserData()
        println("User Data: $result on ${Thread.currentThread().name}")
    }

    println("this is UI code is running : ${Thread.currentThread().name}")



    Thread.sleep(3000) // Prevents the program from exiting immediately
}






/*

1. launch and async are  the coroutine builder

Example :-> For more Go In launch and async coroutine File


2. Four Main of Coroutines Scopes

A. GlobalScope : Coroutines started in GlobalScope are independent of the caller’s lifecycle.
                 They will keep running until they complete or the application shuts down.
                 It can lead to memory leaks if the coroutine is not properly managed.

B. CoroutineScope (Manually controlled scope): Used to create a custom scope that can be controlled explicitly by canceling it.
                                               when to use-> When you need manual control over coroutine cancellation.

      Example ->       val scope = CoroutineScope(Dispatchers.IO) // Creating a scope
                       scope.launch {
                                     delay(1000)
                                     println("Running in CoroutineScope!")
                                        }
                       scope.cancel() // Cancels all coroutines in this scope


C. LifecycleScope (Scope for Android Activities & Fragments) :

   Used in Activities and Fragments to launch coroutines that should be canceled when the lifecycle reaches a certain state.
   Coroutines in this scope are automatically canceled when the lifecycle ends (e.g., Activity is destroyed).
   Best for UI-related tasks that should be canceled when the Activity/Fragment is destroyed.

D. ViewModelScope (Scope for Android ViewModel): Used in Android’s ViewModel to run coroutines tied to the ViewModel’s lifecycle.
                                                 Coroutines are automatically canceled when the ViewModel is cleared.

                Example -> class MyViewModel : ViewModel() {
                                    init {
                                        viewModelScope.launch {
                                                delay(1000)
                                                println("Running in ViewModelScope!")
                                           }
                                         }
                                      }



E. SupervisorScope :  A special scope where child coroutines fail independently (one coroutine failing doesn't cancel others).  */

// Example :->

//fun main() = runBlocking {
//    supervisorScope { // Starts a supervisor scope
//        launch {
//            delay(1000)
//            println("Child 1: Completed Successfully")
//        }
//
//        launch {
//            delay(500)
//            throw Exception("Child 2: Failed!") // This will fail, but won't affect the other coroutines
//        }
//
//        launch {
//            delay(1500)
//            println("Child 3: Still Running Even After Failure of Child 2")
//        }
//    }
//
//    println("SupervisorScope Completed")
//}













