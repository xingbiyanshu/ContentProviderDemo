package com.example.contentproviderdemo

import android.app.Application
import android.content.Context

class MyApp: Application() {

    override fun attachBaseContext(base: Context?) {
        println("MyApp#attachBaseContext")
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        println("MyApp#onCreate")
        super.onCreate()
    }
}