package com.example.uts_ppapb_b2

import HomepageActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_ppapb_b2.databinding.ActivityWelcomePageBinding

class WelcomePageActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityWelcomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentToGetStartedActivity = Intent(this@WelcomePageActivity, GetStartedActivity::class.java)
            with(binding){
                btnGetStarted.setOnClickListener{
                    startActivity(intentToGetStartedActivity)
                }
            }
    }
}