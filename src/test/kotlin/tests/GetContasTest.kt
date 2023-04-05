package tests

import apis.GetContas
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import validates.GetContasValidate

class GetContasTest {

    private val getcontas= GetContas()
    private  val validade= GetContasValidate()
    @Test
    @Tag("Busca-de-contas")
    @DisplayName("Busca-de-contas")
    fun getcontasTest() {
        val response = getcontas.getcontas()
        validade.validadeSucess(response)
    }
}