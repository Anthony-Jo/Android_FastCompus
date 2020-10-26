package com.example.my_app.Kotlin

fun main(array: Array<String>)
{
    val testAccess : TestAccess = TestAccess("Anthony")
    testAccess.test()                   /*  access to function  */
/*
    println(testAccess.name)            /*  access to variable  */
    testAccess.name = "seoul"           /*  객체 안의 멤버 변수를 마음대로 바꾸면 문제가 발생 할 수 있음 */
    println(testAccess.name)
*/
    val reward : Reward = Reward()
    println(reward.rewardAmount)
    reward.rewardAmount = 2000          /*  객체 안의 멤버 변수를 마음대로 바꾸면 문제가 발생 할 수 있음 */
    println(reward.rewardAmount)
}

class Reward()
{
    var rewardAmount: Int = 1000
}

class TestAccess
{
    private var name :String = "JSK"    /*  객체 안의 멤버 변수를 외부에서 변경 불가 */

    constructor(name: String)
    {
        this.name = name
    }
    fun test()
    {
        println("Test")
    }
}

class Running()