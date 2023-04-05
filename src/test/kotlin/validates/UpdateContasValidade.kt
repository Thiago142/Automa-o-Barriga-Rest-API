package validates

import factory.UpdateContasFactory
import io.restassured.response.Response
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class UpdateContasValidade {

    @Test
    fun atualizarContaSucessTest(response:Response){
        assertAll("",
            { assertNotNull(response)},
            { assertEquals(204,response.statusCode)},

        )

    }
    @Test
    fun atualizarContaComMesmoNome(response:Response){
        assertAll("",
            { assertNotNull(response)},
            { assertEquals(400,response.statusCode) },
            { assertEquals("Já existe uma conta com esse nome!",response.jsonPath().getString("error")) }
        )

    }



}