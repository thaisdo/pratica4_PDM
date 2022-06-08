package com.example.myappinandroid

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class MinhaAtividade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        println("onCreate executando")
        super.onCreate(savedInstanceState)
        setTitle("Minha Atividade")
    }
    override fun onStart() {
        super.onStart()
        println("onStart executado...")
    }

    override fun onResume() {
        super.onResume()
        println("onResume executado...")
    }

    override fun onPause() {
        super.onPause()
        println("onPause executado...")
    }

    override fun onStop() {
        super.onStop()
        println("onStop executado...")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart executado...")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy executado...")
    }
}