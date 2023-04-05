class UpdateContasFactory {
    var updateContasPojo = UpdateContaPojo()

    fun update_Account_Sucess():UpdateContaPojo{
        updateContasPojo.nome = "teste-QA-02"
        return updateContasPojo

    }

    fun update_Account_Unsuccess():UpdateContaPojo{
        updateContasPojo.nome = "x"
        return updateContasPojo
    }

}