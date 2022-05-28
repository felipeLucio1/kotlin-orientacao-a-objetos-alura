package com.felipelucio.bytebank

fun main() {
    println("Bem vindo ao Bytebank")
    val titular = "Felipe"
    val numero = 1234
    var saldo = 0.0
    saldo += 100.0

    println("titular $titular")
    println("numero da conta $numero")
    println("saldo $saldo")

//    testaCondicoes(saldo)
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