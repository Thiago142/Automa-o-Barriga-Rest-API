package validates

import factory.RegisterTransacoesFactory
import io.restassured.response.Response
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class DeletarTransacoesValidade {
    private val registerTransacoesFactorytransacoesFactory= RegisterTransacoesFactory()
    @Test
    @Tag("Deletar-Transacao-Com-Sucesso")
    @DisplayName("Deletar-Transacao-Com-Sucesso")
    fun deleteSuccesTestValidate(response: Response){
        assertAll("",
            { assertNotNull(response) },
            { assertEquals(204,response.statusCode) }
        )
    }

    @Test
    fun deleteUnsuccesTestValidate(response: Response){
        assertAll("",
            { assertNotNull(response) },
            { assertEquals(404,response.statusCode) }
        )
    }
}