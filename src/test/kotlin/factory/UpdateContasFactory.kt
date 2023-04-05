package factory

import pojo.UpdateContaPojo

class UpdateContasFactory {
    var updateContasPojo = UpdateContaPojo()

    fun update_Account_Sucess(): UpdateContaPojo {
        updateContasPojo.nome = "teste-QA-02-API"
        return updateContasPojo

    }

    fun update_Account_Unsuccess(): UpdateContaPojo {
        updateContasPojo.nome = "teste-QA-02"
        return updateContasPojo
    }

}