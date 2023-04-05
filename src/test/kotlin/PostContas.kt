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
import java.util.regex.Matcher
import kotlin.math.log
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class PostContas: Base() {
      fun postContas(registerContasPojo: RegisterContasPojo):Response{
          return Given {
              spec(specBase())
              contentType(ContentType.JSON)
              body(registerContasPojo)
              log().all()
          }When {
              post("/contas/")
          }Then {
              log().all()

          }Extract {
              response()
          }
      }

    private val registerContasFactory = RegisterContasFactory()
    @Test
    @Tag("Criação-de-conta-Existente")
    @DisplayName("Criação de conta que já existe")
    fun createPostContasExistenteTest(){
        val response = postContas(registerContasFactory.registro_conta_existente())
        assertAll("",
            { assertNotNull(response)},
            { assertEquals(400,response.statusCode)},
            { assertEquals("Já existe uma conta com esse nome!",response.jsonPath().getString("error"))}


        )


    }

    @Test
    @Tag("Criação-de-conta")
    @DisplayName("Criação-de-conta")
    fun createPostContasTest(){
        val response = postContas(registerContasFactory.registro_conta())
        assertAll("",
            { assertNotNull(response)},
            { assertEquals(201,response.statusCode)}

        )
    }

}


