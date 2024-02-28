package com.xenia.mydaggerexample.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.xenia.mydaggerexample.di.ApplicationScope
import com.xenia.mydaggerexample.di.IdQualifier
import com.xenia.mydaggerexample.di.NameQualifier
import com.xenia.mydaggerexample.domain.ExampleRepository
import com.xenia.mydaggerexample.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Singleton

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String,
) : ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel2", "$this $id $name")
    }
}
