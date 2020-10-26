package com.example.my_app.Kotlin

import android.support.v4.app.INotificationSideChannel

fun plusThree(first: Int, second: Int, third: Int) : Int
{
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1 , third: Int = 1) : Int
{
    return first * second * third
}

// 내부 함수: 함수 안의 함수
fun showMyPlus(first: Int, second: Int) : Int
{
    println(first)
    println(second)

    fun plus(first: Int, second: Int) : Int
    {
        return first + second
    }
    return plus(first, second)
}

fun main(array: Array<String>)
{
    var result = plusThree(1, 2, 3)
    println(result)

    var result1 = minusThree(10, 1, 2)
    println(result1)

    var result2 = multiplyThree(2,2,2)
    println(result2)

    var result3 = multiplyThree()
    println(result3)

    println()
    var result4 = showMyPlus(4, 5)
    println(result4)

}