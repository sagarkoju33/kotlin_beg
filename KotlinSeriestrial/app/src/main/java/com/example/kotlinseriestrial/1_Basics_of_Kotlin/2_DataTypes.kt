package com.example.kotlinseriestrial.`1_Basics_of_Kotlin`


// 1.Numeric Data Types
//fun main() {
//
//    val byteVal: Byte = 127   // 8-bit integer
//    val shortVal: Short = 32000 // 16-bit integer
//    val intVal: Int = 100000  // 32-bit integer
//    val longVal: Long = 10000000000L  // 64-bit integer (suffix L)
//
//    println("1. Numeric Data Types -> Byte: $byteVal, Short: $shortVal, Int: $intVal, Long: $longVal")
//
//    val floatVal: Float = 3.14f  // 32-bit floating-point number (suffix f)
//    val doubleVal: Double = 2.71828  // 64-bit floating-point number
//
//    println("Float: $floatVal, Double: $doubleVal")
//
//}




//// 2. Character & String

//fun main() {
//
//    val charVal: Char = 'A' // Single character
//    val stringVal: String = "Hello, Kotlin!" // Text string
//
//    println("2. Character & String Data Types -> Char: $charVal, String: $stringVal")
//
//}








//// 3. Boolean Data Type


// fun main() {
//    val isKotlinFun: Boolean = true
//    val isJavaBetter: Boolean = false
//
//    println("Kotlin is fun: $isKotlinFun, Java is better: $isJavaBetter")
//}






// 4. Array Data Type
//fun main() {
//    val numbers : Array<Int> = arrayOf(1, 2, 3, 4, 5) // Integer array
//    val mixedArray  = arrayOf("Hello", 10, true) // Mixed type array
//
//    println("First number: ${numbers[0]}, Mixed Array: ${mixedArray.joinToString()}")
//    println(numbers[3])
//}







//// 5. Nullable Data Type

fun main() {
    var name: String? = null  // Nullable String
    println("Name: $name")

    name = "Shivam"
    println("Updated Name: $name")
}








