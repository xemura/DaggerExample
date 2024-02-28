package com.xenia.mydaggerexample.di

import com.xenia.mydaggerexample.data.repository.ExampleRepositoryImpl
import com.xenia.mydaggerexample.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun provideExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository
}