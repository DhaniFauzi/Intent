package com.example.tugas_inten

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kalkulator()
        github()
        profile()
        register()
        exit()

    }
    fun kalkulator(){
        btnKalkulator.setOnClickListener{
            startActivity(Intent(this, kalkulator::class.java))
        }
    }

     fun github(){
        github.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://github.com/DhaniFauzi"))
            startActivity(intent)
        }
    }
    fun profile(){
        cv_profile.setOnClickListener {
            startActivity(Intent(this, profile::class.java))
        }
    }

    fun register(){
        cv_register.setOnClickListener {
            startActivity(Intent(this, register::class.java))
        }
    }

    fun exit(){
        exit.setOnClickListener {
            exit()
        }
    }
}
