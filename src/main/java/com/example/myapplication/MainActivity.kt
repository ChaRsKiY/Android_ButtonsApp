package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button1)
        val button3 = findViewById<Button>(R.id.button2)

        val textField = findViewById<TextView>(R.id.textfield)

        button1.setOnClickListener {
            textField.text = button1.text
        }

        button2.setOnClickListener {
            textField.text = button2.text
        }

        button3.setOnClickListener {
            textField.text = button3.text
        }
    }
}
