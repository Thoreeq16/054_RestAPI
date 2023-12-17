package com.example.pertemuan11

import android.app.Application
import com.example.pertemuan11.repository.AppContainer
import com.example.pertemuan11.repository.KontakContainer

class KontakAplikation : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}