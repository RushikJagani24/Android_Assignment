package com.example.topstechnology

import android.content.Intent
import android.location.Address
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {


    private lateinit var tvResult:TextView
    private lateinit var btnThitrd:Button
    private lateinit var btnFirst:Button
    private lateinit var etAddress: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvResult=findViewById(R.id.tv_result)
        btnThitrd=findViewById(R.id.btn_ThirdAct)
        btnFirst=findViewById(R.id.btn_firstAct)
        etAddress=findViewById(R.id.et_address)

        var name=intent.getStringExtra("NAME")
        var age=intent.getIntExtra("AGE",0)
        var salary=intent.getDoubleExtra("SALARY",0.0)

        tvResult.text="""
            NAME=$name
            AGE=$age
            SALARY=$salary
        """.trimIndent()

        btnThitrd.setOnClickListener()
        {
            var address=etAddress.text.toString().trim()
            intent= Intent(this,ThirdActivity::class.java)

            intent.putExtra("NAME",name)
            intent.putExtra("AGE",age)
            intent.putExtra("SALARY",salary)
            intent.putExtra("ADDRESS",address)
            startActivity(intent)

        }

        btnFirst.setOnClickListener(){
            onBackPressedDispatcher.onBackPressed()


        }













    }
}