package com.example.my_app.home_work

class TV () {

    var power : Boolean = false
    var ch : Int = 1

    fun print_ch () {
        if ( ch == 1 ) {
            println("Current channel is S")
        }
        else if ( ch == 2 ) {
            println("Current channel is K")
        }
        else if ( ch == 3 ) {
            println("Current channel is M")
        }
        else {
            println("Invalid channel")
        }
    }

    fun on_off () {
        if ( power == false ) {
            println("TV On")
            print_ch()
            power = true
        }
        else if ( power == true ) {
            println("TV Off")
            power = false
        }
    }

    fun ch_up () {
        if ( (ch == 1) && (power == true) ) {
            ch = 2
            println("channel up")
            print_ch()
        }
        else if ( (ch == 2) && (power == true) ) {
            ch = 3
            println("channel up")
            print_ch()
        }
        else if ( (ch == 3) && (power == true) ) {
            ch = 1
            println("channel up")
            print_ch()
        }
        else {
        }
    }

    fun ch_down () {
        if ( (ch == 1) && (power == true) ) {
            ch = 3
            println("channel down")
            print_ch()
        }
        else if ( (ch == 2) && (power == true) ) {
            ch = 1
            println("channel down")
            print_ch()
        }
        else if ( (ch == 3) && (power == true) ) {
            ch = 2
            println("channel down")
            print_ch()
        }
        else {
        }
    }
}

fun main(array: Array<String>) {

    var tv = TV()
    var meun : Int = 0
    var oper : Boolean = true

    while (oper) {
        println(" ********** Menu ********** ")
        println("1. TV On/Off")
        println("2. Channel Up")
        println("3. Channel Down")
        println("0. To exit a program")

        meun = readLine()!!.toInt()

        if ( meun == 1 ) {
            tv.on_off()
        }
        else if ( meun == 2) {
            tv.ch_up()
        }
        else if ( meun == 3) {
            tv.ch_down()
        }
        else if ( meun == 0) {
            println("Exit the program.")
            oper = false
        }
        else {
            println("Invalid input")
        }
    }
}