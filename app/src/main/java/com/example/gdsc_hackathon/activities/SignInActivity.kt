package com.example.gdsc_hackathon.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.gdsc_hackathon.R

class SignInActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_activity)

        button = findViewById(R.id.register)

        button.setOnClickListener {
            val intent = Intent(this, PersonalInformationActivity::class.java)
            startActivity(intent)
        }
    }
}