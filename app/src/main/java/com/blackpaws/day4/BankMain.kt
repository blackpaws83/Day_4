package com.blackpaws.day4

fun main() {
    val myBankAccount = BankAccount("blackpaws83", 55.45)
    myBankAccount.deposit(13.00)
    myBankAccount.withdraw(48.23)
    myBankAccount.withdraw(35.00)
    println()
    myBankAccount.displayTransactionHistory()
    myBankAccount.acctBalance()
    val anotherBankAccount = BankAccount("Sarah", 0.0)
    anotherBankAccount.deposit(100.00)
    anotherBankAccount.withdraw(10.00)
    anotherBankAccount.deposit(300.00)
    anotherBankAccount.displayTransactionHistory()
    anotherBankAccount.acctBalance()

}