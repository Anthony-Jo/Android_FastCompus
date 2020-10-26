package com.example.my_app.Kotlin

var a = 1 + 2 + 3 + 4 + 5
var b = "1"
var c = b.toInt()   // String to Int
var d = b.toFloat() // String to Float

var e = "John"
var f = "My name is $e Nice to meet you"    //이스케이프 문자 "$e"

// Null
// 존재하지 않는다.

//var abc : Int = null    //null을 가질 수 없는 자료형 에러
var abc1 : Int? = null      //자료형 뒤에 ? 를 붙이면 null을 가질 수 있다.
var abc2 : Double? = null   // "null"(String) 이 아님!!!

var g = a + 3

fun main(array: Array<String>)
{
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc1)
    println(g)
}