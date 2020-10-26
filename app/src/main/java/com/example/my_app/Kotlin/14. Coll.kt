package com.example.my_app.Kotlin


fun main(array: Array<String>)
{
    /*  List    */
    val numberList = listOf<Int>(1, 2, 3, 3, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[1])

    /*  Set */
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    //println(numberSet.get)
    numberSet.forEach { println(it) }

    /*  map */
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2, "three" to 3)
    println()
    println(numberMap.get("one"))

    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(5)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)
}