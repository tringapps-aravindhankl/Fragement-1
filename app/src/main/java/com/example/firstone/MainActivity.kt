package com.example.firstone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1: Button =findViewById(R.id.button)
        var button2: Button= findViewById(R.id.button2)

        var firstFragement=FirstFragement();
        var secondFragment=SecondFragment();

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment,firstFragement)
            commit()
        }

        button1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment,firstFragement)
                commit()
            }
        }
        button2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment,secondFragment)
                commit()
            }
        }


    }
}