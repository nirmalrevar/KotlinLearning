import org.junit.jupiter.api.Test


class a8_inner_class : BaseTest() {

    //Video - 45

    /// Inner class can be accessable through Object of Vehicle class.
    @Test
    fun main() {

        val vehicle = Vehicle()
        vehicle.brand = "Fiat"
        vehicle.info()

        val sw = vehicle.SteeringWheel()
        sw.info()

        val transmission = Vehicle.Transmission()
        transmission.shift()
        transmission.shift()

    }

    class Vehicle {
        var brand: String = "unknown"
        fun info() = println(brand)

        inner class SteeringWheel {
            var name = "Leather"
            fun info() = println("$brand is the brand of vehicle with a $name Steering wheel")
        }

        class Transmission {
            var type = "Automatic"
            fun shift() = println("The vehicle is shifted")
        }
    }


}