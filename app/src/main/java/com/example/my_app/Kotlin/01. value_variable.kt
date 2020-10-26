package com.example.my_app.Kotlin

/*  변수
*   val(상수) or var(변수) */

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args: Array<String>)
{

    println("var num = " + num)
    println("var hello = " + hello)
    println("var point = " + point)
    println("val fix = " + fix)

    num = 20
    hello = "goodbye"
    point = 10.4
    //fix = 500 Error val is can not change

    println("var num = " + num)
    println("var hello = " + hello)
    println("var point = " + point)
    println("val fix = " + fix)
}