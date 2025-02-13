package com.creators.myfirstkotlinapplication.basic


/*
* Kotlin
* -> Starting point of the code is MAIN function, unless it's OOP/Android
* -> Variables (VAR & VAL -> VAR is mutable/changeable type, VAL is immutable/final type)
* -> Function (parameters, return type, named arguments)
* -> Conditional Statements (if, else, when. . .)
* -> Iterations (while, for, do while. . .)
*
* -> String Interpolation -> To modify the strings and use variables as value ( "Name: ${user.firstName}, ${user.lastName} -> $age years old " )
*
* -> Nullability: By default all kotlin types are not nullable, hence you need to declare if anything is nullable
*  - TYPE? -> this allows your variable to retain/contain null values
*  - ?: -> Elvis operator, it gives you an option to provide default value in case of null ( a ?: 2)
*  - !! -> Null Assertion, we/developer takes the responsibility that it will never be null, hence can produce null pointer exception ()
*  - ?. -> Safe Call, only run the next part of the code if the value is not null ( object?.userName )
* */

/*
* Expression -> it resolves/computes to a VALUE/OUTPUT (2+2), (a-b), (a==2)
* Statement -> it is a complete output, (var a = 2+2), (if (a==2) "Hi" else "Hola")
* Block -> a place with given criteria to write further/nested code, (if(a==2) { //multiple line of code }), (fun something(a: Int, b: Int) {//multiple lines of logic} )
* */

fun main() {
    val name =
        "Adam" // Kotlin compiler is smart and automatically assigns a type when not mentioned
    val nameType: String = "Adam" // We can specify the Type based on our choice
    var nameChangeable: String? = "Adam"
    var count: Int? = null

    nameChangeable = "Something new"
    nameChangeable = null

    count?.let {

    }

    count = 23

    println(name)
    println("Changeable Name-> $nameChangeable, with a counter $count")

    println(sumOfNumbers(2, 4))
    println(sumOfNumbers1(2, 4))
    println(sumOfNumbers2(2, 4))
    println(sumFunction(c = 2, b = 2, a = 5))
}

/*
* Write a function
*
* fun NAME_OF_FUNCTION ( PARAMETERS ): RETURN_TYPE { //block of code }
* fun sumOfTwo (a: Int, b: Int): Int { return a+b }
*
* */

fun sumOfNumbers(a: Int, b: Int): Int {
    return a + b
}

fun sumOfNumbers1(a: Int, b: Int): Int = a + b

fun sumOfNumbers2(a: Int, b: Int) = a + b

fun sumFunction(a: Int, b: Int, c: Int = 0) = a + b + c

