package com.example.my_app.home_work

fun main(array: Array<String>)
{
    val list1 = mutableListOf<Int>( )
    val list2 = mutableListOf<Boolean>( )
    var x: Int = 0

    for(i in 0 until 10)
    {
        list1.add(i, x)
        x++

        if(x > 9)
        {
            x = 0
        }
    }
    println(list1)

    for(i in 0 until 10)
    {
        var temp: Int = list1[i]
        if( temp % 2 == 0 )
        {
            list2.add(i, true)
        }
        else if ( temp % 2 != 0)
        {
            list2.add(i, false)
        }

    }
    println(list2)

}