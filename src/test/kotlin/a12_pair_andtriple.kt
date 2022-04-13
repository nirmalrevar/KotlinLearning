import org.junit.jupiter.api.Test


class a12_pair_andtriple : BaseTest() {

    //Video - 58

    @Test
    fun main() {

        val pair = Pair("foo","bar")
        println(pair.first)
        println(pair.second)


        val triple = Triple("foo","bar","bear")
        println(triple.first)
        println(triple.second)
        println(triple.third)

    }
}