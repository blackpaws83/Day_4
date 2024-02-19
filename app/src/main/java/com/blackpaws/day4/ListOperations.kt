package com.blackpaws.day4

fun main() {
    val fruitsList = mutableListOf("Apple", "Orange", "Banana", "Pear", "Durian")
    println(fruitsList)
    fruitsList.add("Tangerine")
    println(fruitsList)
    fruitsList.remove("Banana")
    println(fruitsList)
    if (fruitsList.contains("Banana")) {
        println("yep")
    } else println("nope")
}