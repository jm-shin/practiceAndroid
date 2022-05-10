package com.example.calc2

class Calc3(override val name: String) : Calculator2 {
    override fun add(a: Int, b: Int): Int {
        return a + b
    }
}