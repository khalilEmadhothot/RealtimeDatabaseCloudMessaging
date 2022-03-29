package com.example.realtimedatabasecloudmessaging

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.realtimedatabasecloudmessaging.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivityMainBinding
    private val database: DatabaseReference = FirebaseDatabase.getInstance().getReference().getRoot()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}