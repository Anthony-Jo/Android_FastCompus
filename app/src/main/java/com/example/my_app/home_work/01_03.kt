package com.example.my_app.home_work

fun digit_plus(number: Int) : Int
{
    var digit1: Int
    var digit2: Int
    var ret: Int

    if( (number >= 10) && (number <= 99) )
    {
        digit1 = number % 10
        digit2 = number / 10

        ret = digit1 + digit2
    }
    else
    {
        println("Invalid Input: Enter a number from 10 to 99")
        ret = -1
    }

    return ret
}

fun main(array: Array<String>)
{
    var number : Int = 0
    println("Please enter a double digit number.")
    number = readLine()!!.toInt()

    var result: Int = digit_plus(number)
    println("Input Number is " + number)
    println("Result is " + result)
}