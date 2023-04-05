package tests

import apis.PostTransacoes
import factory.RegisterTransacoesFactory
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import validates.PostTransacaoValidate
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class PostTransacaoTest {
    private val postTransacoes=PostTransacoes()
    private val registerTransacoesFactory= RegisterTransacoesFactory()
    private val validate= PostTransacaoValidate()

    @Test
    @Tag("Registro-Transacao-Com-Sucesso")
    @DisplayName("Transacao com sucesso")
    fun createPostTransacoesSucessTest(){
        val response = postTransacoes.postTransacoes(registerTransacoesFactory.trasacoesSucess())
        validate.createPostTransacoesSucessTestValidate(response)

    }
    @Test
    @Tag("Registro-Trasacao-Com-Falha")
    @DisplayName("Transacao com Falha")
    fun createPostTransacoesUnsucessTest(){
        val response = postTransacoes.postTransacoes(registerTransacoesFactory.transacoesUnsucess())
        validate.createPostTransacoesUnsucessTestValidate(response)
    }


}