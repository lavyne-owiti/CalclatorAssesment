package dev.lavyne.mycalculatorapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

    val intent=Intent(this,LandingPageActivity::class.java)
    startActivity(intent)
    finish()
    }
}