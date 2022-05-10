package com.example.calc2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            // object 키워드 : 추상메서드로부터 직접 객체 만들어 내기
            val calc1 = object : CalcAdapter() {
                override fun subtract(a: Int, b: Int): Int {
                    return a - b
                }
            }
            val result1 = calc1.subtract(20, 10)
            textView.setText("결과: ${result1}")
        }

        button3.setOnClickListener {
            val calc1 = object : Calculator {
                override fun add(a: Int, b: Int): Int {
                    return a + b
                }
            }
            val result1 = calc1.add(10, 10)
            textView.setText("결과: ${result1}")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}