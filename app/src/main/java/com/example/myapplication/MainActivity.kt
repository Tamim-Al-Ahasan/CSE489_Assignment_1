package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sum: String = ""

        val display: TextView = findViewById(R.id.taka)
        val one: Button = findViewById(R.id.button1)
        val two: Button = findViewById(R.id.button2)
        val three: Button = findViewById(R.id.button3)
        val four: Button = findViewById(R.id.button4)
        val five: Button = findViewById(R.id.button5)
        val six: Button = findViewById(R.id.button6)
        val seven: Button = findViewById(R.id.button7)
        val eight: Button = findViewById(R.id.button8)
        val nine: Button = findViewById(R.id.button9)
        val zero: Button = findViewById(R.id.button10)
        val clear: Button = findViewById(R.id.button11)


        val fiveh_txt: TextView = findViewById(R.id.five_h)
        val oneh_txt: TextView = findViewById(R.id.one_h)
        val fifty_txt: TextView = findViewById(R.id.fifty)
        val twenty_txt: TextView = findViewById(R.id.twenty)
        val ten_txt: TextView = findViewById(R.id.ten)
        val two_txt: TextView = findViewById(R.id.two)
        val one_txt: TextView = findViewById(R.id.one)


        fun calculateDenominations(amount: Int) {
            val fiveHundred = amount / 500
            val oneHundred = (amount % 500) / 100
            val fifty = (amount % 100) / 50
            val twenty = (amount % 50) / 20
            val ten = (amount % 20) / 10
            val two = (amount % 10) / 2
            val one = amount % 2

            fiveh_txt.text = "500: $fiveHundred"
            oneh_txt.text = "100: $oneHundred"
            fifty_txt.text = "50: $fifty"
            twenty_txt.text = "20: $twenty"
            ten_txt.text = "10: $ten"
            two_txt.text = "2: $two"
            one_txt.text = "1: $one"
        }

        val buttons = mapOf(
            one to "1", two to "2", three to "3", four to "4",
            five to "5", six to "6", seven to "7", eight to "8",
            nine to "9", zero to "0"
        )

        buttons.forEach { (button, value) ->
            button.setOnClickListener {
                sum += value
                display.text = "Taka: $sum"
                val temp = sum.toIntOrNull() ?: 0
                calculateDenominations(temp)
            }
        }

        clear.setOnClickListener {
            sum = ""
            display.text = "TAKA: "
            fiveh_txt.text = "500: 0"
            oneh_txt.text = "100: 0"
            fifty_txt.text = "50: 0"
            twenty_txt.text = "20: 0"
            ten_txt.text = "10: 0"
            two_txt.text = "2: 0"
            one_txt.text = "1: 0"
        }
    }
}
