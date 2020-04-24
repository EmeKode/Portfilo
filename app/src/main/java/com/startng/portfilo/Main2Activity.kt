package com.startng.portfilo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main2.*
import java.net.URL
import java.net.URLClassLoader
import java.net.URLConnection

class Main2Activity : AppCompatActivity() {
    lateinit var  b1: ImageButton
    lateinit var  b2: ImageButton
    lateinit var  b3: ImageButton
    lateinit var  b4: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        b1 = findViewById(R.id.googlebtn) as ImageButton
        b2 = findViewById(R.id.gitbtn) as ImageButton
        b3 = findViewById(R.id.linkbtn) as ImageButton
        b4 = findViewById(R.id.youtubebtn) as ImageButton
    }
    public fun process(v: View)
    {
        googlebtn.setOnClickListener {
            var intent: Intent = Intent(android.content.Intent.ACTION_WEB_SEARCH)
            var website = "www.google.com"
            var chooser: Intent = Intent.createChooser(intent, "Launch Browser")
            startActivity(intent)
        }
            gitbtn.setOnClickListener {
                var intent: android.content.Intent =
                    android.content.Intent(android.content.Intent.ACTION_WEB_SEARCH)
                var website = "www.github.com"
                var chooser: android.content.Intent = android.content.Intent.createChooser(intent, "Launch Browser")
                startActivity(intent)
            }
        linkbtn.setOnClickListener {
            var intent: android.content.Intent =
                android.content.Intent(android.content.Intent.ACTION_WEB_SEARCH)
            var website = "www.linkedIn.com"
            var chooser: android.content.Intent = android.content.Intent.createChooser(intent, "Launch Browser")
            startActivity(intent)
        }
        youtubebtn.setOnClickListener {
            var intent: android.content.Intent =
                android.content.Intent(android.content.Intent.ACTION_WEB_SEARCH)
            var website = "www.youtube.com"
            var chooser: android.content.Intent = android.content.Intent.createChooser(intent, "Launch Browser")
            startActivity(intent)
        }
    }

}


