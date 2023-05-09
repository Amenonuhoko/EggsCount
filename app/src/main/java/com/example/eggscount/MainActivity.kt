package com.example.eggscount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var result: TextView? = null
    private var input: TextView? = null

    var eggs = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnEnter = findViewById<Button>(R.id.btnEnter)
        var result = findViewById<TextView>(R.id.result)
        var input = findViewById<TextView>(R.id.input)

        btnEnter.setOnClickListener {
            var gross = eggs / 144
            var dozen = (eggs % 144) / 12
            var singles = eggs % 12

            result?.text = "There are $gross gross, $dozen dozen and $singles eggs"
        }

        fun updateInput(entry: Button) {
            eggs = eggs * 10 + (entry.text).toString().toInt()
            input?.text = eggs.toString()
        }


        var btn1 = findViewById<Button>(R.id.btnOne)
        btn1.setOnClickListener { updateInput(it as Button) }
        var btn2 = findViewById<Button>(R.id.btnTwo)
        btn2.setOnClickListener { updateInput(it as Button) }
        var btn3 = findViewById<Button>(R.id.btnThree)
        btn3.setOnClickListener { updateInput(it as Button) }
        var btn4 = findViewById<Button>(R.id.btnFour)
        btn4.setOnClickListener { updateInput(it as Button) }
        var btn5 = findViewById<Button>(R.id.btnFive)
        btn5.setOnClickListener { updateInput(it as Button) }
        var btn6 = findViewById<Button>(R.id.btnSix)
        btn6.setOnClickListener { updateInput(it as Button) }
        var btn7 = findViewById<Button>(R.id.btnSeven)
        btn7.setOnClickListener { updateInput(it as Button) }
        var btn8 = findViewById<Button>(R.id.btnEight)
        btn8.setOnClickListener { updateInput(it as Button) }
        var btn9 = findViewById<Button>(R.id.btnNine)
        btn9.setOnClickListener { updateInput(it as Button) }
        var btn0 = findViewById<Button>(R.id.btnZero)
        btn0.setOnClickListener { updateInput(it as Button) }
    }
}