package com.example.kotlinseriestrial.`8_OOP_Concepts`

/*
   Encapsulation (Data Hiding & Protection)

   Encapsulation is the practice of hiding an object's internal state and requiring all interactions to occur through controlled methods.

   Key Benefits:
   Protects data from unintended modification
   Reduces complexity by exposing only necessary details
   Improves code maintainability

   Encapsulation can be achieved by four access Modifiers:

  1. private → Only accessible inside the same class.
  2. protected → Accessible inside the same class and subclasses.
  3. internal → Accessible within the same module.
  4. public → Accessible everywhere (default modifier).

 */







//// Example private
//class Example {
//    private val secret = "Hidden Data"
//
//    private fun showSecret() {
//        println(secret)
//    }
//
//    fun accessSecret() {
//        showSecret()  // Allowed within the class
//    }
//}
//
//fun main() {
//    val obj = Example()
////     println(obj.secret)     // Error: Cannot access 'secret'
////     obj.showSecret()        // Error: Cannot access private function
//    obj.accessSecret()         // Allowed via public function
//}







//// protected (Accessible within the class & subclasses)
//open class ProtectedExample {
//    protected val protectedData = "Protected Data"
//
//    protected fun showData() {
//        println(protectedData)
//    }
//}
//
//class Child : ProtectedExample() {
//    fun accessProtected() {
//        showData()  // Allowed within subclass
//    }
//}
//
//fun main() {
//    val obj = Child()
//    obj.accessProtected()  // Allowed via subclass function
//                            // println(obj.protectedData) Error: Cannot access outside the class
//}


