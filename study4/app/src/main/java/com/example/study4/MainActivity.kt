package com.example.study4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var animal1:Animal? = null
    var animal2:Animal? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animal1 = Animal("고양이", 2)
        animal2 = Animal("강아지", 3)

        AnimalImageView1.setOnClickListener {
            showToast("동물: ${animal1?.name} 선택")
            textView.setText("선택된 동물은: ${animal1?.name}, 나이는 ${animal1?.age} 입니다.")
        }

        AnimalImageView2.setOnClickListener {
            showToast("동물: ${animal2?.name} 선택")
            textView.setText("선택된 동물은: ${animal2?.name}, 나이는 ${animal2?.age} 입니다.")
        }
    }
    fun showToast(message:String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}