package com.example.mvvm_practice.application

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AndroidApp:Application() {
    companion object{
        lateinit var context: Context

    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}