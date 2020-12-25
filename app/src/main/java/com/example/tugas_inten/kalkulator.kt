package com.example.tugas_inten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_kalkulator.*

class kalkulator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        val txtNumber1 = findViewById<EditText>(R.id.txtNumber1)
        val txtNumber2 = findViewById<EditText>(R.id.txtNumber2)
        val txtHasil = findViewById<EditText>(R.id.txtHasil)

        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKurang = findViewById<Button>(R.id.btnKurangi)
        val btnKali = findViewById<Button>(R.id.btnKali)
        val btnBagi = findViewById<Button>(R.id.btnBagi)

        btnTambah.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi")
            } else {
                val nilai1 = txtNumber1.text.toString().toDouble()
                val nilai2 = txtNumber2.text.toString().toDouble()
                val hasil = this.tambah(nilai1, nilai2)
                txtHasil.setText(hasil.toString())
            }
        }

        btnKurang.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi")
            } else {
                val nilai1 = txtNumber1.text.toString().toDouble()
                val nilai2 = txtNumber2.text.toString().toDouble()
                val hasil = this.kurang(nilai1, nilai2)
                txtHasil.setText(hasil.toString())
            }
        }

        btnKali.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi")
            } else {
                val nilai1 = txtNumber1.text.toString().toDouble()
                val nilai2 = txtNumber2.text.toString().toDouble()
                val hasil = this.kali(nilai1, nilai2)
                txtHasil.setText(hasil.toString())
            }
        }

        btnBagi.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi")
            } else {
                val nilai1 = txtNumber1.text.toString().toDouble()
                val nilai2 = txtNumber2.text.toString().toDouble()
                val hasil = this.bagi(nilai1, nilai2)
                txtHasil.setText(hasil.toString())
            }
        }
    }
        fun tambah(a: Double, b: Double): Double {
            return a + b
        }

        fun kurang(a: Double, b: Double): Double {
            return a - b
        }
        fun kali(a: Double, b: Double): Double {
            return a * b
        }
        fun bagi(a: Double, b: Double): Double {
        return a / b
    }
    }
