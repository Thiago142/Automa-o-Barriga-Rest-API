package validates

import io.restassured.response.Response
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class PostTransacaoValidate {
    @Test
    fun createPostTransacoesSucessTestValidate(response:Response){
        assertAll("",
            { assertNotNull(response) },
            { assertEquals(201,response.statusCode) },
        )
    }
    @Test
    fun createPostTransacoesUnsucessTestValidate(response:Response){
        assertAll("",
            { assertNotNull(response) },
            { assertEquals(400,response.statusCode) },
            { assertEquals("Conta é obrigatório",response.jsonPath().getString("[0].msg")) }
        )
    }
}