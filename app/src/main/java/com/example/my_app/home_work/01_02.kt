package com.example.my_app.home_work

fun main(array: Array<String>)
{
    val points = arrayOf<Int>(87, 34, 44, 55, 76, 73, 68, 100)

    for( i in 0 until points.size)
    {
        if( (points[i] >= 80) && (points[i] <= 90) )
        {
            println("Number " + (i + 1) + " is A" )
        }
        else if ( (points[i] >= 70) && (points[i] <= 79) )
        {
            println("Number " + (i + 1) + " is B" )
        }
        else if ( (points[i] >= 60) && (points[i] <= 69) )
        {
            println("Number " + (i + 1) + " is C" )
        }
        else
        {
            println("Number " + (i + 1) + " is F" )
        }
    }
}