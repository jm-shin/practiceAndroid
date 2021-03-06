package com.example.study05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var car: Car? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createButton1.setOnClickListener {
            val name = input1.text.toString()
            car = Benz(name, output2)
            showToast("Benz를 구매했습니다.")
        }

        createButton2.setOnClickListener {
            val name = input1.text.toString()
            car = BMW(name, output2)
            showToast("BMW를 구매했습니다.")
        }

        showButton.setOnClickListener {
            if (car is Benz) {
                output1.setText("차종: Benz")
            } else if (car is BMW) {
                output1.setText("차종: BMW")
            }
        }

        startButton.setOnClickListener {
            car?.doStart()
        }

        stopButton.setOnClickListener {
            car?.doStop()
        }

        runButton.setOnClickListener {
            car?.doRun()
        }

        turnButton.setOnClickListener {
            car?.doTurn()
        }
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}