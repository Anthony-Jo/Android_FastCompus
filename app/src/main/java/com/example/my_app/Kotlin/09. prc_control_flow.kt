package com.example.my_app.Kotlin

fun main(array: Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a in not null")
    }

    if ((b + c) == 110) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }

    //엘비스 연산자
    val number1: Int? = null
    val number2 = number1 ?: 10 /* "?:" if number1 is null, number2 is 10, else number2 is number1 */

    println()
    println(number2)

    val num1 : Int = 10
    val num2 : Int = 20

    val max2 =
        if ( num1 > num2 )
        {
            num1
        }
        else if ( num1 == num2 )
        {
            num2
        }
        else
        {
            100
        }

}