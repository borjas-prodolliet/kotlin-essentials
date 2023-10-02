// import things
import kotlin.math.PI
import kotlin.math.max
import kotlin.math.min

// const: values that never change, cannot be inside a function
const val PI = 3.14 // static final equivalent
// the const value should be known before the execution

fun main() {
    // basic variables (type inference)
    var brand = "amigos"
    println(brand)

    var name: String = "borjas";
    println("Brand: ${brand} Name: ${name}")

    // data types
    var n: Int = 10
    var l: Long = 100L
    var d: Double = 2.34
    var f: Float = 4.23F
    var b: Boolean = true
    var s: String = "hola"
    var c: Char = 'b'

    // every class in kotlin inheritance Any class
    // you should not use Any class because it generates confusion
    var some: Any = 23
    var some2: Any = "hi"

    // type inference
    var number = 10
    var long = 100L
    var double = 2.34
    var float = 4.23F
    var boolean = true
    var string = "hola"
    var char = 'b'

    // var vs. val --> (let and const)
    var nameVar = "borjinias"
    nameVar = "borjitas"

    val nameVal = "adrianita"
    // nameVal = "adri"
    // this is not allowed


    // nulls safety
    var jamila = "Jamila"
    println(jamila.uppercase())

    var nulleable: String? = null
    println(nulleable?.uppercase())

    // strings
    val john = "John"
    println(john)
    println(john.uppercase())
    println(john.lowercase())
    println(john.length)
    println(john[0])
    println(john[2])
    println(john.isEmpty())

    // string templates
    val msg = "$john is a cool developer with ${n + 1} years of experience"
    println(msg)

    // multiline strings
    val email = """
        Hello %s 
          how 
        are you
            doing%s
    """.trimIndent()

    println(email.format("Borjas", "!?"))

    // strings comparison
    val name1 = "Borjas"
    val name2 = "Haniel"
    val name3 = String("Borjas".toCharArray())
    // val name3 = "Borjas"

    // compares content
    println(".equals : ${name1.equals(name3)}")
    println("== : ${name1 == name3}")
    // compares the memory address
    println("=== : ${name1 === name3}")


    // aritmetic operators
    val number1 = 10
    val number2 = 2

    println(number1 + number2)
    println(number1 - number2)
    println(number1 / number2)
    println(number1 * number2)
    println(number1 % number2)

    // math
    println(PI);
    println(max(number1, number2))
    println(min(number1, number2))
    println(kotlin.math.sqrt(16.0))
    println(kotlin.math.round(15.43))

    // ++ and --
    var num = 10
    println(num)
    println(++num)
    println(num)
    println(num++)
    println(num)
    println(--num)
    println(num--)
    println(num)

    // plus operator
    val sum = 10 + 10
    val sumString = "10" + "10"
    println(sum)
    println(sumString)

    // convert numbers
    println(sum + sumString.toInt())
    println(sum.toString() + sumString)
}