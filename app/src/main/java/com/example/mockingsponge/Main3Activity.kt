package com.example.mockingsponge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main3.view.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var iptext = findViewById<TextView>(R.id.editText)
        var optext = findViewById<TextView>(R.id.textView)
        val button2 = findViewById<Button>(R.id.button2)



        button2.setOnClickListener {
            var ftext = ""
            for (i in 0..iptext.length() - 1) {
                var ch = iptext.text.toString()[i]
                if (i % 2 == 0) {
                    ftext = ftext.plus(ch.toString().toUpperCase())
                } else {
                    ftext = ftext.plus(ch.toString())
                }
                optext.textView.setText(ftext)
            }
        }
    }
}


