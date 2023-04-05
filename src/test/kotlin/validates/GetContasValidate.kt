package validates

import io.restassured.response.Response
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetContasValidate {

    fun validadeSucess(response: Response){
        assertAll("Buscando contas do cliente",
            { assertNotNull(response) },
            { assertEquals(200, response.statusCode)})
    }


}