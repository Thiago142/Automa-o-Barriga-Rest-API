package tests

import apis.UpdateContas
import factory.UpdateContasFactory
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import validates.UpdateContasValidade
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class UpdateContasTest {

    private val updateContas=UpdateContas()
    private val validate = UpdateContasValidade()
    private val updateContasFactory= UpdateContasFactory()

    @Test
    @Tag("success")
    @DisplayName("Registro de usuario com sucesso")
    fun atualizarContaSucessTest(){
        var response = updateContas.updateAccount( 1681918,updateContasFactory.update_Account_Sucess())
        validate.atualizarContaSucessTest(response)


    }
    @Test
    @Tag("success")
    @DisplayName("Registro de usuario com falha")
    fun atualizarContaComMesmoNomeTest(){
        var response = updateContas.updateAccount( 1681918,updateContasFactory.update_Account_Unsuccess())
        validate.atualizarContaComMesmoNome(response)

    }

}