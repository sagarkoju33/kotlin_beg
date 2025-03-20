package com.example.kotlinseriestrial.`10_Coroutines`

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*
import kotlin.random.Random

// Simulated GPS Location Provider (Normally, you'd use Android's LocationManager or FusedLocationProvider for real-world scenarios)
class LocationProvider {

    private var listener: ((String) -> Unit)? = null    // Declaring a listener, which is a function that takes a String (location) and returns nothing

    // Function to start GPS location updates (Simulating a real-world scenario where GPS sends updates continuously)
    fun startLocationUpdates() {
        CoroutineScope(Dispatchers.Default).launch {                                         // Launching a coroutine in the background (on the Default dispatcher, meant for computational tasks)
            while (true) {                                                                   // Infinite loop to simulate continuous GPS updates
                delay(2000)                                                          // Simulating a GPS update every 2 seconds (2000 milliseconds)
                val location = "Lat: ${Random.nextDouble(20.0, 50.0)}, Lng: ${Random.nextDouble(60.0, 90.0)}"                                                                              // Generating a mock GPS location using random latitude and longitude
                listener?.invoke(location) // Invoking the listener (callback function) with the generated location data, notifying subscribers
            }
        }
    }

    // Function to register a location update listener
    // This allows external components (like the Flow in getLocationFlow) to receive location updates whenever available
    fun setOnLocationUpdateListener(callback: (String) -> Unit) {
        listener = callback                                                  // Assigning the callback function to the listener variable so that it can be used when GPS updates occur
    }
}

// Function to convert GPS updates to a Flow using callbackFlow
// This makes the GPS location updates reactive and lifecycle-aware, allowing collectors to receive updates as they arrive
fun getLocationFlow(): Flow<String> = callbackFlow {
    val locationProvider = LocationProvider() // Creating an instance of LocationProvider to simulate GPS tracking

    // Registering a listener to receive GPS updates
    locationProvider.setOnLocationUpdateListener { location ->
        trySend(location) // Sending the received location to the Flow's collector, ensuring the data stream continues
    }

    locationProvider.startLocationUpdates() // Calling the function to start generating and sending location updates

    // awaitClose() ensures that the Flow remains active until the collector is canceled
    // When the collector stops collecting, awaitClose is triggered to clean up resources (though no cleanup is needed here)
    awaitClose { /* No explicit cleanup needed in this simulation, but in real cases, you'd remove the listener here */ }
}

// Main function that collects GPS location updates from the Flow
fun main() =
    runBlocking { // runBlocking is used to block the main thread and run coroutines in a synchronous way
        val locationFlow = getLocationFlow() // Getting the Flow instance that provides GPS updates

        // Collecting each emitted location from the Flow
        // This keeps receiving and printing GPS location updates until the program is manually stopped
        locationFlow.collect { location ->
            println("Received Location: $location") // Printing the received location to the console
        }
    }
