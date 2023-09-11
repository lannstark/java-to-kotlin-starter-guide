package com.mozylee.lecture14

fun main() {
    // named parameter
    val person1 = Person(name = "이름1", age = 150)
    val person2 = Person(name = "이름2", age = 200)
    val person3 = Person(name = "이름1", age = 150)

    println(person1)
    println(person1 == person2) // false
    println(person1 == person3) // true
}

// data를 붙이면, equals, hashCode, toString을 자동으로 생성
// 게다가, Kotlin 자체의 getter, setter도 존재
// 추가로, named parameter를 활용하면 Builder의 역할도 가능
data class Person(
    val name: String,
    val age: Int
)