package dev.lavyne.mycalculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CalculateActivity : AppCompatActivity() {
    lateinit var tilNumber:TextInputLayout
    lateinit var tilSecondNumber:TextInputLayout
    lateinit var etNumber:TextInputEditText
    lateinit var etTwoNumber:TextInputEditText
    lateinit var tvStatus:TextView
    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var btnDivide:Button
    lateinit var btnModulus:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
      castview()

        btnAdd.setOnClickListener{
            var output=validation()
            if (output!=null){
                addition(output!!.num1.toInt(),output!!.num2.toInt())
            }
        }

        btnSub.setOnClickListener{
            var output=validation()
            if (output!=null){
                subtraction(output!!.num1.toInt(),output!!.num2.toInt())
            }
        }
        btnModulus.setOnClickListener {
            var output=validation()
            if (output!=null){
                reminder(output!!.num1.toInt(),output!!.num2.toInt())
            }
        }
        btnDivide.setOnClickListener {
            var output=validation()
            if (output!=null){
                division(output!!.num1.toInt(),output!!.num2.toInt())
            }
        }
    }
    fun castview(){
        tilNumber=findViewById(R.id.tilNumber)
        tilSecondNumber=findViewById(R.id.tilNumbers)
        etNumber=findViewById(R.id.etNumber)
        etTwoNumber=findViewById(R.id.etOneNumber)
        btnAdd=findViewById(R.id.btnAdd)
        btnDivide=findViewById(R.id.btnDivide)
        btnModulus=findViewById(R.id.btnModulus)
        btnSub=findViewById(R.id.btnSub)
        tvStatus=findViewById(R.id.tvStatus)
    }
    data class Myvalidation(var num1:Int,var num2:Int)
     fun validation():Myvalidation?{
         var error=false
         tilSecondNumber.error=null
         tilNumber.error=null
         var num1=etNumber.text.toString()
         var num2=etTwoNumber.text.toString()
          if (num1.isBlank()){
              tilNumber.error="number required"
              error=true
              return null
          }
         if (num2.isBlank()){
             tilSecondNumber.error="number required"
             error=true
             return null
         }
         if (!error){

         }
         return  Myvalidation(num1.toInt(),num2.toInt())
     }

    fun addition(num1:Int,num2:Int){
        var sum=num1+num2
        tvStatus.text="$sum"
    }
    fun subtraction(num1:Int,num2:Int){
        var sub=num1-num2
        tvStatus.text="$sub"
    }
    fun division(num1:Int,num2:Int){
        var divide=num1/num2
        tvStatus.text="$divide"
    }
    fun reminder(num1:Int,num2:Int){
        var mod=num1%num2
        tvStatus.text="$mod"
    }
}
