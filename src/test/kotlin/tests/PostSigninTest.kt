package tests

import apis.PostSignin
import factory.RegisterUsersFactory
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import validates.PostSigninValidate

class PostSigninTest {

    private val postSignin= PostSignin()
    private val registerUsersFactory = RegisterUsersFactory()
    private val validate=PostSigninValidate()
    @Test
    @Tag("Registro-Com-Sucesso")
    @DisplayName("Login com sucesso")
    fun registro_com_sucessoTest(){
        val response = postSignin.postSignin(registerUsersFactory.registro_com_sucesso())
        validate.registro_com_sucessoTest(response)

    }

    @Test
    @Tag("Registro-Com-Falha")
    @DisplayName("Login sem informar a senha")
    fun registro_contendo_apenas_campo_emailTest(){
        val response = postSignin.postSignin(registerUsersFactory.registro_contendo_apenas_campo_email())
        validate.registro_contendo_apenas_campo_emailTest(response)

    }
}