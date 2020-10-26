package com.example.my_app.Kotlin

// 04. function
// 함수

/*
fun <functionName> (변수명 : 타입, 변수명 : 타입 .....) : 반환형
{
        .....(함수 내용)
        return 반환값
}
 */

fun plus(first : Int, second: Int) : Int
{
    println(first)
    println(second)
    var result : Int = first + second
    println(result)
    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5) : Int
{
    var result : Int = first + second
    return result
}

// 반환값이 없는 함수
fun printPlus(first: Int, second: Int) : Unit
{
    var result = first + second
    println(result)
}

fun printPlus2(first: Int, second: Int) // Unit 생략 가능
{
    var result = first + second
    println(result)
}

//간략한 함수 선언
fun plusShort(first: Int, second: Int) = first + second

// 가변 인자를 갖는 함수
fun plusMany(vararg numbers: Int)
{
    for (number in numbers)
    {
        println(number)
    }
}

fun main(array: Array<String>)
{
    //var result = plus(5, 10)
    //println(result)

    //var result2 = plus(first = 20, second = 30) /*  명시적 표기  */
    //println(result2)

//    var result3 = plus(second = 100, first = 10)    /*  파라미터의 순서 변경해서 입력 가능 */
//    println(result3)

    println()   //한줄 바꿈
    var result4 = plusFive(10, 20)
    println(result4)

    var result5 = plusFive(10)
    println(result5)

    println()
    printPlus(10, 20)

    println()
    printPlus2(10, 20)

    println()
    var result6 = plusShort(50, 50)
    println(result6)

    println()
    plusMany(1, 2, 3, 100)
}