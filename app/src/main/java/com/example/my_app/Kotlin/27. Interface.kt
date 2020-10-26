package com.example.my_app.Kotlin

fun main(array: Array<String>) {
    val student_ : Student_ = Student_()
    student_.eat()
    student_.sleep()
}

interface Person_ {
    fun eat()
    fun sleep()
}

class Student_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlay : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

















open class Person() {
    open fun eat() {

    }
    fun sleep() {

    }
}

class Student() : Person() {
    override fun eat()  {

    }
}

class Teacher() : Person() {

}
