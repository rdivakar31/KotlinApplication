package com.creators.myfirstkotlinapplication.basic.fundamentals


fun main() {
    val name: String = "Riya"  // Immutable
    var age: Int = 25          // Mutable
    println("Name: $name, Age: $age")
}
//Kotlin detects type automatically
//example code:
//  fun main() {
//    val city = "New York" // Kotlin knows it's a String
//    val number = 42       // Kotlin knows it's an Int
//    println("$city - $number")
//  }
