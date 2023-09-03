package com.mozylee.lecture04

import com.lannstark.lec04.JavaMoney

class Lecture04 {
}

fun main(): Unit {
    hasElement()
    compare()
}

fun compare(): Unit {
    println("compare")
    // 변수명: 타입 <- 이렇게 매번 타입 붙여야 함? 국룰? (O 국룰 맞음)
    val money1: JavaMoney = JavaMoney(1_000L)
    val money2: JavaMoney = money1
    val money3: JavaMoney = JavaMoney(1_000L)

    println(money1 === money2) // true
    println(money1 == money2) // true

    println(money1 == money3) // true (equals 호출)
    println(money1 === money3) // false (주소 비교)

    val money4: JavaMoney = money1 + money3;
    println("money4 = ${money4}")
}

fun hasElement(): Unit {
    println("hasElement")
    val ints: List<Int> = listOf(1, 2, 3, 4, 5)

    println("ints = ${ints}")
    println("1 in ints = ${1 in ints}") // true
    println("100 in ints = ${100 in ints}") // false
    println("100 !in ints = ${100 !in ints}") // true
}