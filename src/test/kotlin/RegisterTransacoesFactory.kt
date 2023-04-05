class RegisterTransacoesFactory {

    var transacoesPojo = TransacoesPojo()
    fun trasacoesSucess():TransacoesPojo{
        transacoesPojo.conta_id= 1681918
        transacoesPojo.descricao="Movimento 1"
        transacoesPojo.envolvido="solo"
        transacoesPojo.tipo="REC"
        transacoesPojo.data_transacao="10/03/2023"
        transacoesPojo.data_pagamento="12/03/2023"
        transacoesPojo.valor= 50.00
        transacoesPojo.status= true
        return transacoesPojo
    }

    fun transacoesUnsucess():TransacoesPojo{
        transacoesPojo.conta_id= null
        transacoesPojo.descricao="Movimento 1"
        transacoesPojo.envolvido="solo"
        transacoesPojo.tipo="REC"
        transacoesPojo.data_transacao="10/03/2023"
        transacoesPojo.data_pagamento="12/03/2023"
        transacoesPojo.valor= 50.00
        transacoesPojo.status= true
        return transacoesPojo
    }

   fun deleteTransacoesSucess():TransacoesPojo{
       transacoesPojo.conta_id= 1681918
       transacoesPojo.usuario_id=37097
       transacoesPojo.descricao="Movimento 1"
       transacoesPojo.envolvido="solo"
       transacoesPojo.tipo="REC"
       transacoesPojo.data_transacao="10/03/2023"
       transacoesPojo.data_pagamento="12/03/2023"
       transacoesPojo.valor= 50.00
       transacoesPojo.status= false
       return transacoesPojo
   }

    fun deleteTransacoeUnsucess():TransacoesPojo{
        transacoesPojo.conta_id= null
        transacoesPojo.descricao="Movimento 1"
        transacoesPojo.envolvido="solo"
        transacoesPojo.tipo="REC"
        transacoesPojo.data_transacao="10/03/2023"
        transacoesPojo.data_pagamento="12/03/2023"
        transacoesPojo.valor= 50.00
        transacoesPojo.status= true
        return transacoesPojo
    }





}