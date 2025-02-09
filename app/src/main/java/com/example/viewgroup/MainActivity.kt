package com.example.viewgroup

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val futuramaImageView: ImageView = findViewById(R.id.futuramaImage)
        val helloTextView: TextView = findViewById(R.id.helloText)
        val helloButton: Button = findViewById(R.id.helloButton)

        futuramaImageView.setOnClickListener{
            val futuramaSayWoopWoopWoopText = getText(R.string.futurama_woop_woop_woop)
            if(helloTextView.text != futuramaSayWoopWoopWoopText){
                helloTextView.text = futuramaSayWoopWoopWoopText
            }
        }

        helloButton.setOnClickListener{
            val helloWorldText = getText(R.string.hello_world_text)
            if (helloTextView.text != helloWorldText){
                helloTextView.text = helloWorldText
            }
        }
    }
}