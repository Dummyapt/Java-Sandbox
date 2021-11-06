package de.dummyapt.sandbox.kotlin

class User {
    var username = ""
    var age = 0

    constructor(username: String) {
        this.username = username
    }

    constructor(username: String, age: Int) {
        this.username = username
        this.age = age
    }
}

fun main() {
    val a = User("Dummyapt", 19)
    val b = User("Dummy")

    println(a.username)
    println(a.age)
    println(b.username)
}