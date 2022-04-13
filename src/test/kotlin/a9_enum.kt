import org.junit.jupiter.api.Test


class a9_enum : BaseTest() {

    //Video - 46

    @Test
    fun main() {
        val accountTypeFromAPI = "gold"
        val accountType = AccountType.valueOf(accountTypeFromAPI.uppercase())
        println(accountType)
    }

    enum class AccountType {
        BRONZE,
        SILVER,
        GOLD,
        PLATINUM
    }


}