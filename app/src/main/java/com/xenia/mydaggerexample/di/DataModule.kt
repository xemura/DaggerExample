package com.xenia.mydaggerexample.di

import com.xenia.mydaggerexample.data.datasource.ExampleLocalDataSource
import com.xenia.mydaggerexample.data.datasource.ExampleLocalDataSourceImpl
import com.xenia.mydaggerexample.data.datasource.ExampleRemoteDataSource
import com.xenia.mydaggerexample.data.datasource.ExampleRemoteDataSourceImpl
import com.xenia.mydaggerexample.data.datasource.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @Binds
    @ApplicationScope
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @Binds
    @ApplicationScope
    fun bindExampleRemoteDataSourceTest(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource

}