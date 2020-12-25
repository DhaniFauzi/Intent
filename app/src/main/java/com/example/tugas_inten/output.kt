package com.example.tugas_inten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_output.*

class output : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val nama = intent.getStringExtra("EXTRA_NAME")
        val umur = intent.getIntExtra("EXTRA_AGE", 0)
        val bdstudi = intent.getStringExtra("EXTRA_BDSTUDI")

        val hasil = "nama anda adalah $nama umur kamu $umur dan kamu berjurusan $bdstudi"
        Output.text = hasil
    }
}