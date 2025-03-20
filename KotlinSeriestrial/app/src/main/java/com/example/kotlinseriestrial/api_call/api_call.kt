Step 1: Add Dependencies

In build.gradle (Module: app), we add necessary dependencies:
dependencies {
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.3' // Optional for debugging
}
Explanation
retrofit:2.9.0: The core Retrofit library.
converter-gson:2.9.0: Converts JSON responses to Kotlin objects.
logging-interceptor:4.9.3: (Optional) Helps in debugging network requests.


Step 2: Create a Data Model
data class User(
    val name: String,
    val email: String
)

data class ApiResponse(
    val id: Int,
    val name: String,
    val email: String,
    val createdAt: String
)

Explanation
data class User: Represents the request body (data we send to the API).
data class ApiResponse: Represents the response body (data we get from the API).

Step 3: Define the API Interface
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("users") // Replace with actual endpoint
    fun createUser(@Body user: User): Call<ApiResponse>
}

Explanation
@POST("users"): Defines a POST request with the "users" endpoint.
@Body user: User: Sends the User object as JSON in the request body.
Call<ApiResponse>: The API returns a response wrapped in a Call object.


Step 4: Create a Retrofit Client
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/" // Replace with actual API URL

    val instance: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL) // Sets the base URL for API requests
            .addConverterFactory(GsonConverterFactory.create()) // Converts JSON responses
            .build()
            .create(ApiService::class.java) // Creates an instance of ApiService
    }
}

Explanation
object RetrofitClient: Singleton object to avoid multiple instances of Retrofit.
BASE_URL: The base API URL (change it to your API's URL).
Retrofit.Builder():
baseUrl(BASE_URL): Sets the base URL.
addConverterFactory(GsonConverterFactory.create()): Converts JSON responses into Kotlin objects.
build(): Creates the Retrofit instance.
create(ApiService::class.java): Creates an instance of ApiService to call APIs.

Step 5: Call the API in an Activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createUser()
    }

    private fun createUser() {
        val newUser = User(name = "John Doe", email = "john.doe@example.com")

        val call = RetrofitClient.instance.createUser(newUser)

        call.enqueue(object : Callback<ApiResponse> {
            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                if (response.isSuccessful) {
                    val apiResponse = response.body()
                    Log.d("API_SUCCESS", "User Created: ${apiResponse?.name}, ID: ${apiResponse?.id}")
                } else {
                    Log.e("API_ERROR", "Response failed: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                Log.e("API_FAILURE", "Error: ${t.message}")
            }
        })
    }
}

Explanation
Activity Lifecycle
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    createUser()
}
onCreate(): Called when the activity starts.
setContentView(): Sets the UI layout.
createUser(): Calls the API function.

Create and Send API Request

val newUser = User(name = "John Doe", email = "john.doe@example.com")
val call = RetrofitClient.instance.createUser(newUser)
Creates a User object.
Calls createUser(newUser) from ApiService.


Handle API Response (Asynchronous Call)
call.enqueue(object : Callback<ApiResponse> {
    override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
        if (response.isSuccessful) {
            val apiResponse = response.body()
            Log.d("API_SUCCESS", "User Created: ${apiResponse?.name}, ID: ${apiResponse?.id}")
        } else {
            Log.e("API_ERROR", "Response failed: ${response.code()}")
        }
    }

    override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
        Log.e("API_FAILURE", "Error: ${t.message}")
    }
})
onResponse(): Called when the API responds.
Checks response.isSuccessful to ensure success.
Retrieves and logs the user ID and name.
onFailure(): Called if the API request fails (e.g., no internet).

Bonus: Using Coroutines (Recommended)
Instead of Call<ApiResponse>, we use Coroutines for a cleaner approach.

Modify the API Interface

import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("users")
    suspend fun createUser(@Body user: User): ApiResponse
}

Call API in a ViewModel
kotlin
Copy
Edit
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {
    fun createUser() {
        viewModelScope.launch {
            try {
                val newUser = User(name = "Jane Doe", email = "jane.doe@example.com")
                val response = RetrofitClient.instance.createUser(newUser)
                println("User Created: ${response.name}, ID: ${response.id}")
            } catch (e: Exception) {
                println("Error: ${e.message}")
            }
        }
    }
}
Why Use Coroutines?
✔ Simplifies API calls (No need for enqueue())
✔ Avoids callback hell
✔ Works better with ViewModel


What is enqueue() in Retrofit?
In Retrofit, the enqueue() method is used to make an asynchronous API request. It allows the request to be executed in the background without blocking the main UI thread.

Breakdown of enqueue()
Makes a network request asynchronously

enqueue() sends the API request in the background (separate from the UI thread).
The UI remains responsive while waiting for the response.
Callback Handling

onResponse(): Triggered when a response is received from the API.
onFailure(): Triggered if there is a network failure, timeout, or any issue in the request.


Alternative: Using Coroutines Instead of enqueue()
Instead of:

call.enqueue(object : Callback<ApiResponse> { ... })
We can use Kotlin Coroutines:


suspend fun createUser(user: User): ApiResponse {
    return RetrofitClient.instance.createUser(user)
}
This avoids callback hell and makes code cleaner.


Conclusion
enqueue() is an asynchronous way to call APIs in Retrofit.
It does not block the UI thread.
It provides two callback methods: onResponse() (for success) and onFailure() (for errors).
If you prefer cleaner code, use coroutines instead of enqueue().