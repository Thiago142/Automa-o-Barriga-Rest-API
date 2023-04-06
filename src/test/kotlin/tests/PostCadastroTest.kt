package tests

import apis.PostCadastro
import factory.RegisterCadastroFactory
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import validates.RegisterCadastroValidade

class PostCadastroTest {

    private val postCadastro= PostCadastro()
    private val registerCadastroFactory=RegisterCadastroFactory()
    private val validade = RegisterCadastroValidade()
    @Test
    @Tag("Acessar-Cadastro-Com-Campos-Vazios")
    @DisplayName("Acessar-Cadastro-Com-Campos-Vazios")
    fun acessarCadastroUnsucessTest(){
        val response = postCadastro.acessarCadastro(registerCadastroFactory.acessarCadastroUnsucess())
        validade.verificaCadastroTestValidade(response)

    }

}