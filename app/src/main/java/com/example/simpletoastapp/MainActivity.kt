package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById(R.id.click) as Button
        btn.setOnClickListener {
            Toast.makeText(this, "Successfully submitted data", Toast.LENGTH_LONG).show()
        }
    }
}
