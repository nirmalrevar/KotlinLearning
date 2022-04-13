import org.junit.jupiter.api.Test


class a7_nested_class : BaseTest() {

    //Video - 44

    /// Nested class can be accessable By name of class, nested class can't access fields of Vehicle class
    @Test
    fun main() {

        val vehicle = Vehicle()
        vehicle.brand = "Fiat"
        vehicle.info()

        val sw = Vehicle.SteeringWheel()
        sw.info()

        val transmission = Vehicle.Transmission()
        transmission.shift()
        transmission.shift()

    }

    class Vehicle {
        var brand: String = "unknown"
        fun info() = println(brand)

        class SteeringWheel {
            var name = "The Steering Wheel"
            fun info() = println(name)

            // can't access brand field here.
        }

        class Transmission {
            var type = "Automatic"
            fun shift() = println("The vehicle is shifted")
        }
    }


}