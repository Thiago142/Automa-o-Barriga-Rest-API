package validates

import apis.PostSignin
import factory.RegisterUsersFactory
import io.restassured.response.Response
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class PostSigninValidate {

    @Test
    @Tag("Registro-Com-Sucesso")
    @DisplayName("Login com sucesso")
    fun registro_com_sucessoTest(response:Response){
        assertAll("Teste Login com sucesso",
            { assertNotNull(response) },
            { assertEquals(200,response.statusCode) }
        )
    }

    @Test
    @Tag("Registro-Com-Falha")
    @DisplayName("Login sem informar a senha")
    fun registro_contendo_apenas_campo_emailTest(response: Response){
        assertAll("Teste Login sem informa a senha",
            { assertNotNull(response)},
            { assertEquals(400,response.statusCode)},
            { assertEquals("Problemas com o login do usuário",response.jsonPath().getString("error"))}

        )
    }

}