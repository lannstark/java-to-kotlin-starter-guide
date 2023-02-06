package com.lannstark.lec06

fun main(){



    forloop()
    whileLoop()
}
fun enhancedForLoop(){
    val numbers = listOf(1L,2L,3L)
    for(number in numbers){
        println(number)
    }
}

fun forloop (){
    for(i in 1..3){
        println(i)
    }

    for(i in 3 downTo 1){
        println(i)
    }
    //그럼 나눗셈이나 곱하기는?... 그냥 자바처럼 해도 되나??
    for(i in 1 .. 5 step 2){
        println(i)
    }
}

fun whileLoop(){
    var i = 1;
    println("whileLoop start")
    while(i <= 3){
        println(i)
        i++
    }
}




class elc06 {
}