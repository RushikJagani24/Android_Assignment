
package com.example.topstechnology

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.color.utilities.SchemeFruitSalad

class FirstActivity : AppCompatActivity() {

    private lateinit var btnSubmit:Button
    private lateinit var etName:EditText
    private lateinit var etAge:EditText
    private lateinit var etSalary:EditText
    

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        btnSubmit=findViewById(R.id.btn_secondAct)
        etName=findViewById(R.id.et_name)
        etAge=findViewById(R.id.et_age)
        etSalary=findViewById(R.id.et_salary)


        btnSubmit.setOnClickListener(){
//            Toast.makeText(this,"button clicked",Toast.LENGTH_LONG).show()
        //    Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()

            //store fill up data
            var name:String=etName.text.toString().trim()
            var age:Int=
                     if(etAge.text.toString().trim().isEmpty()) 0 else(etAge.text.toString().trim().toInt())
            var salary:Double =
                if (etSalary.text.toString().trim().isEmpty()) 0.0 else(etSalary.text.toString().trim().toDouble())

    //navigate activty
                  var intent=Intent(this,SecondActivity::class.java)

            intent.putExtra("NAME",name)
            intent.putExtra("AGE",age)
            intent.putExtra("SALARY",salary)
            startActivity(intent)

        }

   
    }
}