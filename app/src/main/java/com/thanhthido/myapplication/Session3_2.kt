package com.thanhthido.myapplication

fun main(){
    // * array
    // * List -> Array -> ArrayList
    // * [1, 2, 3] -> array/list/arrayList
    // * mutable, immutable: co the thay doi/ khong the
    // * mutable list (dc thay doi gia tri)
    val a: MutableList<Int> = mutableListOf()
    val c = 1

    // * immutable list (khong dc thay doi gia tri)
//    val b: List<Int> = listOf(1, 2, 3)
    //b.add(c)
//    val d: List<Int> = mutableListOf(1,2,3)

    // * method - noi ham
    // * them 1 gia tri vao trong list: add -> them vao vi tri cuoi
    a.add(c)
    // * them tat ca addAll
    val b = mutableListOf(1,2,3,4)
    a.addAll(b)
    // * them gia tri vao vi tri mong muon -> index cos ben trong ham
    val d = 10
    a.add(3, d)
    // * lay ra gia tri
//    val e = a.get(0) =
    val e = a[0]
    println(e)
    // * update gia tri
    a[0] = 30
    // * delete gia tri khoi mang
    a.remove(30)
    // * delete tai mot vi tri trong mang
    a.removeAt(0)

    // * mot so ham huu ich
    // * size cua mang
    a.size
    a.count()
    // * gia tri lon nhat
    //a.toList().maxOrNull()
    a.maxOrNull()
    // * gia tri nho nhat
    a.minOrNull()
    // * cong tat ca cac gia tri trong mang
    a.sum()
    // * avg
    a.sum()/a.size

    println(a)
//    println(b)


}