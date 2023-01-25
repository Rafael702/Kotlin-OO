fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println(" numeroX $numeroX ")
    println(" numeroY $numeroY ")

    val contaJoao = Conta(" João ", 1002)
    contaJoao.titular = " João "
    val contaMaria = Conta(" Maria ", 1003)
    contaMaria.titular = " Maria "
    contaJoao.titular = " João "

    println(" titular conta joão: ${contaJoao.titular} ")
    println(" titular conta maria: ${contaMaria.titular} ")

    println(contaJoao)
    println(contaMaria)
}
