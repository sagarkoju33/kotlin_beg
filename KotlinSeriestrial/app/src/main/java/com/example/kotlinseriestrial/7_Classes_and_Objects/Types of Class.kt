package com.example.kotlinseriestrial.`7_Classes_and_Objects`

// Types of Classes in Kotlin (Kotlin offers different types of classes depending on use cases).


// 1. Data Class Used to store data, and automatically provides useful methods like toString(), copy(), equals(), etc.






//  2. Enum Class (Used for defining constant values).






// 3. Sealed Class (A sealed class is like an enum but with more flexibility, used for defining restricted hierarchies.)







// 4. Abstract Class An abstract class cannot be instantiated and must be inherited.

//abstract class Animal {
//    abstract fun makeSound()
//}
//
//class Dog : Animal() {
//    override fun makeSound() {
//        println("Dog barks")
//    }
//}
//
//fun main() {
//    val d = Dog()
//    d.makeSound()
//}
// Use case: When you want to enforce a common behavior in child classes.


// 5. Singleton Object (Single Instance) A singleton is a class that can have only one instance.

//object Database {
//    fun connect() {
//        println("Connected to the database")
//    }
//}
//
//fun main() {
//    Database.connect()
//}
