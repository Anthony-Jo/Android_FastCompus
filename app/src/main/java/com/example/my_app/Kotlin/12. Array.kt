package com.example.my_app.Kotlin

fun main(array: Array<String>)
{
    val one: Int = 1
    val two: Int = 2
    val three: Int = 3
    val four: Int = 4
    val five: Int = 5

    var number1 : Int = 1                                 /*  변수의 선언  */
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5, 6)           /*  배열의 생성  */

    println(group1 is Array)

    var number2 = 10
    var group2 = arrayOf(1, 2, 3.5, "hello", 5, 6)          /*  배열의 생성(Type 지정없이)   */
    /*  배열의 사용  */
    val test1 = group1.get(0)
    println(test1)

    val test2 = group1.get(4)
    println(test2)

    val test3 = group1[0]
    val test4 = group1[4]

    println(test3)
    println(test4)

    /*  배열 값의 변경    */
    group1.set(0, 100)  /*  changed index 0 to 100  */
    println(group1[0])

    group1[2] = 200
    println(group1[2])
}

