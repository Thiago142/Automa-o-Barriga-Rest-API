package factory

import pojo.RegisterCadastroPojo

class RegisterCadastroFactory {
    var registerCadastroPojo = RegisterCadastroPojo()

    fun acessarCadastroUnsucess():RegisterCadastroPojo{
        registerCadastroPojo.nome = "teste"
        registerCadastroPojo.email= "teste@teste"
        registerCadastroPojo.senha= "teste"
        return registerCadastroPojo
    }


}