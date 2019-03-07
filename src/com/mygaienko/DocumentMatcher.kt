package com.mygaienko

public class KotlinMatcher {

    val matchers: MutableList<DocumentMatcher<out Record>>  = mutableListOf(BankStatementMatcher(), PayrollMatcher())
}


interface Record

class BankStatement : Record

class Payroll : Record


interface DocumentMatcher<T : Record> {

    fun match(t1: T, t2: T): Boolean

}

class BankStatementMatcher : DocumentMatcher<BankStatement> {

    override fun match(t1: BankStatement, t2: BankStatement): Boolean {
        return true
    }
}

class PayrollMatcher : DocumentMatcher<Payroll> {

    override fun match(t1: Payroll, t2: Payroll): Boolean {
        return true
    }
}