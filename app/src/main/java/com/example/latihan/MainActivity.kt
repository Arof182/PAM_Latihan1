package com.example.latihan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the counter display
        counter_text_view.text = counter.toString()

        // Set onClickListeners for the buttons
        increment_button.setOnClickListener {
            counter++
            counter_text_view.text = counter.toString()
        }

        decrement_button.setOnClickListener {
            counter--
            counter_text_view.text = counter.toString()
        }
    }
}
