package com.example.basic2

import android.widget.TextView

open class Person(val name:String?) {
    var age: Int? = null
    var address: String? = null

    init {
        println("Person의 init 블록에서 실행됨.")
    }

    constructor(name:String?, age:Int?, address:String?):this(name) {
        println("생성자 호출")

        this.age = age
        this.address = address
    }

    open fun walk(speed:Int=0, output:TextView) {
        output.setText("사람이 ${speed} 속도로 걸어 갑니다.")
    }
}