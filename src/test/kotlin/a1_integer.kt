import org.junit.jupiter.api.Test

class a1_integer :BaseTest(){

    ///Video 7-8

    @Test
    fun main() {

        val myByte: Byte = 8    // 8-bit  signed integer
        val myShort: Short = 16 // 16-bit  signed integer
        val myInt: Int = 32     // 32-bit  signed integer
        val myLong: Long = 64   // 64-bit  signed integer


        ///Decimal Value
        val myFloat: Float = 32.00F   // 32-bit Floating number.
        val myDouble: Double = 64.00   // 64-bit Floating number.
        println(myByte.toLong()::class)   // this will print class name here it will print Long a class nem


        ///All above class extends Number() Class

        val bigLong: Long = 1_00_000   // we can use _ for visibility purpose only
        println(bigLong)   //it will print "100000"  only.

        var newInt = myInt.plus(2)   // default Methods Available for many operation.
        newInt = myInt.minus(2)
        newInt = myInt.xor(2)
        newInt = myInt.and(2)
        newInt = myInt.times(2)
        //
    }
}