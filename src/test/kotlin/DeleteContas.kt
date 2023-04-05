import io.restassured.http.ContentType
import io.restassured.module.kotlin.extensions.Extract
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import io.restassured.response.Response
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals

class DeleteContas:Base() {
    fun deletaConta(id:Int):Response{
        return Given {
                  spec(specBase())
                  contentType(ContentType.JSON)
                  queryParam("",id)
                  log().all()
        } When {
            delete("contas")
        }Then {
            log().all()
        }Extract {
            response()
        }

    }
    @Test
    fun deletarContaTest(){
        var response = deletaConta(19)
        assertAll("",{
            assertEquals(404,response.statusCode)
        })
    }


}