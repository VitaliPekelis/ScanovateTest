package com.vitali.scanovatetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvVersion.text = "Version Code: ${BuildConfig.VERSION_CODE}" +
                "Version Name: ${BuildConfig.VERSION_NAME}" +
                "Flavor: ${BuildConfig.FLAVOR}" +
                "BuildType ${BuildConfig.BUILD_TYPE}"
    }

    fun openCamera(v:View) {
        val intent = Intent(this, CameraActivity::class.java)
        startActivity(intent)
    }
}
