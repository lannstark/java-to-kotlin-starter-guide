package com.mozylee.lecture08

import java.util.Arrays

fun main() {
    printAll("1", "2", "3", "4")

    repeat("Hello, World!", 2, true);
    repeat(string = "Hello, World!", count = 2, useNewLine = true);

    repeat("Hello, World!");
}

fun printAll(vararg strings: String): Unit {
    println("strings = ${strings.contentToString()}")
    for (string in strings) {
        println("string = ${string}")
    }
}

fun repeat(string: String, count: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..count) {
        if (useNewLine) {
            println(string)
            continue
        }

        print(string)
    }
}