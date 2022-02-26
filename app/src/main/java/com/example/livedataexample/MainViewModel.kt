package com.example.livedataexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {


    val factLiveData = MutableLiveData<String>("This is a Fact")

    fun updateLiveData(){
        factLiveData.value="This is Another Fact"
    }
}