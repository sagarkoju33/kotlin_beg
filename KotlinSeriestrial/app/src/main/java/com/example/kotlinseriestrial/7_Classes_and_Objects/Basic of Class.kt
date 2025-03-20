package com.example.kotlinseriestrial.`7_Classes_and_Objects`



/*
1. What is a Class?
A class in Kotlin is a blueprint for creating objects. It defines:

    Properties (variables)
    Methods (Functions) that operate on those properties

Think of a class like a car blueprint – it tells how the car should be built but isn’t an actual car yet.

*/





// 2. How to create class ->









// 3. What is an Object?
//An object is an instance of a class. You need an object to access a class’s properties and methods.








/*


4.  Constructors in Kotlin

A constructor is a special function that is used to initialize a class when an object is created.
Types of Constructors:
1.	Primary Constructor
2.	Secondary Constructor
3.	init Block (Initialization Block)



 */



// Example ->

// 1. Primary Constructor (A primary constructor is declared in the class header using the constructor keyword.)

//class Student(val name: String, val age: Int) {
//    fun display() {
//        println("Student Name: $name, Age: $age")
//    }
//}
//
//fun main() {
//    val s = Student("Shivam", 23) // Passing arguments to the constructor
//    s.display()
//}










// 2. Secondary Constructor (A secondary constructor is declared inside the class body using constructor keyword.)
//class Employee {
//    var name: String
//    var age: Int
//
//    // Secondary Constructor
//    constructor(name: String, age: Int) {
//        this.name = name
//        this.age = age
//    }
//
//    fun display() {
//        println("Employee Name: $name, Age: $age")
//    }
//}
//
//fun main() {
//    val e = Employee("Amit", 30)
//    e.display()
//}


// 3. init Block (For Extra Initialization)
//The init block is executed as soon as the object is created, before any other functions run.

//class Car(val brand: String, val model: String) {
//    init {
//        println("Car $brand $model is created!")
//    }
//}
//
//fun main() {
//    val c = Car("Tesla", "Model X")
//}











































