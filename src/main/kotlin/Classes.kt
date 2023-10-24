fun main() {
    val tv = SmartDevice("Samsung", 1000.0, false)
    // tv.brand = "Samsung"
    // tv.price = 1000.0

    val phone = SmartDevice()
    phone.brand = "Apple"
    phone.price = 1400.0

    println("${tv.price} ${tv.brand}")
    println("${phone.price} ${phone.brand}")

    tv.turnOn()
    phone.turnOff()

    tv.getDeviceState()
    phone.getDeviceState()

    println(tv.toString())
}


class SmartDevice(
    brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean? = false
) {
    constructor() : this("", 0.0)
    constructor(brand: String) : this(brand, 0.0)

    // properties
    var brand: String? = brand
        // getters and setters
        get() = field
        set(value) {
            field = value?.uppercase()
        }

    // method functions
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is turning on")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is turning off")
    }

    fun getDeviceState() {
        println("$brand is turned on: $isSwitchedOn")
    }

    override fun toString(): String {
        return "SmartDevice(price=$price, isSwitchedOn=$isSwitchedOn, brand=$brand)"
    }
}