package com.thanhthido.myapplication

import kotlin.math.roundToInt
import kotlin.random.Random

fun main() {
// for
// kt tung gia tri neu la chan hay le thi in ra
// value chan: gia tri chan: $soDo
// value le: gia tri le: $soDo
    val array = arrayListOf(
        Random.nextInt(),
        Random.nextFloat(),
        Random.nextDouble(),
        Random.nextInt()
    )

    for (index in 0 until array.size) {
        val item = array[index] // imdex -> item lay ra trong array tai vi tri 0 -> random.nextInt()
        // Float, string, Int -> Double(ep kieu)
        // toInt(): Ep kieu sang Integer
        // toDouble(): Ep kieu sang so Double
        // toFloat(): ep kieu sang so Float
        // toString(): ep kieu sang String
        val convertValue = item.toDouble().roundToInt() ///345.0 -> 325
        if (convertValue % 2 == 0) {
            println("Enven Value: $convertValue")
        } else {
            println("Odd Value: $convertValue")
        }
    }


}