package validates

import io.restassured.response.Response
import org.junit.jupiter.api.assertAll
import kotlin.test.assertEquals

class RegisterCadastroValidade {
    fun verificaCadastroTestValidade(response: Response){
        assertAll("",
             {assertEquals(200,response.statusCode)})

    }

}