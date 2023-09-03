package com.mozylee.lecture02

import java.lang.IllegalArgumentException

fun main() {

}

fun startsWithA1(str: String?, prefix: String): Boolean {
    if (str == null) {
        throw IllegalArgumentException()
    }

    return str.startsWith(prefix)
}

// 뭔지는 모르는데 일단 안드 개발자가 이거 쓰라고 해서 썼,,,슴,,,
fun startsWithA2(str: String?, prefix: String): Boolean =
    str?.startsWith(prefix) ?: false

fun startsWithA3(str: String?, prefix: String): Boolean {
    return str?.startsWith(prefix) ?: false
}