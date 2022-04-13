import org.junit.jupiter.api.Test


class a10_enum_with_para : BaseTest() {

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
    }

    enum class AccountType (val discountPercentage: Int, val numberOfSubscription :Int){
        BRONZE(10,1),
        SILVER(15,5),
        GOLD(20,10),
        PLATINUM(25,15)
    }
}