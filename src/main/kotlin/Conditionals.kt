fun main() {
    // booleans
    val isAdult = false
    val isMale = true
    val orderCompleted: Boolean? = null
    println(isAdult)
    println(isMale)
    println(orderCompleted)

    // naming conventions
    // should be questions such as "isAdult" and not "adult" or "isMale" and not "male"


    // logical operators: same as in java
    println(isAdult && isMale)
    println(isAdult || isMale)
    println(!isAdult)

    // comparison operators
    val n1 = 10
    val n2 = 20

    println(n1 > n2)
    println(n1 >= n2)
    println(n1 < n2)
    println(n1 <= n2)
    println(n1 == n2)

    // if statements
    if (n1 < n2) {
        println(":D")
    }

    if (n1 == n2) {
        println(":D")
    } else {
        println(":(")
    }

    if (n1 > n2) {
        println(":D")
    } else if (n2 > n1) {
        println(":(")
    }

    // if expression
    val value = if (n1 < n2) {
        println("happy face")
        ":D"
    } else {
        ":("
    }

    println(value)

    // ternary ifs
    var r = if (n1 >= n2) ":(" else ":)"
    println(r)


    // when expression (switch)
    val gender = "M"

    when (gender) {
        "F" -> println("female")
        "M" -> println("male")
        else -> {
            println("unknown")
        }
    }

    val g = when (gender) {
        "F" -> println("female")
        "M" -> println("male")
        else -> {
            println("unknown")
        }
    }

    println(g)

    // more on when expressions
    // means if() else if() else if() else
    when {
        (n1 > n2) -> println(":D")
        (n1 < n2) -> println(":(")
        (n1 == n2) -> println(":P")
        else -> println(":*")
    }

    // when for range
    val age = 18
    when (age) {
        in 13..19 -> println("teenager")
        in 0..12 -> println("kid")
        else -> println("adult")
    }

    // when booleans are null
    val isDriver: Boolean? = null

    if (isDriver == true) {
        println("not null")
    } else {
        println("false or null")
    }
}