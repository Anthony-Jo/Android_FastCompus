package com.example.my_app.home_work

fun main(array: Array<String>)
{
    for(i in 1 until 10)
    {
        println("" + i + "단")
        for(j in 1 until 10)
        {
            println("" + i + " X " + j + " = " + i * j)
        }
        println()
    }
}