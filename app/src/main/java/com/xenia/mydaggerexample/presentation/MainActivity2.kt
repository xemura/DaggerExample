package com.xenia.mydaggerexample.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.xenia.mydaggerexample.di.ExampleApp
import com.xenia.mydaggerexample.R
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    // инъекция в полe
//    @Inject
//    lateinit var user: User
// через геттер (инъекция в конструкторы)
    //private val car = DaggerNewComponent.create().getCar()

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory().create("MY_ID_2", "MY_NAME_2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
        viewModel2.method()
    }
}