package com.devanand.loginapp

//class MyClass(var name : String, val age : Int) {
class MyClass {

//    constructor(name: String) : this(name,0) {
//        this.name = name
//    }
    var name : String
    var age : Int
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    //lambda function/expression
    val lambda : (Int,Int) -> Int = {a,b -> a + b}
}