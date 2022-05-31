package com.felipelucio.bytebank

fun main() {
    println("Bem vindo ao Bytebank")

    val contaFelipe = Conta()
    contaFelipe.titular = "Felipe"
    contaFelipe.numero = 1000
    contaFelipe.saldo = 100.0

    println("titular ${contaFelipe.titular}")
    println("numero ${contaFelipe.numero}")
    println("saldo ${contaFelipe.saldo}")

    val contaRay = Conta()
    contaRay.titular = "Ray"
    contaRay.numero = 1001
    contaRay.saldo = 300.0

    println("titular ${contaRay.titular}")
    println("numero ${contaRay.numero}")
    println("saldo ${contaRay.saldo}")

    deposita(contaFelipe, 10.0)
    deposita(contaRay, 10.0)

    println("saldo Felipe ${contaFelipe.saldo}")
    println("saldo Ray ${contaRay.saldo}")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}

fun testaCopiaEReferencia() {
    println()
    println("----------Teste de copia e referencia----------")

    val varX = 10
    var varY = varX
    println("varX $varX")
    println("varY $varY")

    val contaUm = Conta()
    contaUm.titular = "Um"

    val contaDois = contaUm
    contaDois.titular = "Dois"

    println("contaUm.titular ${contaUm.titular}")
    println("contaDois.titular ${contaDois.titular}")
}

fun testaLacos() {
    for (i in 1..5) {
        val titular = "Felipe $i"
        val numero = 1000+i
        var saldo = i+10.0

        println("titular $titular")
        println("numero da conta $numero")
        println("saldo $saldo")
        println()
    }

    for (i in 5 downTo 1 step 2) {
        val titular = "Felipe $i"
        val numero = 1000+i
        var saldo = i+10.0

        println("titular $titular")
        println("numero da conta $numero")
        println("saldo $saldo")
        println()
    }

    var i = 0
    while (i < 5) {
        val titular = "Felipe $i"
        val numero = 1000+i
        var saldo = i+10.0

        println("titular $titular")
        println("numero da conta $numero")
        println("saldo $saldo")
        println()
        i++
    }
}

fun testaCondicoes(saldo: Double) {
    var saldo1 = saldo
    if (saldo1 > 0.0) {
        println("Conta positiva")
    } else if (saldo1 == 0.0) {
        println("Conta neutra")
    } else {
        println("Conta negativa")
    }

    saldo1 -= 1000.0

    // o when do kotlin tem a mesma sisgnificado do if {...} else if {...} ... else {...}
    when {
        saldo1 > 0.0 -> println("Conta positiva")
        saldo1 == 0.0 -> println("Conta neutra")
        else -> println("Conta negativa")
    }
}