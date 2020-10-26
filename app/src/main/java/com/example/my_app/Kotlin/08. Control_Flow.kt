package com.example.my_app.Kotlin

// 08. Control Flow

fun main(array: Array<String>)
{
    val a : Int = 5
    val b : Int = 10


    if (a > b)
    {
        println("a 가 b 보다 크다")
    }
    else
    {
        println("a가 b 보다 작다")
    }

    if (a > b)
    {
        println("a 가 b 보다 크다")
    }
    if (a > b)
    {
        println("a 가 b 보다 크다")
    }
    else if ( a < b )
    {
        println("a가 b 보다 작다")
    }
    else if ( a == b)
    {
        println("a와 b가 같다")
    }
    if ( a != b )
    {
        println("a와 b가 다르다")
    }

    val max = if ( a > b )
    {
        a
    }
    else
    {
        b
    }

    val max1 = if( a > b ) a else b

    println()
    println(max)
    println(max1)
}