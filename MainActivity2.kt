package com.example.myapplication2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {

    private var petClean = 100
    private var petHunger = 50
    private var petHappy = 50

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Get the button and text views
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnHappy = findViewById<Button>(R.id.btnHappy)
        val txtHunger = findViewById<EditText>(R.id.txtHunger)
        val txtClean = findViewById<EditText>(R.id.txtClean)
        val txtHappy = findViewById<EditText>(R.id.txtHappy)
        val petImage = findViewById<ImageView>(R.id.petImage)

        // Set the initial text values
        txtHunger.setText(petHunger.toString())
        txtClean.setText(petClean.toString())
        txtHappy.setText(petHappy.toString())

        // Handle button clicks
        btnFeed.setOnClickListener {
            petHunger -= 10
            petClean += 10
            petHappy += 5
            txtHunger.setText(petHunger.toString())
            animateImageChange(petImage, R.drawable.eat_eating_icon)
        }

        btnClean.setOnClickListener {
            petClean += 10
            petHappy += 10

            txtClean.setText(petClean.toString())
            animateImageChange(petImage, R.drawable.dog_cleaning_icon)
        }

        btnHappy.setOnClickListener {
            petHappy += 10
            petHunger += 5
            petClean -= 5
            txtHappy.setText(petHappy.toString())
            animateImageChange(petImage, R.drawable.happy_dog_icon)
        }
    }

    private fun animateImageChange(imageView: ImageView, newImageResource: Int) {
        val animation = AlphaAnimation(0.0f, 1.0f)
        animation.duration = 500
        animation.fillAfter = true
        imageView.startAnimation(animation)
        imageView.setImageResource(newImageResource)
    }
}












