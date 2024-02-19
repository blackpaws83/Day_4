package com.blackpaws.day4

import java.math.BigDecimal
import java.math.RoundingMode

class BankAccount(
    private var accountHolder: String,
    private var balance: Double
) {
    private var bigDecimalBalance = balance.toBigDecimal()
    private val transactionHistory = mutableListOf<String>()

    fun acctBalance() {
        val formattedBalance = String.format("%.2f", balance)
        println("Current balance for $accountHolder is $$formattedBalance")
    }

    fun deposit(amount: Double) {
        val formattedAmount = String.format("%.2f", amount)
        val bdAmount: BigDecimal = amount.toBigDecimal()
        bigDecimalBalance += bdAmount
        balance = bigDecimalBalance.toDouble()
        val formattedBalance = String.format("%.2f", balance)
        transactionHistory.add("$accountHolder deposited $$formattedAmount. Balance = $$formattedBalance")
    }

    fun withdraw(amount: Double) {
        val formattedAmount = String.format("%.2f", amount)
        var formattedBalance = String.format("%.2f", balance)
        val bdAmount: BigDecimal = amount.toBigDecimal()
        if (bdAmount <= bigDecimalBalance) {
            bigDecimalBalance -= bdAmount
            balance = bigDecimalBalance.toDouble()
            formattedBalance = String.format("%.2f", balance)
            transactionHistory.add("$accountHolder withdrew $$formattedAmount. Balance = $$formattedBalance")
        } else {
            transactionHistory.add("$accountHolder could not withdraw $$formattedAmount, balance = $$formattedBalance")
        }

    }

    fun displayTransactionHistory() {
        println("***")
        println("Transaction History of $accountHolder:")
        for (i in transactionHistory) {
            println(i)
        }
        println("***")
    }

    //    companion object {
//        val bankName = "My Bank" // A variable to store the name of the bank
//
//        fun interestRate(): Double {
//            return 0.05 // A function to calculate and return the interest rate
//        }
//    }

}