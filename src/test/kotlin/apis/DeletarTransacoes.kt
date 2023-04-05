package apis

import factory.RegisterTransacoesFactory
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
import pojo.TransacoesPojo
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class DeletarTransacoes: Base() {

    fun deletarTransacoes(id:Int,transacoesPojo: TransacoesPojo):Response{
        return Given {
            spec(specBase())
            contentType(ContentType.JSON)
            queryParam("",id)
            body(transacoesPojo)
            log().all()
        } When {
            delete("transacoes/")
        }Then {
            log().all()
        }Extract {
            response()
        }
    }


}