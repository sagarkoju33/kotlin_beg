package com.example.kotlinseriestrial.`8_OOP_Concepts`

/*
    What is Polymorphism?
    Polymorphism means "many forms." It allows us to use a single interface or method in multiple ways.

    Kotlin supports two types of Polymorphism:

    1. Compile-time Polymorphism (Method Overloading) – Same function name, different parameters.
    2.Runtime Polymorphism (Method Overriding) – Same function, different behavior in subclass.

*/

/*
    Compile-time Polymorphism (Method Overloading)
    Method overloading means multiple functions with the same name but different parameters.
*/

//class Calculator {
//    fun add(a: Int, b: Int): Int {
//        return a + b
//    }
//
//    fun add(a: Int, b: Int, c: Int): Int {
//        return a + b + c
//    }
//
//    fun add(a: Double, b: Double): Double {
//        return a + b
//    }
//}
//
//fun main() {
//    val calc = Calculator()
//    println(calc.add(5, 10))        // Calls add(Int, Int)
//    println(calc.add(5, 10, 15)) //  Calls add(Int, Int, Int)
//    println(calc.add(5.5, 10.5))    //  Calls add(Double, Double)
//}

//Same function name add()
//Different parameter lists (different arguments).
//Kotlin decides at compile time which function to call.






/*
    1. Runtime Polymorphism (Method Overriding)
    2. Method overriding allows a subclass to provide a different implementation of a method from the superclass
*/

//open class Animal {
//    open fun makeSound() {
//        println("Animal is making a sound")
//    }
//}
//
//class Dog : Animal() {
//    override fun makeSound() {
//        println("Dog is barking")
//    }
//}
//
//class Cat : Animal() {
//    override fun makeSound() {
//        println("Cat is meowing")
//    }
//}
//
//fun main() {
//    val animal: Animal = Dog()  // Reference of Animal, but object of Dog
//    animal.makeSound()          // Calls Dog's makeSound()
//    val anotherAnimal: Animal = Cat()
//    anotherAnimal.makeSound()   // Calls Cat's makeSound()
//}