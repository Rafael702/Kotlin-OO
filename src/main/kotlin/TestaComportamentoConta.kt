fun testaComportamentoConta() {
    val contaDoAlex = Conta(titular = "Alex", numero = 1000)

    val contaDaFran = Conta(numero = 1234, titular = "Fran")

    println("Depositando na conta do ${contaDoAlex.titular}")
    contaDoAlex.deposita(50)
    println("Saldo: ${contaDoAlex.saldo}")

    println("Depositando na conta do ${contaDaFran.titular}")
    contaDaFran.deposita(20)
    println("Saldo: ${contaDaFran.saldo}")

    println("Sacando valor da conta: ${contaDoAlex.numero}, titular: ${contaDoAlex.titular}")
    contaDoAlex.saca(50)
    println("Saldo atual: ${contaDoAlex.saldo}")

    println("Sacando valor da conta: ${contaDaFran.numero}, titular: ${contaDaFran.titular}")
    contaDaFran.saca(10)
    println("Saldo atual: ${contaDaFran.saldo}")

    println("Transferência da conta da Fran para o Alex")

    contaDaFran.transfere(200, contaDoAlex)

    println("Saldo: ${contaDoAlex.saldo}, titular: ${contaDoAlex.titular}")
    println("Saldo: ${contaDaFran.saldo}, titular: ${contaDaFran.titular}")
}
