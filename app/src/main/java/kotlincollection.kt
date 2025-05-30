package com.example.mobile

//LIST
fun displayList() {
    val numbers: List<String> = listOf("one", "two", "three", "four")

    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")
}

//Mutable and immutable ist
//fun main() {
//    // Immutable List
//    val lst = listOf("one", "two", "three")
//    println("Immutable list")
//    for (i in lst.indices) {
//        println(lst[i])
//    }
//    println()
//
//    // Mutable List
//    val mutableLst = mutableListOf("one", "two", "three")
//    mutableLst.add("Four")
//    println("Mutable list")
//    for (i in mutableLst.indices) {
//        println(mutableLst[i])
//    }
//    }
//
////set
//fun set() {
//    val numbers = setOf(1, 2, 3, 4)
//    for (elements in numbers) {
//        println(elements)
//    }
//
//    val numbersBackwards = setof(4, 3, 2, 1)
//    println("The sets are equal: ${numbers == numbersBackwards}")
//}

//Map
fun map() {
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"

    )
    println("All keys : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")
    println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")
}

//Immutable example
//    val studentMarks = mapof(
//        "ram" to 45,
//        "shyam" to 45,
//        "hari" to 45,
//        "gita" to 45,
//
//        )
//    println("Enter student name: ")
//    val input: String = readln().lowercase()
//    println(studentMarks[input])
//
////Mutable Map
//    val studentMarks = mutableMapof(
//        "ram" to 45,
//        "shyam" to 45,
//        "hari" to 45,
//        "gita" to 45,
//
//        )
//    studentMarks["ram"] = 60
//    studentMarks.put("sabin", 80)
//    println("Enter student name: ")
//    val input: String = readln().lowercase()
//    println(studentMarks[input])}


//Task
fun main() {
    // Create a dictionary using mapOf()
    val dictionary = mapOf(
        "apple" to "A fruit that is typically round, red, green, or yellow, with a crisp texture.",
        "banana" to "A long, curved fruit with a yellow skin and soft, sweet, white flesh inside.",
        "cherry" to "A small, round fruit that is typically red or black and has a pit.",
        "date" to "A sweet fruit from the date palm tree, often eaten dried.",
        "elderberry" to "A small, dark purple fruit that grows in clusters on the elder tree."
    )

    // Prompt the user to enter a word
    println("Enter a word to get its meaning (or type 'exit' to quit):")

    while (true) {
        val input = readLine() // Read user input

        // Check if the user wants to exit
        if (input.equals("exit", ignoreCase = true)) {
            println("Exiting the dictionary app. Goodbye!")
            break
        }

        // Get the meaning of the word
        val meaning = dictionary[input?.toLowerCase()]

        if (meaning != null) {
            println("Meaning of '$input': $meaning")
        } else {
            println("Sorry, the word '$input' is not in the dictionary.")
        }
    }
}