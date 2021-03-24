package com.example.tugas_inten

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_output.*

class output : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val namahasil = intent.getStringExtra("Nama")
        val umurhasil = intent.getIntExtra("Umur", 0)
        val bdstudihasil = intent.getStringExtra("Studi")

        val hasil1 = "nama anda adalah $namahasil"
        val hasil2 = "umur anda adalah $umurhasil"
        val hasil3 = "bidang studi anda adalah $bdstudihasil"
        Output.text = hasil1
        Output2.text = hasil2
        Output3.text = hasil3
    }
}