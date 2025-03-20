package com.example.kotlinseriestrial.`8_OOP_Concepts`




/*
  Object-Oriented Programming (OOP) consists of four fundamental principles:

  1. Abstraction – Hiding implementation details
  2. Encapsulation – Restricting direct access to data
  3. Polymorphism – One function, multiple forms
  4. Inheritance – Reusing properties and behaviors

Abstraction (Hiding Implementation Details)
Abstraction is the process of hiding implementation details and showing only the necessary features of an object.
In Kotlin, abstract classes and interfaces are used to achieve abstraction.

 */








//1. Example (using Abstract Class)

//abstract class Vehicle {
//    abstract fun start()  // Abstract method (must be implemented by subclass)
//
//    fun stop() {  // Concrete method (directly available in subclass)
//        println("Vehicle stopped")
//    }
//}
//
//class Car : Vehicle() {
//    override fun start() {
//        println("Car engine started")
//    }
//}
//
//fun main() {
//    val myCar = Car()
//    myCar.start()  // Calls overridden method
//    myCar.stop()   // Calls inherited method
//}



// 2. Example (using Abstract Class)
// Interface (100% Abstraction)

//interface Flyable {
//    fun fly()  // Abstract method (must be implemented)
//}
//
//class Bird : Flyable {
//    override fun fly() {
//        println("Bird is flying")
//    }
//}
//
//fun main() {
//    val sparrow = Bird()
//    sparrow.fly()
//}




