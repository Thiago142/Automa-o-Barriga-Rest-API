class RegisterUsersFactory {

    var registerUserPojo = RegisterUserPojo()

    fun registro_com_sucesso():RegisterUserPojo{
        registerUserPojo.email = "thiago.teste@hotmail.com"
        registerUserPojo.senha = "testeQA"
        return registerUserPojo
    }

    fun registro_contendo_apenas_campo_email():RegisterUserPojo{
        registerUserPojo.email = "teste_apenas_email@hotmail.com"
        return registerUserPojo
    }

}