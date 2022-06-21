package com.example.myappinandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("List of Relatives")
        setContentView(R.layout.layout_lista)
        //setSupportActionBar(findViewById(R.id.toolbar2))

        val fab =findViewById<FloatingActionButton>(R.id.fabAdicionar)
        fab.setOnClickListener {
        val intent = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}

