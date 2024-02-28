package com.xenia.mydaggerexample.data.datasource

import android.util.Log
import com.xenia.mydaggerexample.data.network.ExampleApiService
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        Log.d("TestRemoteDataSource", "test")
    }
}
