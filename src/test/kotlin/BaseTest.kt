import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
open class BaseTest {
    //    video  17-18-19
    @BeforeAll
    internal fun  beforeData(){
        println("----------------------------START------------------------------------------")
    }

    @AfterAll
    internal fun afterData(){
        println("-----------------------------END-------------------------------------------")
    }
}