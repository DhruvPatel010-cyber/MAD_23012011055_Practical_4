package com.example.mad_23012011055_practical_4



import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textCurrentTime: TextView = findViewById(R.id.textCurrentTime)


        val sdf = SimpleDateFormat("hh:mm:ss a MMM,d yyyy", Locale.getDefault())
        val currentTime = sdf.format(Date())
        textCurrentTime.text = currentTime
    }
}