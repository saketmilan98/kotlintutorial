package org.geeksforgeeks.kotlintutorial

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView

class Main2Activity : Activity() {

    lateinit var displayName : TextView
    var name : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        displayName = findViewById(R.id.textView2)

        val intentObject : Intent = intent
        name= intentObject.getStringExtra("name")
        displayName.text = "Hey $name, you have successfully navigated to second activity."

    }
}
