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

class PostSignin: Base() {

    fun postSignin(registerUserPojo: RegisterUserPojo):Response{
        return Given {
            spec(specBase())
            contentType(ContentType.JSON)
            body(registerUserPojo)
            log().all()
        }When {
            post("/signin")
        }Then {
            log().all()
        }Extract {
            response()
        }
    }

  private val registerUsersFactory = RegisterUsersFactory()

  @Test
  @Tag("Registro-Com-Sucesso")
  @DisplayName("Login com sucesso")
  fun registro_com_sucessoTest(){

      val response = postSignin(registerUsersFactory.registro_com_sucesso())
      assertAll("Teste Login com sucesso",
          { assertEquals(200,response.statusCode) }
      )
  }

  @Test
  @Tag("Registro-Com-Sucesso")
  @DisplayName("Login sem informar a senha")
  fun registro_contendo_apenas_campo_emailTest(){
      val response = postSignin(registerUsersFactory.registro_contendo_apenas_campo_email())
      assertAll("Teste Login sem informa a senha",
          { assertNotNull(response)},
          { assertEquals(400,response.statusCode)},


      )
  }



}