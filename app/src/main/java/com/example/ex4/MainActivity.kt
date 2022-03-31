package com.example.ex4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override  fun onResume(){
        super.onResume()
        Log.i("------>","onResume executado")
    }

    override fun onStart(){
        super.onStart()
        Log.i("------>","onStart executado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("------>","onDestroy executado")
    }
}