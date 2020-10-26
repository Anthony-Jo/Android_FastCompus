package com.example.my_app.Kotlin

fun main(array: Array<String>)
{
    var value: Int? = null

    when(value)
    {
        null -> println("value is null")
        else -> println("value is not null")
    }

    var value2: Boolean? = null
    /*  Boolean의 경우 조건문에서 true, false 그리고 null 3개의 경우의 수를 고려해야 한다.*/
    when(value2)
    {
        true -> println("value2 is true")
        false -> println("value2 is false")
        null -> println("value is null")
    }
    /* 값을 리턴하는 경우는 무조건 null을 고려 */
    val value3 = when(value2)
    {
        true -> 1
        false -> 3
        null -> 4   /*  or else */
    }

    val value4 : Int = 10
    when(value4)
    {
        is Int -> println("value4 is int")
        else -> println("value4 is not int")
    }

    val value5: Int = 70
    when(value5)
    {
        in 60 .. 70 -> println("60 < value5 <= 70")
        in 70 .. 80 -> println("70 < value5 <= 80")
        in 80 .. 90 -> println("80 < value5 <= 90")
    }
}

