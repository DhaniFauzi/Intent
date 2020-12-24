package com.example.tugas_inten

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.register.*

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
    btnSubmit.setOnClickListener {
        val nama = nama.text.toString()
        val umur = umur.text.toString().toInt()
        val bdstudi = bdstudi.text.toString()
        Intent(this, output::class.java).also {
            it.putExtra("EXTRA_NAME", nama)
            it.putExtra("EXTRA_AGE", umur)
            it.putExtra("EXTRA_BDSTUDI", bdstudi)
            startActivity(it)
        }
    }
    }
}