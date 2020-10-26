package com.example.my_app.Kotlin

fun main(array: Array<String>)
{
    val superCar100 : SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()
}

open public class Car100() {   /*  부모 클래스 (open 키워드가 반드시 필요) */
    open fun drive() : String {
        //println("Run")
        return "Run"
    }
    open fun stop() {

    }
}

class SuperCar100() : Car100() {
    override fun drive() :String {
        //println("Fast Run")
        //super.drive()               /*   부모 클래스의 함수를 호출   */
        val run = super.drive()         /*  부모 클래스를 응용하여 새로운 기능 창조  */
        return "Fast $run"
    }
    //override fun stop()
}

class Bus100() : Car100() {

}