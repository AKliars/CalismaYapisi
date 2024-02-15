package com.akliars.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akliars.calismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetay.setOnClickListener {
          //  binding.textViewAnasayfa.text = "Merhaba"
            val intent = Intent(this@MainActivity,DetaySayfa::class.java)
            intent.putExtra("mesaj","Merhaba")
            intent.putExtra("sayi",100)
            startActivity(intent)
        }

    }
}