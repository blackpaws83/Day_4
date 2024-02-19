package com.blackpaws.day4

fun main() {
    // immutable list
    val shoppingList1 = listOf("Processor", "RAM", "Graphics Card", "SSD")

    // mutable list
    val shoppingList2 = mutableListOf("Processor", "RAM", "Graphics Card", "SSD")
    shoppingList2.add("Cooling System")

    val shoppingList3 = mutableListOf<String>()
    shoppingList3.add("Processor")
    shoppingList3.add("RAM")
    shoppingList3.add("Graphics Card RTX 3060")
    shoppingList3.add("SSD")
    shoppingList3.add(4, "Cooling System")

    println(shoppingList3)

    println(shoppingList3[2])

//    shoppingList3.removeAt(2)
//    shoppingList3.add(2, "Graphics Card RTX 4090")
    replaceElementAtIndex(shoppingList3, 2, "Graphics Card RTX 4090")
    println(shoppingList3[2])
    shoppingList3[2] = "Graphics Card Radeon 7800 XT"
    println(shoppingList3[2])
    shoppingList3.set(2, "Graphics Card RTX 4090")
    println(shoppingList3[2])
    println(shoppingList3)
    println(shoppingList3.contains("Graphics Card RTX 4090"))

    for (item in shoppingList3) {
        println(item)
    }
    println()
    for (index in 0 until shoppingList3.size) {
        println("item ${shoppingList3[index]} is at index $index")
    }
    for (index in 0 .. shoppingList3.size) {
        println("item ${shoppingList3[index]} is at index $index")
    }


}

fun <T> replaceElementAtIndex(mutableList: MutableList<T>, index: Int, newValue: T) {
//    mutableList.removeAt(index)
//    mutableList.add(index, newValue)
    mutableList[index] = newValue
}