package com.example.my_app.Kotlin

fun main(args:Array<String>) {
    val student = Student__()
    student.sleep()
}

interface Person__ {
    fun eat() {
        println("Eat")
    }
    fun sleep() {
        println("Sleep")
    }

    abstract fun study()    /*  반드시 구현해야 하는 기능  */
}

class Student__ : Person__ {
    override fun study() {

    }
}

class Teacher__ : Person__ {
    override fun study() {

    }
}