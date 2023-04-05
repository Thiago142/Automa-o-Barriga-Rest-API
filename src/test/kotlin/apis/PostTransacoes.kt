package apis

import factory.RegisterTransacoesFactory
import pojo.TransacoesPojo
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

class PostTransacoes: Base() {
    fun postTransacoes (transacoesPojo: TransacoesPojo):Response{
       return  Given {
            spec(specBase())
            contentType(ContentType.JSON)
            body(transacoesPojo)
            log().all()
        }When{
             post("/transacoes")
        }Then{
             log().all()
        }Extract {
            response()
       }

    }

    private val registerTransacoesFactory= RegisterTransacoesFactory()

    @Test
    fun createPostTransacoesSucessTest(){
        val response = postTransacoes(registerTransacoesFactory.trasacoesSucess())
        assertAll("",
            {assertNotNull(response)},
            { assertEquals(201,response.statusCode)},
        )
    }
    @Test
    fun createPostTransacoesUnsucessTest(){
        val response = postTransacoes(registerTransacoesFactory.transacoesUnsucess())
        assertAll("",
            {assertNotNull(response)},
            { assertEquals(400,response.statusCode)},
            { assertEquals("Conta é obrigatório",response.jsonPath().getString("[0].msg")) }
        )
    }







}