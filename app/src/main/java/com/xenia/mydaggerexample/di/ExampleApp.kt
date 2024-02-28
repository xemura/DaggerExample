package com.xenia.mydaggerexample.di

import android.app.Application

class ExampleApp: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(
                this,
                System.currentTimeMillis()
            )
    }
}