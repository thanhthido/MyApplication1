package com.thanhthido.myapplication

import kotlin.random.Random

fun main() {
    // + - * /
    // cong chuoi, cong gia tri int, cong gia tri foat (+ - * /)
    // khai bao tat ca cac kieu gia tri
    // khai bao dung cach dat ten
    val stringA = "Hello"
    val stringB = "World"
    println("Add String: $stringA $stringB")

    val intA = 10
    val intB = 5
    println("Add Int: ${intA + intB}")
    println("Sub Int: ${intA - intB}")
    println("Mul Int: ${intA * intB}")
    println("Div Int: ${intA / intB}")

    val floatA = 20.5
    val floatB = 8.2
    println("Add float: ${floatA + floatB}")
    println("Sub float: ${floatA - floatB}")
    println("Mul float: ${floatA * floatB}")
    println("Div float: ${floatA / floatB}")
}



