package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class LifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onStart() {
        super.onStart()    }

    override fun onResume() {
        super.onResume()    }

    override fun onPause() {
        super.onPause()    }

    override fun onStop() {
        super.onStop()    }

    override fun onDestroy() {
        super.onDestroy()    }
}