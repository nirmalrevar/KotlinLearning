import org.junit.jupiter.api.Test

class a2_string:BaseTest() {

    /// video 9-10

    @Test
    fun main() {

        var fullName: String = "Hello World"
        println(fullName.length)

        val c: Char = 'x'   // 16-bit UniCode Character

        var message: String = """
        Hello,
        My Name is Nirmal Sinh Revar
        How are you?
    """.trimIndent()    // 3 quotation will print your messsage as it is.
        println(message)

        var name = "Nirmal"
        var age = 29
        println("Hello $name, your age is $age and your name is ${name.length} Characters long.")
    }
}