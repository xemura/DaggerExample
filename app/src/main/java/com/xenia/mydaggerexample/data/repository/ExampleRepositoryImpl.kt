package com.xenia.mydaggerexample.data.repository

import com.xenia.mydaggerexample.data.datasource.ExampleLocalDataSource
import com.xenia.mydaggerexample.data.datasource.ExampleRemoteDataSource
import com.xenia.mydaggerexample.data.mapper.ExampleMapper
import com.xenia.mydaggerexample.di.ProdQualifier
import com.xenia.mydaggerexample.di.TestQualifier
import com.xenia.mydaggerexample.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @ProdQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}