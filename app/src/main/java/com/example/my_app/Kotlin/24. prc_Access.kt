package com.example.my_app.Kotlin

fun main(array: Array<String>)
{
    val night = Night(20, 4)
    val monster = Monster(15, 5)

    night.attack(monster)
    monster.attack(night)

}

class Night(private var hp : Int, private var power: Int)
{
    fun attack(monster: Monster)
    {
        monster.defense(power)
    }
    fun defense(damage: Int)
    {
        hp -= damage
        if(hp > 0)
        {
            heal()
            println("기사 체력: $hp")
        }
        else
        {
            println("기사 사망")
        }
    }
    private fun heal()
    {
        hp += 3
    }
}

class Monster(private var hp: Int, private var power: Int)
{
    fun attack(night: Night)
    {
        night.defense(power)
    }
    fun defense(damage: Int)
    {
        hp -= damage
        if(hp > 0)
        {
            println("몬스터 체력: $hp")
        }
        else
        {
            println("몬스터 사망")
        }
    }
}

class Monster2(private val hp: Int, private val power: Int)
{

}