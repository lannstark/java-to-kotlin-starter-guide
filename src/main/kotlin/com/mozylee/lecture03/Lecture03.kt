package com.mozylee.lecture03

import com.lannstark.lec03.Person

fun main() {
    printAgeIfPerson2(null);
}

fun printAgeIfPerson(obj: Any?): Unit {
    if (obj !is Person) {
        return
    }

    println(obj.age)
}

fun printAgeIfPerson2(obj: Any?): Unit {
    // 딱봐도 as? 이런건 잘 안쓸듯
    val person: Person = obj as? Person ?: return

    println(person.age)
}

// 안드로이드 개발자가 써준거 (뭔지 모름)
fun printAgeIfPerson3(obj: Any?): Unit {
    obj?.let {
        printAgeIfPerson(obj)
    }
}