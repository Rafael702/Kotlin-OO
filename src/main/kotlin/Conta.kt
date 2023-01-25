class Conta(var titular: String, val numero: Int = 0) {
    var saldo = 0.0
        private set
    //        get() {
//            return field
//        }

    //        set(value: Int) {
//            field = value
//            println(field)
//        }

    init {
        println("O titular é: $titular")
    }

    // O construtor pode ser colocado nos parametros da class.
    // Fica: class Conta(val titular: String, val numero: Int){} -> Construtor primario -> Mais idiomatico
    // Construtor secundario
//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }
    fun deposita(valor: Int) {
        if (valor > 0) this.saldo += valor
    }

    fun saca(valor: Int) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("Saldo: $saldo")
        }
    }

    fun transfere(valor: Int, contaTransferencia: Conta): Boolean {
        return if (saldo >= valor) {
            saldo -= valor
            contaTransferencia.deposita(valor)
            println("Transferência de R$ $valor para ${contaTransferencia.titular}, Concluida")
            true
        } else {
            println("Falha na transferência para ${contaTransferencia.titular}")
            false
        }
    }
}
