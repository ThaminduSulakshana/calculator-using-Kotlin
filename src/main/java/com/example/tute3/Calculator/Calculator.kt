package com.example.tute3.Calculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.tute3.R


class Calculator(private val number1: Double, private val number2: Double) {
    fun add() = number1 + number2
    fun subtract() = number1 - number2
    fun divide() = number1 / number2
    fun multiply() = number1 * number2
}



class MainActivity : AppCompatActivity() {

    lateinit var edtNumber1: EditText
    lateinit var edtNumber2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.edtNumber1)
        edtNumber2 = findViewById(R.id.edtNumber2)
    }

    fun buttonClick(v: View) {
        var ans = 0.0
        val calculator = Calculator(
            edtNumber1.text.toString().toDouble(),
            edtNumber2.text.toString().toDouble()
        )

        when (v.id) {
            R.id.btnPlus -> ans = calculator.add()
            R.id.btnMinus -> ans = calculator.subtract()
            R.id.btnMultiply -> ans = calculator.multiply()
            R.id.btnDivide -> ans = calculator.divide()
        }

        println(ans) //this will print the output on the terminal
    }
}
