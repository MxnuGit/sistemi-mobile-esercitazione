package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnActivityMain)
            .setOnClickListener {
                Log.d("btnActivityMain", "Cambiato Activity")

                val myIntent = Intent(this, MyNewActivity::class.java)
                startActivity(myIntent)
            }

        findViewById<Button>(R.id.toActivity2)
            .setOnClickListener {
                val intent = Intent(this, Activity2::class.java)
                startActivity(intent)
            }
    }
}