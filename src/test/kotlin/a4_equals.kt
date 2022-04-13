import org.junit.jupiter.api.Test

class a4_if_else :BaseTest() {

    /// video

    @Test
    fun main() {
        var name1 = "Nirmal"
        var name2 = "Nirmal"

        println(name1 == name2)    /// in kotlin we can use == to check equls to operator -> it is similar to   name1.equals(name2)


        // "==="   means reference in kotlin -> recerence means stored memory locarion.
        var a = 12
        var b = 12

        //number, Chars , booleans  will be representaed premitives data type at run type.
        println(a === b)   //  true


        ////
        var a1 = Person("Nirmal")
        var b1 = Person("Nirmal")

        println(a1 === b1)
    }
}

class Person(var name: String)