package com.example.livedataexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val quoteLiveData = MutableLiveData("what your giving is what you get")

    fun updateQuote(){
        quoteLiveData.value = "Your Awesome"
    }

}