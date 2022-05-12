package org.techtown.mylifecycle

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast("onCreate 호출됨")

        button.setOnClickListener {
            finish()
        }

        saveButton.setOnClickListener {
            saveData()
        }

        loadButton.setOnClickListener {
            loadData()
        }
    }

    fun saveData() {
        val userName = input1.text.toString()

        val pref = getSharedPreferences("pref", Activity.MODE_PRIVATE)
        pref.edit().putString("userName", userName).commit()
    }

    fun loadData() {
        val pref = getSharedPreferences("pref", Activity.MODE_PRIVATE)
        val userName = pref.getString("userName", "")
        input1.setText(userName)
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        textView.append(message)
    }
}