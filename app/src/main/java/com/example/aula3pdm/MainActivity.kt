package com.example.aula3pdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Tipo d ebinding 1 - findViewById

        val editValor1: EditText = findViewById(R.id.editValor1)
        val editValor2: EditText = findViewById(R.id.editValor2)
        val buttonSomar: Button = findViewById(R.id.buttonSomar)

        buttonSomar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 + valor2

            showDialog( "A soma é " + resultado)
        }

        val buttonMultiplicar: Button = findViewById(R.id.buttonMultiplicar)


        buttonMultiplicar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 * valor2

            showDialog( "A multiplicacao é " + resultado)
        }

        val buttonDivisao: Button = findViewById(R.id.buttonDivisao)


        buttonDivisao.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 / valor2

            showDialog( "A divisao é " + resultado)
        }

        val buttonSubtrair: Button = findViewById(R.id.buttonSubtrair)


        buttonSubtrair.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 - valor2

            showDialog( "A subtracao é " + resultado)
        }
    }

    fun showDialog(msg: String) {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(msg)
        builder.setPositiveButton("OK", null)
        val dialog = builder.create()
        dialog.show()
    }
}