package com.rasel.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHello.setOnClickListener {
            val textValue: String = edit_input.text.toString()

            val intent = Intent(this, SecondActivity::class.java);

            intent.putExtra("rasel", textValue);

            startActivity(intent);
        }
    }
}
