package com.felipelucio.bytebank

fun main() {
    println("Bem vindo ao Bytebank")
    val titular = "Felipe"
    val numero = 1234
    var saldo = 0.0

    println("titular $titular")
    println("numero da conta $numero")
    println("saldo $saldo")

    saldo = 15.toDouble()
    println("")
    println("saldo $saldo")

    saldo += 100.0
    println("")
    println("saldo $saldo")
}