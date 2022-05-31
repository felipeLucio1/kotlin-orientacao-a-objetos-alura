package com.felipelucio.bytebank

fun main() {
    println("Bem vindo ao Bytebank")

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