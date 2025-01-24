package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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

            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if(pesoStr == "" || alturaStr == "") {
                // Mostrar mensagem pro usuário

                Snackbar.make(
                    edtPeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()

            }else{
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)

                println("Herom ação do botão" + resultado)




            }
        }
    }
}