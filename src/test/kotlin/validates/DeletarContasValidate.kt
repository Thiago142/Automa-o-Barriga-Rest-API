package validates

import io.restassured.response.Response
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals

class DeletarContasValidate {
    @Test
    @Tag("success")
    @DisplayName("Deletar conta de usuario com sucesso")
    fun deletarContaTestValidate(response: Response){
        assertAll("",{
        assertEquals(204,response.statusCode)
        })
    }
    @Test
    @Tag("Unsucess")
    @DisplayName("Deletar conta de usuario que nao existe")
    fun deletarContaUnsucessTest(response: Response){
        assertAll("",{
        assertEquals(404,response.statusCode)
        })
    }

}