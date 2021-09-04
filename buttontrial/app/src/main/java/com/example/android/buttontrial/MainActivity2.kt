package com.example.android.buttontrial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val actionBar = supportActionBar

        actionBar !!.title = "Second Activity"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}