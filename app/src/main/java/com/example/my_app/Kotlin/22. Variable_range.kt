package com.example.my_app.Kotlin

var number100: Int = 10

fun main(args: Array<String>)
{
    println(number100)

    val test = Test("Anthony")
    test.testFun()

    println(number100)
    println(test.name)
}

class Test(var name : String)
{
    fun testFun()
    {
        var birth : String = "2020/10/14"   /*  Can Access Only this function   */
        name = "JSK"                        /*  Can Access Only this class  */
        number100 = 100                     /*  Can Access All   */
        fun testFun2()
        {
            var gender: String = "male"
        }

    }

    fun testFun2()
    {

    }
}
