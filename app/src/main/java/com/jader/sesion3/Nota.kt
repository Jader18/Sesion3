package com.jader.sesion3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jader.sesion3.databinding.ActivityNotaBinding

class Nota : AppCompatActivity() {

    lateinit var binding : ActivityNotaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityNotaBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        startApp()


    }

    private fun startApp() {
        binding.btnCalculate.setOnClickListener {
            val name = binding.tieStudent.text.toString()
            val grade1 = binding.tieGrade1.text.toString().toInt()
            val grade2 = binding.tieGrade2.text.toString().toInt()
            val grade3 = binding.tieGrade3.text.toString().toInt()
            val average = (grade1 + grade2 + grade3) / 3

            binding.tvNotaFinal.text = "El promedio de $name es $average"
        }
    }

}