package com.umut.simpsons

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import simpsons

class MainActivity : AppCompatActivity() {
    lateinit var jobtext: EditText
    lateinit var agetext: EditText
    lateinit var nametext: EditText
    lateinit var button: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textView = findViewById(R.id.textView)
        nametext = findViewById(R.id.nametext)
        agetext = findViewById(R.id.agetext)
        button = findViewById(R.id.button)
        jobtext = findViewById(R.id.jobtext)

        var simp = simpsons("umut",15,"umut")
    }

    fun clicked(view: View){
       var name = nametext.text.toString()
       var age = agetext.text.toString().toIntOrNull()
       var job = jobtext.text.toString()
        if(age != null){
            textView.text = "name: ${name} age: ${age} job: ${job} "
            }
        else{
            textView.text = "enter your age"
        }



    }
}