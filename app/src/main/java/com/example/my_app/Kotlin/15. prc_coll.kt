package com.example.my_app.Kotlin

fun main(array: Array<String>)
{
    val a = mutableListOf<Int>(3, 2, 1)
    a.add(4)
    println(a)

    a.add(0, 100)   /*  can not overwrite, just add   */
    println(a)

    a.set(0, 200)                   /*  overwrite   */
    println(a)

    a.removeAt(1)
    println(a)

    val b = mutableSetOf<Int>(4, 3, 2, 1)
    b.add(2)
    println(b)

    b.remove(2)
    println(b)

    b.remove(100)
    println(b)

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two", 2)
    println(c)
    c.replace("two", 3)
    println(c)

    println(c.keys)     /*  only keys   */
    println(c.values)   /*  only valuse */

    c.clear()
    println(c)

}