import org.apache.commons.lang3.RandomStringUtils

class RegisterContasFactory {

    var registerContasPojo = RegisterContasPojo()
    fun registro_conta_existente():RegisterContasPojo{
        registerContasPojo.nome = "teste-QA"
        return registerContasPojo
    }
    fun registro_conta():RegisterContasPojo{
        registerContasPojo.nome= RandomStringUtils().toString()
        return registerContasPojo
    }


}