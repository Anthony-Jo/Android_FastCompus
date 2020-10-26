package com.example.my_app.home_work

class Account (var initial_amount : Int) {

    var now_amount : Int = initial_amount

    fun receipt (amount : Int) {
        now_amount += amount
        println("deposit of $amount won")
        println("your balance is $now_amount won")
        println()
    }

    fun withdrawal (amount : Int) {

        if ( now_amount < amount) {
            println("The balance is insufficient.")
        }
        else {
            now_amount -= amount
            println("withdrawal of $amount won")
            println("your balance is $now_amount won")
            println()
        }
    }

    fun check_balance () {
        println("your balance is $now_amount won")
        println()
    }
}

fun main(array: Array<String>) {

    println("Enter Initial Deposit")
    var money : Int = readLine()!!.toInt()
    var account = Account(money)
    var meun : Int = 0
    var oper : Boolean = true

    while (oper) {
        println(" ********** Menu ********** ")
        println("1. Deposit")
        println("2. Withdraw")
        println("3. Check Balance")
        println("0. To exit a program")

        meun = readLine()!!.toInt()

        if ( meun == 1 ) {
            println("Enter amount to deposit")
            account.receipt(readLine()!!.toInt())
        }
        else if ( meun == 2) {
            println("Enter amount to withdraw")
            account.withdrawal(readLine()!!.toInt())
        }
        else if ( meun == 3) {
            account.check_balance()
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