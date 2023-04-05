package apis

import pojo.UpdateContaPojo
import factory.UpdateContasFactory
import io.restassured.http.ContentType
import io.restassured.module.kotlin.extensions.Extract
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import io.restassured.response.Response
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class UpdateContas: Base() {
    fun updateAccount(id:Int, updateContaPojo: UpdateContaPojo):Response{
        return Given {
             spec(specBase())
             contentType(ContentType.JSON)
             queryParam("",id)
             body(updateContaPojo)
             log().all()
        }When {

            put("/contas/id")

        }Then {
            log().all()
        }Extract {
            response()
        }
    }

    private val updateContasFactory= UpdateContasFactory()

    @Test
    @Tag("success")
    @DisplayName("Registro de usuario com sucesso")
    fun atualizarContaSucessTest(){
        var response = updateAccount( 1681918,updateContasFactory.update_Account_Sucess())
        //var fas= updateAccount()
        assertAll("",
            { assertNotNull(response)},
            { assertEquals(204,response.statusCode)},
            { assertEquals("Já existe uma conta com esse nome!",response.jsonPath().getString("error")) }
            )

    }
    @Test@Tag("Usuccess")
    @DisplayName("Registro de usuario com Falha")
    fun atualizarContaComMesmoNomeTest(){
        var response = updateAccount( 1681918,updateContasFactory.update_Account_Unsuccess())
        //var fas= updateAccount()
        assertAll("",
            { assertNotNull(response)},
            { assertEquals(400,response.statusCode)},
            { assertEquals("Já existe uma conta com esse nome!",response.jsonPath().getString("error")) }
        )

    }

}