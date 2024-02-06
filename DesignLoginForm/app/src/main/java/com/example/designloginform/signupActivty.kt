package com.example.designloginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designloginform.databinding.ActivitySignupBinding

class signupActivty : AppCompatActivity() {

    private lateinit var binding:ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSignup.setOnClickListener {
            var intent=Intent(this,firstactivity::class.java)
            startActivity(intent)

        }


    }
}