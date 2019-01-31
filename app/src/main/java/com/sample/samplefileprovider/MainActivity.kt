package com.sample.samplefileprovider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e( "MainActivity", "Files Dir is $filesDir" )

        val imagePath = File(filesDir, "docs")
        if( !imagePath.exists() ) {
            imagePath.mkdir()
        }

        val file1 = File(imagePath, "1.txt")
        if( !file1.exists() ) {
            file1.createNewFile()
        }

        val file2 = File(imagePath, "2.txt")
        if( !file2.exists() ) {
            file2.createNewFile()
        }

        findViewById<View>(R.id.button).setOnClickListener {
            file2.delete()
        }
    }
}
