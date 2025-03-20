package com.example.kotlinseriestrial.`10_Coroutines`

// fetching user details from the database. using callback traditional way.

fun fetchUser(callback: (String) -> Unit) {
    Thread {
        Thread.sleep(2000)   // network calling
        callback("User data fetched")
    }.start()
}

fun fetchOrders(userData: String, callback: (String) -> Unit) {
    Thread {
        Thread.sleep(2000)
        callback("$userData → Orders fetched")
    }.start()
}

fun fetchOrderDetails(orderData: String, callback: (String) -> Unit) {
    Thread {
        Thread.sleep(2000)
        callback("$orderData → Order details fetched")
    }.start()
}

fun main() {
    fetchUser { userData ->
        println(userData)
        fetchOrders(userData) { orderData ->
            println(orderData)
            fetchOrderDetails(orderData) { orderDetails ->
                println(orderDetails)
            }
        }
    }
}



//// using coroutines
//// No Nesting
//// Easy to Read
//// Sequential Code Flow (Still Asynchronous)

//import kotlinx.coroutines.*
//
//
//suspend fun fetchUser(): String {
//    delay(2000) // Simulating network delay
//    return "User data fetched"
//}
//
//suspend fun fetchOrders(userData: String): String {
//    delay(2000)
//    return "$userData → Orders fetched"
//}
//
//suspend fun fetchOrderDetails(orderData: String): String {
//    delay(2000)
//    return "$orderData → Order details fetched"
//}
//
//fun main() = runBlocking {
//
//    val userData = fetchUser()
//    println(userData)
//
//    val orderData = fetchOrders(userData)
//    println(orderData)
//
//    val orderDetails = fetchOrderDetails(orderData)
//    println(orderDetails)
//}
//
//

