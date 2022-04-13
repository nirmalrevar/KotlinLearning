import org.junit.jupiter.api.Test

class a6_function_inside_function:BaseTest() {

    //    video  17-18-19

    @Test
    fun main() {
        var firstName: String = "Nirmal"
        var length = firstName.length

        var lastName: String? = "Revar"
        var length2 = lastName?.length    // null , 5

        var length3 = if (lastName != null) lastName.length else 0   //  6,0

        var length4 = lastName?.substring(0, 2)?.length

        var length5: Int? = lastName?.substring(0, 5)?.drop(2)?.substring(2, 3)?.length


        //when we don't want length value as null reference object that time use  elves operator.
        ///Elvis Operator
        var myLastName: String? = "Felker"
        var myLength: Int = if (myLastName != null) myLastName.length else 0

        var myLengthNonNull: Int = myLastName?.length ?: 0

        var myLength6NonNull: Int = lastName?.substring(0, 5)?.drop(2)?.substring(2, 3)?.length ?: 0

        //    "?:0"  this is Elvis Operator. if there is anything null on Left side  it will return Right side value.

    }
}