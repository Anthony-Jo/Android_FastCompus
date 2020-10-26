package com.example.my_app.Kotlin

// 06. 연산자

// 산술 연산자: +, -, *, /, %

// 대입 연산자: 좌변 = 우변 (우변에 있는것이 좌변으로 대입된다)

// 복합 대입 연산자: +=, -+, *=, /=, %=
// a += 10 (a 값에 10을 더해서 대입한다, a = a + 10)
//증감 연산자: ++, --
// a++, a--

// 비교 연산자
// >, >=, <, <=, ==, !=
// True == True -> True
// True == False -> False
// True != True -> False
// True != False -> True

//논리 연산자: &&, ||, !
// True && True -> True
// True || True -> True
// !True -> False

fun exam(num1: Int, num2: Int)
{
    var temp1 = num1
    var temp2 = num1

    var result1 = temp1++
    var result2 = ++temp2

    println("num1++ -> " + result1)
    println("++num1 -> " + result2)
}

fun main(array: Array<String>)
{
    exam(1, 2)
}