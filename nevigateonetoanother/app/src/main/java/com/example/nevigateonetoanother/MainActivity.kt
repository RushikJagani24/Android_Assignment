package com.example.nevigateonetoanother

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnNevigate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnNevigate=findViewById(R.id.btn_nevigate)
        btnNevigate.setOnClickListener {

            var intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }


    }
}