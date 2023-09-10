package com.mozylee.lecture10

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("MEOW!!!")
    }

}