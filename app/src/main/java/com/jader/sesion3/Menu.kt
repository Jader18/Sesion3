package com.jader.sesion3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jader.sesion3.databinding.ActivityMenuBinding
import com.jader.sesion3.databinding.ActivityPersonaBinding

class Menu : AppCompatActivity() {

    lateinit var binding : ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenuBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        startApp()

    }

    private fun startApp(){

        binding.btnEvaluate.setOnClickListener {
            val intent1 = Intent(this, Persona::class.java)
            startActivity(intent1)
        }

        binding.btnGoGrade.setOnClickListener {
            val intent = Intent(this, Nota::class.java)
            startActivity(intent)
        }

    }
}