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


}