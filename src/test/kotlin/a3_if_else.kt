import org.junit.jupiter.api.Test

class a3_if_else :BaseTest() {

    /// video

    @Test
    fun main() {
        val age = 11
        if (age > 10) println(" The age is greater then 10")   /// this is good then you want to write condition in one line.

        if (age > 10) println(" The age is greater then 10") else println("age is less then 10")    //  add if and else condition in one line only.
    }
}