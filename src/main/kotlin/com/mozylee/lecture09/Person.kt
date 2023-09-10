package com.mozylee.lecture09

import java.lang.IllegalArgumentException

fun main() {
    val person = Person(name = "이이잉", age = 19)

    println(person.age)

    person.age = 99
    println(person.age)
}

class Person(
    val name: String,
    var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수가 없습니다. 1살 이상으로 설정해주세요.")
        }
    }

    // 호출 순서 : init -> primary constructor -> secondary constructor
    // 근데 secondary constructor 만들지 말고 그냥 default parameter 써라
    // 혹은 정적 팩토리 메소드를 활용
    constructor(name: String) : this(name, 1)

    // Getter #1 추천

    // Getter #1
    val isAdult: Boolean
        get() = this.age >= 20

    // Getter #2
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // custom getter
    // field == backing field := 외부엔 보이지 않고 자기 자신만 볼 수 있는 예약어
    //    val name: String = name
    //        get() = field.uppercase()

    // 근데 맘대로 들어온 필드 값 바꿔서 객체 생성하지 말고 다른 필드를 생성해서 넘겨라...
    val upperCaseName: String
        get() = this.name.uppercase()

    // custom setter
    // 근데 웬만하면 setter 쓰지마라
    //    var age: Int = age
    //        set(value) {
    //            if (value >= 100) {
    //                field = 99
    //
    //                return
    //            }
    //
    //            field = value
    //        }

}