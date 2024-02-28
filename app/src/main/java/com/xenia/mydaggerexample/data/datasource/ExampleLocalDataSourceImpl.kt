package com.xenia.mydaggerexample.data.datasource

import com.xenia.mydaggerexample.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
): ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
