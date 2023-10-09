fun main() {
    // arrays
    // once you define an array you cannot resize it
    val names = arrayOf<String>("Jamila", "Jamas", "Borjas")

    println(names[0])
    names[0] = "Sahara"
    println(names[1])
    println(names[2])
    println(names.size)
    if ("Borjas" in names) {
        println("found")
    } else {
        println("not found")
    }

    println(names.contentToString())

    val arrayOfNulls = arrayOfNulls<String>(5)

    arrayOfNulls.fill("*")

    arrayOfNulls[3] = "Hello"

    println(arrayOfNulls.contentToString())


    // lists
    val namesList: List<String> = listOf(
        "Borjas",
        "Adri",
        "Peter",
        "Alfonso"
    )

    println(namesList[2])
    println(namesList.size)
    println(namesList.contains("Borjas"))
    println(namesList.contains("Foo"))
    println(namesList.first())
    println(namesList.last())
    println(namesList.indexOf("Borjas"))
    println(namesList)

    // mutable lists
    val namesListMutable = mutableListOf(
        "Borjas",
        "Adri",
        "Peter",
        "Alfonso"
    )


    println(namesListMutable)
    namesListMutable.remove("Borjas")
    println(namesListMutable)
    namesListMutable.add("Alex")
    println(namesListMutable)
    val emptyList = mutableListOf<Any>()
    println(emptyList.isEmpty())


    // destructuring
    val (one, two, _, four) = namesList
    println("$one $two $four")
}