package com.akliars.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akliars.calismayapisi.databinding.ActivityDetaySayfaBinding

class DetaySayfa : AppCompatActivity() {
    private lateinit var binding: ActivityDetaySayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetaySayfaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gelenMesaj = intent.getStringExtra("mesaj")
        val gelenSayi = intent.getIntExtra("sayi",0)

        binding.textViewDetay.text = "$gelenMesaj - $gelenSayi"
    }
}