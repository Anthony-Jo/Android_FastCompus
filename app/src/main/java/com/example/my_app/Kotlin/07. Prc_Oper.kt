package com.example.my_app.Kotlin

fun main(array: Array<String>)
{
    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    val f = 5
    //val 5 = f error

    println()

    a += 10
    println(a)
    b -= 10
    println(b)
    c *= 3
    println(c)
    d /= 4
    println(d)
    e %= 2
    println(e)

    a++
    b--
    println()
    println(a)
    println(b)

    var g = a > b
    var h = a == b
    var i = !h
    var l = i != h
    println()
    println(g)
    println(h)
    println(i)
    println(l)

    val j = h && i
    val k = h || i
    println()
    println(j)
    println(k)
}