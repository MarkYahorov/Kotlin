package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

internal class MainActivity : LifecycleActivity() {

    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d("1", "CREATE")
    }

    override fun onStart() {
        super.onStart()
        handleClicks()

        Log.d("1", "START")
    }

    private fun handleClicks() {
        button = findViewById<Button>(R.id.button1)
        button?.setOnClickListener {
            val editText = findViewById<EditText>(R.id.editText)
            val text = editText.text.toString()
            startActivity(MainActivity2.getStartIntent(this, text))
        }
        val imageView = findViewById<View>(R.id.imageView)
        imageView.setOnClickListener {
            startActivity(Intent(Intent.ACTION_SEND))
        }



        var a = 2
        var func = if (a == 2) a.toString() else null

        val b = func?.let {
            it.toString()
        }
    }

    fun getText() = "str"

    override fun onResume() {
        super.onResume()
        Log.d("1", "RESUME")
    }

    override fun onPause() {
        super.onPause()

        Log.d("1", "PAUSE")
    }

    override fun onStop() {
        super.onStop()

        Log.d("1", "STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("1", "DESTROY")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("1", "RESTART")
    }
}
