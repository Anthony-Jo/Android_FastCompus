package com.example.my_app.Kotlin

// 18. Class
// OOP -> Object Oriented Programing (객체지향 프로그래밍)
// 객체란?
// - 이름이 있는 모든 것

fun main(array: Array<String>)
{
    /*  설명서(클래스)를 이용하여 실체를 만든다  */
    /*  인스턴스화를 통해 인스턴스(객체)를 얻는다    */

    val bigCar1 = Car("v8 engine", "big")
    val bigCar2 : Car = Car("v8 engine", "big")
    /*  우리가 만든 클래스(설명서)는 자료형이 된다    */

    var superCar : SuperCar = SuperCar("good engine", "big", "white")

    val runableCar: RunableCar = RunableCar("simple engine", "good body")

    //RunableCar.ride() : 불가능
    runableCar.ride()
    runableCar.navi("busan")
    runableCar.drive()

    //인스턴스 멤버 변수에 접근하는 방법
    var runableCar2 : RunableCar2 = RunableCar2("nice", "long")
    println(runableCar2.body)
    println(runableCar2.engine)

    println()

    val testClass = TestClass()
    testClass.test(1, 2)
}
// 1번
class Car constructor(var engine: String, var body : String)
{

}
// 2번
class SuperCar
{
    var engine : String
    var body : String
    var door : String

    constructor(engine : String, body: String, door: String)
    {
        println(engine)
        println(body)
        println(door)
        this.engine = engine
        this.body = body
        this.door = door
    }
}

//3번
class Car1 constructor(engine: String, body: String)
{
    var door : String = ""

    //생성자
    constructor(engine: String, body: String, door: String) : this(engine, body)
    {
        this.door = door
    }
}
//4번
class Car2
{
    var engine: String = "a"
    var body : String = "b"
    var door : String = "c"

    constructor(engine: String, body: String)
    {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String)
    {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine: String, body: String)
{
    fun ride()
    {
        println("탑승 완료")
    }

    fun drive()
    {
        println("달립니다. !")
    }

    fun navi(destiantion : String)
    {
        println("$destiantion 으로 목적지 설정")
    }
}

class RunableCar2
{
    var engine : String
    var body : String

    constructor(engine: String, body: String)
    {
        this.engine = engine
        this.body = body
    }

    init    /*  인스턴스화 될때 먼저 호출됨 (가장 먼저 출력됨)   */
    {
        /*  초기 Setting 시 유용하다   */
        println("init class")
    }

    fun ride()
    {
        println("탑승 완료")
    }

    fun drive()
    {
        println("달립니다. !")
    }

    fun navi(destiantion : String)
    {
        println("$destiantion 으로 목적지 설정")
    }
}

//OverLoading
class TestClass()
{
    fun test(a: Int)
    {
        println("up")
    }
    fun test(a: Int, b: Int)
    {
        println("down")
    }
}