package com.example.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var number: TextView
    lateinit var btn: Button
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        number = findViewById(R.id.TvId)
        btn = findViewById(R.id.cId)



        mainViewModel.factLiveData.observe(this, Observer {
            number.text=it
        })

        btn.setOnClickListener {
            mainViewModel.updateLiveData()
        }
    }
}
