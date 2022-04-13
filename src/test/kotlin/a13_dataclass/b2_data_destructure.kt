package a13_dataclass

import BaseTest
import org.junit.jupiter.api.Test


class b2_data_destructure : BaseTest() {

    //Video - 56

    @Test
    fun main() {
        val p5 = Person(age = 23, firstName = "Nirmal", lastName = "Revar")
        println(p5.component1())
        println(p5.component2())
        println(p5.component3())


        val (componenet1, component2, component3) = p5
        println(componenet1)
        println(component2)
        println(component3)


        val (firstname, lastname, age) = p5
        println(firstname)
        println(lastname)
        println(age)
    }

    data class Person(val firstName: String, val lastName: String, val age: Int) {
        fun fullName(): String {
            return "$firstName $lastName"
        }
    }

}