fun main() {
    greet("Borjas", 27)
    greet("Juan")

    foo(bar = {
        println("bar as a function")
    })

    foo { println("baz baz") }

    println("double")
    println(double(2))
    println(doubleSingle(4))

    val (v1, v2) = twoValues()
    println("v1: $v1 - v2: $v2")
    val (t1, t2 , t3) = threeValues()
    println("t1: $t1 - t2: $t2 - t3: $t3")
}

// -1 means default argument value
fun greet(name: String, age: Int = -1) {
    if (age == -1) {
        println("Age not provided")
        return
    }

    if (age >= 18) {
        println("$name you are an adult, you have $age years")
    } else {
        println("hey $name you still being a child, you are $age")
    }
}

// functions as arguments
fun foo(bar: () -> Unit) {
    println("bar function")
    bar()
}

// function that returns value
fun double(n: Int): Int {
    return n * 2
}

// single expression function
fun doubleSingle(n: Int): Int = n * 2
fun doubleSingle2(n: Int) = n * 2

// return multi value function
fun twoValues(): Pair<String, Int> = "Amigos" to 20
fun twoValues2(): Pair<String, Int> = Pair("Amigos", 20)

fun threeValues(): Triple<String, Int, Char> {
    return Triple(
        "Triple",
        27,
        'B'
    )
}

