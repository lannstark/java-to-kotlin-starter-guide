package com.mozylee.lecture05

import java.lang.IllegalArgumentException

fun main() {

}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    validateScoreIsLegalArgument(score)

    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else if (score >= 60) {
        "D"
    } else {
        "F"
    }
}

fun getGradeSwitch(score: Int): String {
    validateScoreIsLegalArgument(score)

    return when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
}

fun validateScoreIsLegalArgument(score: Int): Boolean {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score} is not valid argument.")
    }

    return true
}