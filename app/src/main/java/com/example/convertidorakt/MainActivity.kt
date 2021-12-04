package com.example.convertidorakt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.view.View
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun convertCurrency(view: View?) {
        val cantidad_pesos = findViewById<EditText>(R.id.cantidad_pesos)
        val cambio = "0.00116"
        val mostrar = findViewById<TextView>(R.id.mostrar)
        if (cantidad_pesos.text.toString() != "") {
            val valorEuro = cantidad_pesos.text.toString().toFloat() * cambio.toFloat()
            mostrar.text = valorEuro.toString() + ""
        } else {
            mostrar.text = "Sin Valor"
        }
    }
}