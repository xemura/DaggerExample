package com.xenia.mydaggerexample.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.xenia.mydaggerexample.di.ApplicationScope
import com.xenia.mydaggerexample.di.IdQualifier
import com.xenia.mydaggerexample.di.NameQualifier
import com.xenia.mydaggerexample.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String,
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this $id $name")
    }
}
