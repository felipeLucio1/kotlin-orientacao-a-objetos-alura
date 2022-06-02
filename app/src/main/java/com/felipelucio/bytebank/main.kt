package com.felipelucio.bytebank

fun main() {
    println("Bem vindo ao Bytebank")

    val contaFelipe = Conta("Felipe", 1000)
    contaFelipe.deposita(100.0)

    println("titular ${contaFelipe.titular}")
    println("numero ${contaFelipe.numero}")
    println("saldo ${contaFelipe.saldo}")

    val contaRay = Conta("Ray", 1001)
    contaRay.deposita(300.0)

    println("titular ${contaRay.titular}")
    println("numero ${contaRay.numero}")
    println("saldo ${contaRay.saldo}")

    contaFelipe.deposita( 10.0)
    contaRay.deposita( 10.0)

    println("saldo Felipe ${contaFelipe.saldo}")
    println("saldo Ray ${contaRay.saldo}")

    contaFelipe.saca( 10.0)
    contaRay.saca( 10.0)

    println("saldo Felipe ${contaFelipe.saldo}")
    println("saldo Ray ${contaRay.saldo}")

    println("Saques maiores que o saldo")

    contaFelipe.saca( 1200.0)
    contaRay.saca( 320.0)

    println("saldo Felipe ${contaFelipe.saldo}")
    println("saldo Ray ${contaRay.saldo}")

    println("Transfere da conta do Felipe para a Ray")

    println("saldo Felipe ${contaFelipe.saldo}")
    println("saldo Ray ${contaRay.saldo}")

    if (contaFelipe.transfere(20.0, contaRay)) {
        println("Trnadferencia efetuada com sucesso!")
    } else {
        println("Falha na transferencia!")
    }

    println("saldo Felipe ${contaFelipe.saldo}")
    println("saldo Ray ${contaRay.saldo}")
}

class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0.0) {
            saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
        }
        return false
    }


}

fun testaCopiaEReferencia() {
    println()
    println("----------Teste de copia e referencia----------")

    val varX = 10
    var varY = varX
    println("varX $varX")
    println("varY $varY")

    val contaUm = Conta("Um", 1)

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