import org.junit.jupiter.api.Test


class a11_enum_staticmethod : BaseTest() {

    //Video - 46

    @Test
    fun main() {
        val accountTypeFromAPI = "gold"
        val accountType = AccountType.valueOf(accountTypeFromAPI.uppercase())
        println(accountType)
        println(accountType.discountPercentage)
        println(accountType.numberOfSubscription)

        val platinum = AccountType.valueOf("Platinum".uppercase())
        println(platinum)
        println(platinum.discountPercentage)
        println(platinum.numberOfSubscription)



        val silver = AccountType.getAccountTypeByName("silver")
        println(silver)
        println(silver.discountPercentage)
        println(silver.numberOfSubscription)
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