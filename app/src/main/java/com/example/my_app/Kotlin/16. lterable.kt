package com.example.my_app.Kotlin

import android.support.v4.app.INotificationSideChannel

fun main(array: Array<String>)
{
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (item in a )    /* for (value in a ) value 에서 부터 a 끝까지 */
    {
        if(item == 5)
        {
            println("item is five")
        }
        else
        {
            println("item is not five")
        }
    }
    println()

    for((index, item) in a.withIndex())
    {
        println("index: " + index + ", item: " + item)
    }

    println()
    a.forEach {
        println(it)
    }

    a.forEach { item ->
        println(item)
    }

    a.forEachIndexed { index, item ->
        println("index: " + index + ", item: " + item)
    }
    println()
    for ( i in 0 until a.size)  /*  for (int i = 0 ; i < 10 ; i++) */
    {
        println(a.get(i))       //until은 마지막을 포함하지 않는다. (0 ~ 8)
    }
    println()
    for ( i in 0 until a.size step (2) )    /*  for (int i = 0 ; i < 10 ; i++2 ) */
    {
        println(a.get(i))
    }
    println()
    for ( i in a.size -1 downTo (0))        /*  for (int i = 9 ; 1 <= 0 : i-- ) */
    {
        println(a.get(i))
    }
    println()
    for (i in a.size -1 downTo (0) step (2) )   /*  for (int i = 9 ; 1 <= 0 : i--2 ) */
    {
        println(a.get(i))
    }
    println()
    for (i in 0 .. 10)    /*  마지막 포함  */
    {
        println(i)
    }
    println()

    for (i in 0 .. a.size)    /*  마지막 포함  */
    {
        println(i)
    }
    println()

    var b: Int = 0
    var c: Int = 4

    while ( b < c )
    {
        println(b)
        b++                  /*  조건을 멈출 구문 필요함   */
    }
    println()

    var d: Int = 0
    var e: Int = 4

    do {
        println(d)
        d++
    }   while (d < e)       /*  조건을 만족하지 않아도 1번은 반복함    */
}
