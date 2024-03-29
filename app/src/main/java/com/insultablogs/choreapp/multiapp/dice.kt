package com.insultablogs.choreapp.multiapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dice.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class dice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)


        var diceOne = image_leftDice
        var diceTwo = image_rightDice

        backButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var diceImg: Array<Int> = arrayOf(R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                R.drawable.dice4, R.drawable.dice5, R.drawable.dice6)


        rollButton.setOnClickListener {
            //Toast.makeText(this, "touched", Toast.LENGTH_SHORT).show()
            var  r = Random()
            var  n=r.nextInt(6)
            image_leftDice.setImageDrawable(application.getDrawable(diceImg[n]))
            var  r2 = Random()
            var  n2=r2.nextInt(6)
            image_rightDice.setImageDrawable(application.getDrawable(diceImg[n2]))

        }
    }
}
