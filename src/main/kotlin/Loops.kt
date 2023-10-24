fun main() {
    // for loops
    val names = listOf("borjas", "adri", "keky")


    for (name in names) {
        val n = name.replaceFirstChar {
            it.uppercase()
        }
        println(n)
    }

    println()

    for (n in names) println(n)

    // indices
    val chars = charArrayOf('A', 'E', 'I', 'O', 'U')
    for (index in chars.indices) {
        println("$index - ${chars[index]}")
    }

    println("reversed")
    for (index in chars.indices.reversed()) {
        println("$index - ${chars[index]}")
    }


    // range
    println("range")
    for (i in 1..5) println(i)
    println("range reversed")
    for (i in 5 downTo 1) println(i)
    println("steps")
    for (i in 1..5 step 2) println(i)

    // loop through strings
    val brand = "Amigoscode"
    for (c in brand) println(c)

    // for each
    names.forEach { println(it) }

    // while loop
    println("while loop")
    var n = 1
    while (n <= 5) {
        println(n)
        n++
    }

    // doWhile loop
    println("do while loop")
    do {
        println("do something")
    } while (false)

    // break and continue
    println("break and continue")
    val numbers = listOf(1, 2,3, 4, 5)
    for (nu in numbers) {
        if (nu == 2) {
            continue
        }
        if (nu == 4) {
            break
        }
        println(nu)
    }
}