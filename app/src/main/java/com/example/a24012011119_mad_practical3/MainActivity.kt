package com.example.a24012011119_mad_practical3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main))
        { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        implicitIntent()
        explicitIntent()
    }
    fun implicitIntent() {
        findViewById<Button>(R.id.btn_Browse).setOnClickListener {
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse(findViewById<EditText>(R.id.etWebUrl).text.toString())
            ).also { startActivity(it) }
        }

        findViewById<Button>(R.id.btn_Call).setOnClickListener {
            val number =findViewById<EditText>(R.id.etPhone).text.toString()
            val intent= Intent(Intent.ACTION_DIAL)
            intent.setData("tel:$number".toUri())
            startActivity(intent)

        }
        // Call Log
        findViewById<Button>(R.id.btn_CallLog).setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW)

            intent.data =
                Uri.parse("content://call_log/calls")

            startActivity(intent)
        }


        // Gallery
        findViewById<Button>(R.id.btn_Gallery).setOnClickListener {

            val intent = Intent(Intent.ACTION_PICK)

            intent.type = "image/*"

            startActivity(intent)
        }
        // Camera
        findViewById<Button>(R.id.btn_Camera).setOnClickListener {

            val intent = Intent(
                "android.media.action.IMAGE_CAPTURE"
            )

            startActivity(intent)
        }
    }
    fun explicitIntent()
    {


            findViewById<Button>(R.id.btn_Login).setOnClickListener {

                val intent = Intent(
                    this,
                    LoginActivity::class.java
                )

                startActivity(intent)
            }


    }
}