package com.example.my_app.Kotlin

// 29. 제너릭

fun main(args: Array<String>) {                     /*  <String>이 제너릭   */
    val list1 = listOf(1, 2, 3, "A")                /*  Generic (x) */
    val b : String = list1[2].toString()            /*  Type Change  */

    val list2 = listOf<String>("A", "B", "C")       /*  Generic (o): Type Safe */
    val c : String = list2[2]                       /*  Type 보장 */

    val list3 = listOf(1, 2, 3, 4, "A", "B", 3.0)   /*  강한 타입 체크    */

    val list5 = listOf(1, 2, 3, "A")                /*  Type is Any(?)  */

    /*  부모: Any,
        자식: String, Int, Float    */


}