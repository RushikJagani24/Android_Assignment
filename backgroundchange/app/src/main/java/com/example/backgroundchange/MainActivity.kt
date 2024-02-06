package com.example.backgroundchange

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {


    private lateinit var btnBlack: Button
    private lateinit var btnGreen: Button
    private lateinit var btnYello: Button
    private lateinit var btnRed: Button
    private lateinit var btnBlue: Button
    private lateinit var layout: LinearLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBlack=findViewById(R.id.btn_black)
        btnGreen=findViewById(R.id.btn_green)
        btnBlue=findViewById(R.id.btn_blue)
        btnRed=findViewById(R.id.btn_red)
        btnYello=findViewById(R.id.btn_yello)
        layout=findViewById<LinearLayout>(R.id.layout)

        btnBlack.setOnClickListener {
            layout.setBackgroundColor(getColor(R.color.black))
        }
        btnYello.setOnClickListener {
            layout.setBackgroundColor(getColor(R.color.yello))
        }
        btnRed.setOnClickListener {
            layout.setBackgroundColor(getColor(R.color.red))
        }
        btnBlue.setOnClickListener {
            layout.setBackgroundColor(getColor(R.color.blue))
        }
        btnGreen.setOnClickListener {
            layout.setBackgroundColor(getColor(R.color.green))
        }
    }
}