package com.mozylee.lecture14

// else, default 작성 안해도 됨
fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

fun main() {
    handleCountry(Country.KOREA)
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}