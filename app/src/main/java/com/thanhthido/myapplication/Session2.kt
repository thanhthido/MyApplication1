package com.thanhthido.myapplication

import kotlin.random.Random

fun main() {
    // Mot so method
    // method danh cho object (object cua he thong va object cua e tao)
    // function la khong thuoc object nao het
    val randomString = ""
    // cach 1: de kiem tra string co gia tri hay khong
    println("${randomString.isEmpty()}") // false
    // cach 2
    val isEmptyString = randomString == ""
    println(isEmptyString) // false
    // cach 3, bo qua viet hoa
    val isEmptyString2 = randomString.equals("", ignoreCase = true) // true // khong quan tam hoa thuong
    println(isEmptyString2)

    // random ra 1 so bat ky
    val randomNumber = Random.nextInt(0, 10)
    val isEven = randomNumber % 2 == 0


    // Conditional
    //if -else
    val emptyString = ""
    if (emptyString == "") {
        // true
        println("true")
    } else {
        //false
        println("false")
    }

    //for
    //1<=x<=3
    for(index in 1..3 step 2){
        println(index) //
        println("abcde")
    }

    //1<=x<=2
    for(index in 1 until 3) {
        println(index) //
        println("abcde")
    }
    //for(int index =1; index <3, index++)


    //FOR EACH: for tung gia tri

//    val array = arrayListOf<Int>(1, 2, 3, 4)
//    for (index in 0..array.size){
//        println(index)
//    }

    val array = arrayListOf<Int>(1, 2, 3, 4)
    for (index in 0 until array.size){
        val valueOfArray = array[index]
        println(valueOfArray)
    }

    // Switch case
    val valueToCheck = 0
    when(valueToCheck){
        0 -> {
            //case 1
            print("gia tri 0")
        }
        1 -> {
            //case 2
            print("gia tri 1")
        }
        2 -> {
            //case 3
            print("gia tri 2")
        }
        else -> {
//            // nhung case con lai
            print("gia tri con lai")
        }
    }

//    when{
//        valueToCheck == "" -> {}
//    }

    //while and do while
    var x = 0
    while (x<10) {
        println(x)
        x++
    }

    do{
        x++
        println(x)
    }while(x<10)


    // nang cao cua if va when
    val y = 1
    //expression function, anonymous function
    val giatri1 = if (y == 0) {
        10
    } else {
        -1
    }
    println(giatri1)

    val giatri2 = when {
        y == 0 -> {
            10
        }
        else -> {
            -1
        }
    }
    println(giatri2)


//     cac phep toan nang cao
//     a +=1 == a=a+1
//     a -=1 == a=a-1
//     a *=
//     a/=
//     a%=
    checkIfStringIsEmpty()
}

fun checkIfStringIsEmpty() {
    var emptyString = ""

    if (emptyString == "") return

    if (emptyString == "abc") {
        emptyString += "d"
        println(emptyString)
        return
    }

    emptyString += "abcd"
    println(emptyString)
}
