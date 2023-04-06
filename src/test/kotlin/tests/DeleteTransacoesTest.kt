package tests

import apis.DeletarTransacoes
import factory.RegisterTransacoesFactory
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import validates.DeletarTransacoesValidade
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class DeleteTransacoesTest {
    private val deletarTransacoes= DeletarTransacoes()
    private val registerTransacoesFactory= RegisterTransacoesFactory()
    private val validate = DeletarTransacoesValidade()
    @Test
    @Tag("Deletar-Transacao-Com-Sucesso")
    @DisplayName("Deletar-Transacao-Com-Sucesso")
    fun deleteSuccesTest(){
        var response=deletarTransacoes.deletarTransacoes(1584256,registerTransacoesFactory.deleteTransacoesSucess())
        validate.deleteSuccesTestValidate(response)
    }

    @Test
    @Tag("Deletar-Transacao-Com-Falha")
    @DisplayName("Deletar-Transacao-Com-Falha")
    fun deleteUnsuccesTest(){
        var response= deletarTransacoes.deletarTransacoes(1584256,registerTransacoesFactory.deleteTransacoeUnsucess())
        validate.deleteUnsuccesTestValidate(response)

    }

}