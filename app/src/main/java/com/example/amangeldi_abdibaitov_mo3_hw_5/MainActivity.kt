package com.example.amangeldi_abdibaitov_mo3_hw_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.amangeldi_abdibaitov_mo3_hw_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.fl_first, FirstFragment()).commit()

    }
}