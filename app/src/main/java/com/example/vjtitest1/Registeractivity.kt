package com.example.vjtitest1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner

class Registeractivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeractivity)

        val spinner:Spinner = findViewById(R.id.spinner)
        val question1 = resources.getStringArray(R.array.question1)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, question1
            )
            spinner.adapter = adapter
        }


        val question2: Spinner = findViewById(R.id.question2)
        val YearofStudy = resources.getStringArray(R.array.year)
            if (question2 != null) {
                val adapter = ArrayAdapter(
                    this,
                    android.R.layout.simple_spinner_item, YearofStudy
                )
                question2.adapter = adapter
            }




    }

}