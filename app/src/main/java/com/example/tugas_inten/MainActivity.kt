package com.example.tugas_inten

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_inten.profile
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profile.setOnClickListener {
            Intent(this, profile::class.java).also {
                startActivity(it)
            }
        }
        register.setOnClickListener {
            Intent(this, register::class.java).also {
                startActivity(it)
            }
        }
        github.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://github.com/DhaniFauzi"))
            startActivity(intent)
        }
        exit.setOnClickListener {
            finish()
        }
        }

    }
