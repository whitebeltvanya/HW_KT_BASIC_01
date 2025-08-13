package ru.netology

const val FEE_PROCENT = 0.75
const val MIN_FEE = 35.00

fun main() {
    var transferFee: Double
    val amounts = listOf(10, 100, 200, 300, 500, 1000, 10_000, 10_000_000)
    for (amount in amounts) {
        transferFee = (amount * FEE_PROCENT)/100
        transferFee = if (transferFee > MIN_FEE) transferFee else MIN_FEE
        println("Размер комиссии равен: $transferFee для суммы $amount")
    }
}

