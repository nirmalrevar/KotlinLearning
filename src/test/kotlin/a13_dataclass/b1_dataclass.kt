package a13_dataclass

import BaseTest
import org.junit.jupiter.api.Test


class b1_dataclass : BaseTest() {

    //Video - 53

    @Test
    fun main() {
        val p1 = Person("Nirmal", "Revar", 23)
        val p2 = Person("Nirmal", "Revar", 23)

        println(p1 == p2)   // it will print true

        val pn1 = PersonNoData("Nirmal", "Revar", 23)
        val pn2 = PersonNoData("Nirmal", "Revar", 23)

        println(pn1 == pn2) // it will print false

        ///Print component for data class
        val p4 = Person(firstName = "Nirmal", lastName = "Revar", age = 23)
        println(p4.component1())
        println(p4.component2())
        println(p4.component3())

        println("-------------")
        val p5 = Person(age = 23 ,firstName = "Nirmal", lastName = "Revar", )
        println(p5.component1())
        println(p5.component2())
        println(p5.component3())
    }

    // when we use data operator Kotlin add below methods in class
    //1) Equals
    //2) hashcode
    //3) toString
    // and also it will create component method for each field.
    data class Person(val firstName: String, val lastName: String, val age: Int) {
        fun fullName(): String {
            return "$firstName $lastName"
        }
    }

    class PersonNoData(val firstName: String, val lastName: String, val age: Int) {
        fun fullName(): String {
            return "$firstName $lastName"
        }
    }
}