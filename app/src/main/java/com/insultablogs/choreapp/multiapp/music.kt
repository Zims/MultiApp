package com.insultablogs.choreapp.multiapp

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.insultablogs.choreapp.multiapp.R.id.c_key

class music : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)
        val cButton = findViewById(R.id.c_key) as Button
        val dButton = findViewById(R.id.d_key) as Button
        val eButton = findViewById(R.id.e_key) as Button
        val fButton = findViewById(R.id.f_key) as Button
        val gButton = findViewById(R.id.g_key) as Button
        val aButton = findViewById(R.id.a_key) as Button
        val bButton = findViewById(R.id.b_key) as Button


        cButton.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.note1_c)
            mp.start()
        }
        dButton.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.note2_d)
            mp.start()
        }
        eButton.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.note3_e)
            mp.start()
        }

        fButton.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.note4_f)
            mp.start()
        }
        gButton.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.note5_g)
            mp.start()
        }
        aButton.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.note6_a)
            mp.start()
        }
        bButton.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.note7_b)
            mp.start()
        }

    }
}
