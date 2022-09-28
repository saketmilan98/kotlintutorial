package org.geeksforgeeks.kotlintutorial

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {

    lateinit var enterName : EditText
    lateinit var submitBtn : Button
    lateinit var displayName : TextView
    var name : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterName =findViewById(R.id.editText)
        submitBtn =findViewById(R.id.button)
        displayName = findViewById(R.id.textView)

        submitBtn.setOnClickListener{
            name = enterName.text.toString()
            //displayName.setText("Hello $name, welcome to my first Kotlin app.")

            val intent : Intent = Intent(applicationContext, Main2Activity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)



        }
    }
}
