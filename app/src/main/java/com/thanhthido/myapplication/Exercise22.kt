package com.thanhthido.myapplication

import kotlin.math.roundToInt

// when: giup a kt cai nay la gia tri null, thi print in ra null
//val value: Int? = null
fun main(){
    val value:Int? = null
    val convertValue = value?.toString()
    val lengthOfValue =convertValue?.length

    when (lengthOfValue) {
        null-> {
            print("Value Null :$value")
        }
        else -> {
            print("Value No Null")
        }
    }
}
