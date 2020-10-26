package com.example.my_app.Kotlin

fun main(array: Array<String>)
{
    val array = arrayOf<Int>(1, 2, 3)

    val number1 = array.get(0)
    println(number1)
//    val number2 = array.get(100)    /*  Stack Over Flow Error   */
//    println(number2)

    array.set(0, 100)
    val number3 = array.get(0)
    println(number3)

//    array.set(100, 100)             /*  Stack Over Flow Error   */

    val a1 = intArrayOf(1, 2, 3)                /*  only int  */
    val a2 = charArrayOf('a', 'b')              /*  only char   */
    val a3 = doubleArrayOf(1.2 , 3.4)           /*  only double */
    val a4 = booleanArrayOf(true, false, true)  /*  only boolean    */

    var a5 = Array(10, { 0 })         /*  Array(size, { object 1; object 2; ... } ) */
    var a6 = Array(5, { 1; 2; 3; 4; 5 } )
}