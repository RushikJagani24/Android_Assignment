package com.example.topstechnology

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class ThirdActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var btnReturn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        tvResult=findViewById(R.id.tv_result)
        btnReturn=findViewById(R.id.btn_return)

        var name=intent.getStringExtra("NAME")
        var age=intent.getIntExtra("AGE",0)
        var salary=intent.getDoubleExtra("SALARY",0.0)
        var address=intent.getStringExtra("ADDRESS")

        tvResult.text="""
            NAME=$name
            AGE=$age
            SALARY=$salary
            ADDRESS=$address
        """.trimIndent()


        btnReturn.setOnClickListener(){


            onBackPressedDispatcher.onBackPressed()
        }





    }
}