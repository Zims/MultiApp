package com.insultablogs.choreapp.multiapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToDiceButton.setOnClickListener {
            var intent = Intent(this, dice::class.java)
            startActivity(intent)
        }

        goToMusicButton.setOnClickListener{
            var intent = Intent(this, music::class.java)
            startActivity(intent)
        }


    }
}
