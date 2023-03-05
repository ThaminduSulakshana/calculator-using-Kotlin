package com.example.tute3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.tute3.Calculator.Calculator

class MainActivity : AppCompatActivity() {
    lateinit var edtNumber1: EditText
    lateinit var edtNumber2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}

