package com.vitali.scanovatetest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openCamera(v:View)
    {
        val intent = Intent(this, CameraActivity::class.java)
        startActivity(intent)
        //Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show()
    }
}
