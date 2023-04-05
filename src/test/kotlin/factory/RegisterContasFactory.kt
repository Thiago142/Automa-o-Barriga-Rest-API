package factory

import pojo.RegisterContasPojo
import org.apache.commons.lang3.RandomStringUtils
import org.apache.commons.lang3.RandomUtils
import java.util.random.RandomGenerator
import kotlin.random.Random

class RegisterContasFactory {

    var registerContasPojo = RegisterContasPojo()
    fun registro_conta_existente(): RegisterContasPojo {
        registerContasPojo.nome = "teste-QA"
        return registerContasPojo
    }
    fun registro_conta(): RegisterContasPojo {
        registerContasPojo.nome= RandomStringUtils().toString()
        return registerContasPojo

    }


}