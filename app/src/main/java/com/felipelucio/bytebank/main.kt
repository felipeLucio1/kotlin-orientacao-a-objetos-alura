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

    if (saldo > 0.0) {
        println("Conta positiva")
    } else if (saldo == 0.0) {
        println("Conta neutra")
    } else {
        println("Conta negativa")
    }

    saldo -= 1000.0

    // o when do kotlin tem a mesma sisgnificado do if {...} else if {...} ... else {...}
    when {
       saldo > 0.0 -> println("Conta positiva")
       saldo == 0.0 -> println("Conta neutra")
       else -> println("Conta negativa")
    }
}