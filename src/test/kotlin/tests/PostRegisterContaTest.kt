package tests

import apis.PostContas
import factory.RegisterContasFactory
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import validates.PostContasValidate
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class PostRegisterContaTest {

    private val postContas= PostContas()
    private val validate= PostContasValidate()
    private val registerContasFactory = RegisterContasFactory()

    @Test
    @Tag("Criação-de-conta")
    @DisplayName("Criação-de-conta")
    fun createPostContasTest(){
        val response = postContas.postContas(registerContasFactory.registro_conta())
        validate.createPostContasSucess(response)

    }

    @Test
    @Tag("Criação-de-conta-Existente")
    @DisplayName("Criação de conta que já existe")
    fun createPostContasExistenteTest(){
        val response = postContas.postContas(registerContasFactory.registro_conta_existente())
        validate.createPostContasExistenteUnsucess(response)
    }

}