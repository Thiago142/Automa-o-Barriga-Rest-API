import io.restassured.http.ContentType
import io.restassured.module.kotlin.extensions.Extract
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import io.restassured.response.Response
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class deleteTransacoes:Base() {
    fun deleteTransacoes(id:Int,transacoesPojo: TransacoesPojo):Response{
       return Given {
           spec(specBase())
           contentType(ContentType.JSON)
           queryParam("",id)
           body(transacoesPojo)
           log().all()
       }When {
           delete("transacoes/")
       }Then {
           log().all()
       }Extract {
           response()
       }
    }

   private val registerTransacoesFactorytransacoesFactory= RegisterTransacoesFactory()
    @Test
    fun deleteSuccesTest(){
        var response= deleteTransacoes(1584256,registerTransacoesFactorytransacoesFactory.deleteTransacoesSucess())
        assertAll("",
            { assertNotNull(response) },
            { assertEquals(404,response.statusCode)}
            )
    }



}