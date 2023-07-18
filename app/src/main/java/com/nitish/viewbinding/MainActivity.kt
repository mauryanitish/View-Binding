package com.nitish.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nitish.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.buttonValid?.setOnClickListener {
            if (binding?.etName?.text?.toString().isNullOrEmpty()){
                binding?.etName?.error="Enter your name"
            }
            else if (binding?.etAddress?.text?.toString().isNullOrEmpty()){
                binding?.etAddress?.error="Enter your Address"
            }
            else
                Toast.makeText(this,"validate",Toast.LENGTH_SHORT).show()
        }
    }
}