package com.jader.sesion3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jader.sesion3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        startApp()
    }

    private fun startApp(){
        binding.btnIngresar.setOnClickListener {


            val user = binding.etUserId.text.toString()
            val password = binding.etPassword.text.toString()

            if(user.equals("admin") && password.equals("admin123")){
                Toast.makeText(this, "Bienvenido $user", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Menu::class.java)
                startActivity(intent)



            }else{
                Toast.makeText(this, "Credenciales invalidas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}