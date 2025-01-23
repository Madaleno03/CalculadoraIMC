package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            // Recuperar os componetente EditText que estão dentro da XML (activity_main.xml)
            // Ciar uma variável e associar (=) o componente de UI (EditText)

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

            // Recuperar o botão da tela
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)

            //Colocar ação no botão setOnClickListener
        btn_calcular.setOnClickListener {
            //Recuperar o texto digitado no EditPeso e no EditAltura
            val peso = edtPeso.text
            val altura = edtAltura.text
            println("Herom ação do botão" + altura)
        }

    }
}