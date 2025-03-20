package com.example.kotlinseriestrial.`8_OOP_Concepts`


/*
What is Inheritance?
Inheritance is a fundamental OOP (Object-Oriented Programming) concept that allows a class
to inherit properties and functions from another class.

The class that is inherited from is called the superclass (parent class).
The class that inherits is called the subclass (child class).
Kotlin uses the open keyword to allow a class to be inherited because,
by default, all classes in Kotlin are final (cannot be inherited).

Note: kotlin does not support Multiple Inheritance of class, instead of that use interfaces

 */


// Parent class (Superclass)
open class Animal {
    fun eat() {
        println("This animal is eating")
    }
}



// Child class (Subclass)
class Dog : Animal(){
    fun bark() {
        println("Dog is barking")
    }
}


fun main() {
    val dog = Dog()
    dog.eat()  // ✅ Inherited from Animal
    dog.bark() // ✅ Defined in Dog
}

