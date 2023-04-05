package validates

import io.restassured.response.Response
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class PostContasValidate {
    fun createPostContasSucess(response:Response){
        assertAll("",
            { assertNotNull(response) },
            { assertEquals(201,response.statusCode) }

        )
    }

    @Test
    @Tag("Criação-de-conta-Existente")
    @DisplayName("Criação de conta que já existe")
    fun createPostContasExistenteUnsucess(response:Response){
        assertAll(
            { assertNotNull(response)},
            { assertEquals(400,response.statusCode)},
            { assertEquals("Já existe uma conta com esse nome!",response.jsonPath().getString("error"))}

        )


    }





}