package apis

import io.restassured.http.ContentType
import io.restassured.module.kotlin.extensions.Extract
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import io.restassured.response.Response
import pojo.RegisterCadastroPojo

class PostCadastro:Base() {
    fun acessarCadastro(registerCadastroPojo: RegisterCadastroPojo):Response{
        return Given {
               spec(specBase())
               contentType(ContentType.JSON)
               body(registerCadastroPojo)
        }When {
           log().all()
           post("/cadastrarUsuario")
        }Then{
           log().all()

        }Extract{
            response()
        }

    }


}