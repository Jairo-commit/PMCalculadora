package com.jairomejia.calculadorakotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var editTextValorA: EditText? = null
    var editTextValorB: EditText? = null
    var editTextResultadoC: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        editTextValorA = findViewById<EditText?>(R.id.editTextTituloValorA)
        editTextValorB = findViewById<EditText?>(R.id.editTextTituloValorB)
        editTextResultadoC = findViewById<EditText?>(R.id.editTextTituloResultado)

        val btnSuma = findViewById<Button?>(R.id.buttonSumar)
        val btnResta = findViewById<Button?>(R.id.buttonRestar)
        val btnMultiplicacion = findViewById<Button?>(R.id.buttonMultiplicar)
        val btnDivision = findViewById<Button?>(R.id.buttonDividir)

        btnSuma.setOnClickListener(View.OnClickListener { v: View? -> suma() })
        btnResta.setOnClickListener(View.OnClickListener { v: View? -> resta() })
        btnMultiplicacion.setOnClickListener(View.OnClickListener { v: View? -> multiplicacion() })
        btnDivision.setOnClickListener(View.OnClickListener { v: View? -> division() })
    }
    private fun suma() {
        try {
            val stringValorA = editTextValorA!!.getText().toString()
            val stringValorB = editTextValorB!!.getText().toString()

            if (stringValorA.isEmpty() || stringValorB.isEmpty()) {
                Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show()
            } else {
                val doubleValorA = stringValorA.toDouble()
                val doubleValorb = stringValorB.toDouble()
                var doubleResultadoC = 0.0

                doubleResultadoC = doubleValorA + doubleValorb

                editTextResultadoC!!.setText(" = " + doubleResultadoC)
            }
        } catch (exception: NumberFormatException) {
            Toast.makeText(this, "Error: " + exception, Toast.LENGTH_SHORT).show()
        }
    }

    private fun resta() {
        try {
            val stringValorA = editTextValorA!!.getText().toString()
            val stringValorB = editTextValorB!!.getText().toString()

            if (stringValorA.isEmpty() || stringValorB.isEmpty()) {
                Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show()
            } else {
                val doubleValorA = stringValorA.toDouble()
                val doubleValorb = stringValorB.toDouble()
                var doubleResultadoC = 0.0

                doubleResultadoC = doubleValorA - doubleValorb

                editTextResultadoC!!.setText(" = " + doubleResultadoC)
            }
        } catch (exception: NumberFormatException) {
            Toast.makeText(this, "Error: " + exception, Toast.LENGTH_SHORT).show()
        }
    }

    private fun multiplicacion() {
        try {
            val stringValorA = editTextValorA!!.getText().toString()
            val stringValorB = editTextValorB!!.getText().toString()

            if (stringValorA.isEmpty() || stringValorB.isEmpty()) {
                Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show()
            } else {
                val doubleValorA = stringValorA.toDouble()
                val doubleValorb = stringValorB.toDouble()
                var doubleResultadoC = 0.0

                doubleResultadoC = doubleValorA * doubleValorb

                editTextResultadoC!!.setText(" = " + doubleResultadoC)
            }
        } catch (exception: NumberFormatException) {
            Toast.makeText(this, "Error: " + exception, Toast.LENGTH_SHORT).show()
        }
    }

    private fun division() {
        try {
            val stringValorA = editTextValorA!!.getText().toString()
            val stringValorB = editTextValorB!!.getText().toString()

            if (stringValorA.isEmpty() || stringValorB.isEmpty()) {
                Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show()
            } else if (stringValorB == "0") {
                Toast.makeText(this, "No se puede dividir por 0", Toast.LENGTH_SHORT).show()
            } else {
                val doubleValorA = stringValorA.toDouble()
                val doubleValorb = stringValorB.toDouble()
                var doubleResultadoC = 0.0

                doubleResultadoC = doubleValorA / doubleValorb

                editTextResultadoC!!.setText(" = " + doubleResultadoC)
            }
        } catch (exception: NumberFormatException) {
            Toast.makeText(this, "Error: " + exception, Toast.LENGTH_SHORT).show()
        }
    }

}