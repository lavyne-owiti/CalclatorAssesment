package dev.lavyne.mycalculatorapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LandingPageActivity : AppCompatActivity() {
    lateinit var btnCalculate:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)
        btnCalculate=findViewById(R.id.btnCalculate)

        btnCalculate.setOnClickListener {
            val intent= Intent(this,CalculateActivity::class.java)
            startActivity(intent)
        }
    }
}