package com.example.my_app.home_work

import com.example.my_app.Kotlin.num

class Calculation (var num1 : Int, var num2 : Int) {
    fun plus_ () : Int {
        return num1 + num2
    }

    fun minus_ () : Int {
        return num1 - num2
    }

    fun multiplication_ () : Int {
        return num1 * num2
    }

    fun division_ () : Int {
        return num1 / num2
    }
}

fun main(args: Array<String>) {

    var number1: Int = 10
    var number2: Int = 5

    var calculation = Calculation (number1, number2)

    println("$number1 + $number2 = ${calculation.plus_()}")
    println("$number1 / $number2 = ${calculation.minus_()}")
    println("$number1 * $number2 = ${calculation.multiplication_()}")
    println("$number1 / $number2 = ${calculation.division_()}")

}
