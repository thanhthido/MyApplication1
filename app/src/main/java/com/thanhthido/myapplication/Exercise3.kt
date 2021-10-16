package com.thanhthido.myapplication
fun main (){
    // * Sap xep mang theo thu tu tang dan
    // * tao ra 1 ham nhan para la 1 mang tra ve la mang da dc sap xep
    val a = mutableListOf(10, 3, 4, 8, 12, 45)
    a.sort()
    println("Tăng dần:")
    for (i in a)
        print("$i\t")
    println()
}
