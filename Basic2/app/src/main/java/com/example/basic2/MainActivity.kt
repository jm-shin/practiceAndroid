package com.example.basic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var person: Person? = null

    enum class PersonType {
        PERSON, STUDENT, BABY
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createPersonButton.setOnClickListener {
            makePerson(PersonType.PERSON)
        }

        createStudentButton.setOnClickListener {
            makePerson(PersonType.STUDENT)
        }

        walkButton.setOnClickListener {
            person?.walk(10, output1)
        }

        runButton.setOnClickListener {
            if (person is Student) {
                val student = person as Student
                student?.run(10, output1)
            } else {
                output1.setText("사람은 달리기 기능이 없습니다.")
            }
        }
    }

    fun makePerson(type: PersonType) {
        val name = input1.text.toString()
        val age = input2.text.toString().toInt()
        val address = input3.text.toString()

        when(type) {
            PersonType.PERSON -> {
                person = Person(name, age, address)
                imageView.setImageResource(R.drawable.person)
            }
            PersonType.STUDENT -> {
                person = Student(name, age, address)
                imageView.setImageResource(R.drawable.student)
            }
        }
        output1.setText("사람을 만들었습니다.: ${type}, ${person?.name}")
    }
}