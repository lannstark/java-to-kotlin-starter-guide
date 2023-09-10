package com.mozylee.lecture10

class Penguin(
    species: String,
    val wingCount: Int = 2
) : Animal(species, 2), Swimmable, Flyable {
    override fun move() {
        TODO("Not yet implemented")
    }

    override val legCount: Int
        get() = super.legCount + wingCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }

    override fun swim() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

}