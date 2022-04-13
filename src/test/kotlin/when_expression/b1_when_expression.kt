package when_expression

import BaseTest
import org.junit.jupiter.api.Test


class b1_when_expression : BaseTest() {

    //Video - 51

    @Test
    fun main() {

        var firstname ="Nirmal"
        var lastname ="Revar"

        when(firstname){
            "Nirmal" ->{
                println("User name is Nirmal")
            }
            "NirmalSinh" ->{
                println("User name is NirmalSinh")
            }
            else ->{
                println("User name Not matched with any ")
            }
        }


        when{
            firstname =="Nirmal" && lastname=="Revar" ->{
                println("Full name is Nirmal Revar")
            }
            firstname =="Nirmal" ->{
                println("User name is NirmalSinh")
            }
            else ->{
                println("User name Not matched with any ")
            }
        }
    }

    enum class AccountType (val discountPercentage: Int, val numberOfSubscription :Int){
        BRONZE(10,1),
        SILVER(15,5),
        GOLD(20,10),
        PLATINUM(25,15);


        /// THis will convert serverside account name to upper case so no worries
        companion object{
            fun getAccountTypeByName(name:String) = valueOf(name.uppercase())
        }
    }
}