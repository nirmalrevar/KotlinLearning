package when_expression

import BaseTest
import org.junit.jupiter.api.Test


class b2_when_with_return : BaseTest() {

    //Video - 52

    @Test
    fun main() {

        var firstname = "Nirmal"
        var lastname = "Revar"

        val value = when (firstname) {
            "Nirmal" -> {
                "User name is Nirmal"
            }
            "NirmalSinh" -> {
                "User name is NirmalSinh"
            }
            else -> {
                "User name Not matched with any "
            }
        }

        println(value)


        val value2 =when {
            firstname == "Nirmal" && lastname == "Revar" -> {
                "Full name is Nirmal Revar"
            }
            firstname == "Nirmal" -> {
                "User name is NirmalSinh"
            }
            else -> {
                "User name Not matched with any "
            }
        }
        println(value2)
    }

    enum class AccountType(val discountPercentage: Int, val numberOfSubscription: Int) {
        BRONZE(10, 1),
        SILVER(15, 5),
        GOLD(20, 10),
        PLATINUM(25, 15);


        /// THis will convert serverside account name to upper case so no worries
        companion object {
            fun getAccountTypeByName(name: String) = valueOf(name.uppercase())
        }
    }
}