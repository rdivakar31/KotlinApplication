package com.creators.myfirstkotlinapplication.basic.oop

class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Hi, I'm $name and I'm $age years old.")
    }
}

fun main() {
    val person = Person("Riya", 25)
    person.introduce()
}
