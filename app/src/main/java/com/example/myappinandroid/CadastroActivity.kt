package com.example.myappinandroid

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Novo Contatinho")
        setContentView(R.layout.layout_cadastro)
        setSupportActionBar(findViewById(R.id.toolbar3))

        val botaoSalvar = findViewById<Button>(R.id.button3)
        botaoSalvar.setOnClickListener {
            finish()
        }
            val botaoCancelar = findViewById<Button>(R.id.button2)
            botaoCancelar.setOnClickListener{
                finish()
        }
    }
}
