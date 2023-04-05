package tests

import apis.DeletarContas
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import validates.DeletarContasValidate

class DeleteContasTest {
    private val deletarConta= DeletarContas()
    private val validate=DeletarContasValidate()

    @Test
    @Tag("success")
    @DisplayName("Deletar conta de usuario com sucesso")
    fun deletarContaTest(){
        var response = deletarConta.deletaConta(19)
        validate.deletarContaTestValidate(response)

    }
    @Test
    @Tag("Unsucess")
    @DisplayName("Deletar conta de usuario que nao existe")
    fun deletarContaUnsucessTest(){
        var response = deletarConta.deletaConta(19)
        validate.deletarContaUnsucessTest(response)

    }

}