package com.xenia.mydaggerexample.di

import android.content.Context
import com.xenia.mydaggerexample.data.database.ExampleDatabase
import com.xenia.mydaggerexample.data.network.ExampleApiService
import com.xenia.mydaggerexample.presentation.ExampleViewModel
import com.xenia.mydaggerexample.presentation.MainActivity
import com.xenia.mydaggerexample.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentBuilder {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeInMillis: Long
        ): ApplicationComponent
    }

}