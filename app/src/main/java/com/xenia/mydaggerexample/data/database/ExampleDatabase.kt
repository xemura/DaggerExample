package com.xenia.mydaggerexample.data.database

import android.content.Context
import android.util.Log
import com.xenia.mydaggerexample.R
import com.xenia.mydaggerexample.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

// теперь даггер может создавать экземпляр базы данных
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeInMillis: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} $timeInMillis $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}