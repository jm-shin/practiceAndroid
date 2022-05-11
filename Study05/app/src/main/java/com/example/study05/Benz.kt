package com.example.study05

import android.widget.TextView

class Benz(override val name: String, val ouptput: TextView) : Car {

    override fun doStart() {
        ouptput.setText("${name}의 doStart 호출됨")
    }

    override fun doRun() {
        ouptput.setText("${name}의 doRun 호출됨")
    }

    override fun doStop() {
        ouptput.setText("${name}의 doStop 호출됨")
    }

    override fun doTurn() {
        ouptput.setText("${name}의 doTurn 호출됨")
    }
}