package com.thanhthido.myapplication

fun main() {
    // * set
    // * immutable set, mutable set
    // * set la 1 list nhung cac phan tu khong dc giong nhau
    val a = mutableSetOf(1,1,1,2)
    // * setOf
    val b = setOf(1,2,3)
    //b.add()
    a.add(1)
    println(a)

    // * Map
    // * key - value pair
    // * immutable va mutable
    val c = mutableMapOf<String,String>(
        "key1" to "Hi",
        "key2" to "A"
    )
    // * them 1 gia tri
    c["key3"] = "World"

    // * lay ra gia tri theo key
    val d = c["key1"]
    // * lay tat ca gia tri
    val e = c.values
    // * lay key
    val f = c.keys
    println(c)
    println(d)
}