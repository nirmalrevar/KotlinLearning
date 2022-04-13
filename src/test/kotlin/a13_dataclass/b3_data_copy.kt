package a13_dataclass

import BaseTest
import org.junit.jupiter.api.Test


class b3_data_copy : BaseTest() {

    //Video - 53

    @Test
    fun main() {
        val p1 = Person("Nirmal", "Revar", 23)

        val sibling =p1.copy(firstName = "Lalo")
        println(p1)
        println(sibling)

        val order = Order(amount = 100, customer = sibling)
        println(order)

        val newOrder = Order(amount = 100, customer = sibling)
        println(newOrder)

        val newOrder2 = order.copy( customer = p1)
        println(newOrder2)
    }

data class Order (val amount:Int,val customer:Person)

    data class Person(val firstName: String, val lastName: String, val age: Int) {
        fun fullName(): String {
            return "$firstName $lastName"
        }
    }


}