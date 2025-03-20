package com.example.kotlinseriestrial.`5_Functions`

// 1. main function (Entry point)










// 2. User define function









// 3. Parameterized Function

//fun greet(name: String, age: Int) {
//    println("Hello, $name! You are $age years old.")
//}
//
//fun main() {
//    greet("Shivam", 23) // Output: Hello, Shivam! You are 23 years old.
//}








//  4. Unit Returning Function, (A function that does not return a value (Unit is similar to void in Java)).









//  5. Single Expression Function

//fun square(n: Int) = n * n  // No need for return keyword
//
//fun main() {
//    println(square(5)) // Output: 25
//}








//  6. Explicit Return Type (When you specify the return type explicitly.)

//fun add(a: Int, b: Int): Int { // Explicit return type
//    return a + b
//}
//
//fun main() {
//    println(add(4, 6)) // Output: 10
//}









//  7. Generic Function (A function that can work with Any type of data.)

//fun <T> printData(data: T) {
//    println("Data: $data")
//}
//
//fun main() {
//    printData(10)      // Output: Data: 10
//    printData("Kotlin") // Output: Data: Kotlin
//}










//  8. Lambda Function (Higher-Order Function)
//  Lambda function: A function without a name.
//  Higher-order function: A function that takes another function as a parameter or returns one.









//  7. Member Function (A function inside a class)

//class Person(val name: String) {
//    fun introduce() {   // this is called member function
//        println("Hi, my name is $name")
//    }
//}
//
//fun main() {
//    val p = Person("Shivam")
//    p.introduce() // Output: Hi, my name is Shivam
//}





//  8. Overriding Function, (Used in inheritance when a subclass provides a specific implementation of a function.)


//open class Animal {
//    open fun makeSound() {
//        println("Animal makes a sound")
//    }
//}
//
//class Dog : Animal() {
//    override fun makeSound() {
//        println("Dog barks") // this is called overriding function
//    }
//}
//
//fun main() {
//    val myDog = Dog()
//    myDog.makeSound() // Output: Dog barks
//}




















