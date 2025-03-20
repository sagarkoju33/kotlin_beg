package com.example.kotlinseriestrial.`6_Interfaces`

// 1. Interface with Default Methods
//  Unlike Java, Kotlin allows default method implementations inside interfaces.
//  If a class does not override the method, the default implementation is used.


//  Example: Interface with Default Implementation

//interface Animal {
//    fun makeSound() {
//        println("Some generic animal sound") // Default implementation
//    }
//}
//
//class Cat : Animal {  // No need to override unless you want custom behavior
//
//}
//
//
//fun main() {
//    val cat = Cat()
//    cat.makeSound() // Uses default implementation
//}








//  2.Implementing Multiple Interfaces
//  A class can implement multiple interfaces, unlike class inheritance.
// Example: Multiple Interfaces

//interface Engine {
//    fun start() {
//        println("Engine started")
//    }
//}
//
//interface Wheels {
//    fun roll() {
//        println("Wheels are rolling")
//    }
//}
//
//class Car : Engine, Wheels  // Implements both interfaces
//fun main() {
//    val car = Car()
//    car.start()  // From Engine interface
//    car.roll()   // From Wheels interface
//}

//The Car class implements both Engine and Wheels interfaces.







//  3. Handling Conflicts in Interfaces
//  If multiple interfaces have the same method, you must explicitly override it.
//  Example: Resolving Interface Conflict

//interface A {
//    fun show() {
//        println("Interface A")
//    }
//}
//
//interface B {
//    fun show() {
//        println("Interface B")
//    }
//}
//
//class C : A, B {
//    override fun show() {
//        super<A>.show()  // Explicitly calling A's method
//    }
//}
//
//fun main() {
//    val obj = C()
//    obj.show()
//}

//Since A and B both have show(), we explicitly specify which one to use.














