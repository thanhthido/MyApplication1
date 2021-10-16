package com.thanhthido.myapplication

// * Khai bao tre
lateinit var abc: String
lateinit var def: String
lateinit var ghi: String

// * Khai bao luoi // khoi tao moot lan
val someText: String by lazy{
    "Hello"
}


fun main(){
    // * Kotlin null safety
    var a: Int?

    // * lazy initialize: khai bao tre
    // * int a; Quy dinh khai bao tre
    // * a = 1;
    // abc.length // crash app

//    val newText = "$someText"
    initializeFunction()
    abc.length
    def

    sayHi()
    sayHi1(number2 = 1, number1 =2)
    val b = sayHi2(number2 = 1, number1 =2)
    val c = b - 1

    val d = sayHi3(number2 = 1, number1 =2).toString().toInt()
    // * ep kieu: primitive type (ep kieu cac so nguyen thuy)
    // * to String()...
    // * ep kieu cua 1 type tu dinh nghia

    sum(1,2,3,4)

}
class Car{

}

//clean code
fun initializeFunction(){
    abc = "werwer"
    def = "erewrfew"
    ghi = "efeuufb"
}

// * Khai bao ham // dong tu
// * invoke -> call ham
// * truyen tham so vao cho ham
// * Default value
// * named parameter: dat ten cho parameter
fun sayHi(number: Int = 0){
    print(number)
}

fun sayHi1(number1: Int, number2: Int){
    print(number1 + number2)
}

// * tra ve
fun sayHi2(number1: Int, number2: Int):Int{
    return number1 + number2
}

// * Void/ Any phai ep kieu /Nothing
fun sayHi3(number1: Int, number2: Int):Any{
    return number1 + number2
}

// * truyen vo so tham so cho ham. Unlimited parameter
fun sum(vararg ints: Int): Int {
    var sum = 0
    for (i in ints){
        sum +=i
    }
    return  sum
}


//


//fun sayHi(number: Int = 0){
//    val a = number +1
//    print(a)
//}

//fun sayHi(number: Int) == print(number+1)
