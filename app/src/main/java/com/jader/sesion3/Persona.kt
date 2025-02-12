package com.jader.sesion3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.jader.sesion3.databinding.ActivityPersonaBinding

class Persona : AppCompatActivity() {
    lateinit var binding : ActivityPersonaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityPersonaBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        startApp()


    }


    private fun startApp(){

        binding.btnEvaluate.setOnClickListener {

            val age = binding.tieAge.text.toString().toInt()

            if(age >= 18){
                Toast.makeText(this, "Eres mayor de edad", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Eres menor de edad", Toast.LENGTH_LONG).show()

            }
        }


    }
}