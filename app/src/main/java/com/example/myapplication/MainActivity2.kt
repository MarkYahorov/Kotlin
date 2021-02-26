package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : LifecycleActivity() {

    companion object {
        val EXTRA_TEXT = "ExtraText"

        fun getStartIntent(context: Context, text: String): Intent {
            val intent = Intent(context, MainActivity2::class.java)
            intent.putExtra(EXTRA_TEXT, text)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("2", "CREATE")
        setContentView(R.layout.activity_main2)
        findViewById<TextView>(R.id.textView2).text =
            intent.getStringExtra(EXTRA_TEXT)
    }

    override fun onStart() {
        super.onStart()

        Log.d("2", "START")
    }

    override fun onResume() {
        super.onResume()
        Log.d("2", "RESUME")
    }

    override fun onPause() {
        super.onPause()

        Log.d("2", "PAUSE")
    }

    override fun onStop() {
        super.onStop()

        Log.d("2", "STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("2", "DESTROY")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("2", "RESTART")
    }
}