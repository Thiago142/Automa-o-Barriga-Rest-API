import io.restassured.module.kotlin.extensions.Extract
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import io.restassured.response.Response
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetContas: Base() {

    fun getcontas():Response{
        return Given {
               spec(specBase())
        }When {
            log().all()
            get("/contas")

        }Then{
            log().all()
        }Extract {
            response()
        }
    }


    @Test

    fun getcontasTest(){
        val response=getcontas()

        assertAll("Buscando conta dos clientes",
            { assertNotNull(response)},
            { assertEquals(200, response.statusCode)}
        )
    }



}