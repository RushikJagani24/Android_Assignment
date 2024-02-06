package com.example.designloginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designloginform.databinding.ActivityFirstBinding
import com.example.designloginform.databinding.ActivityLoginBinding

class firstactivity : AppCompatActivity() {

    private lateinit var binding:ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            var intent=Intent(this,loginActivty::class.java)
    startActivity(intent)
        }


        binding.tvSignup.setOnClickListener {
            var intent=Intent(this,signupActivty::class.java)
            startActivity(intent)

        }

    }



}