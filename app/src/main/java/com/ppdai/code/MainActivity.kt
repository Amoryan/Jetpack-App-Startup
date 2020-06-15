package com.ppdai.code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.startup.AppInitializer
import com.ppdai.code.jetpack.startup.LibraryA
import com.ppdai.code.jetpack.startup.LibraryB
import com.ppdai.code.jetpack.startup.LibraryC
import com.ppdai.code.jetpack.startup.initializer.LibraryAInitializer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LibraryA.instance.test()
        LibraryB.instance.test()
        LibraryC.instance.test()

        AppInitializer.getInstance(this).initializeComponent(LibraryAInitializer::class.java)
    }
}