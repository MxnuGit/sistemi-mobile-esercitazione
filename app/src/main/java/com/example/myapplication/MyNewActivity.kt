package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.fragments.CalendarFragment

class MyNewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_new)

        findViewById<Button>(R.id.btn2)
            .setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, CalendarFragment())
                    .commit()
            }
    }
}