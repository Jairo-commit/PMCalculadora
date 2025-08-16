package com.jairomejia.calculadorajava;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextValorA, editTextValorB;
    EditText editTextResultadoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextValorA = findViewById(R.id.editTextTituloValorA);
        editTextValorB = findViewById(R.id.editTextTituloValorB);
        editTextResultadoC = findViewById(R.id.editTextTituloResultado);

        Button btnSuma = findViewById(R.id.buttonSumar);
        Button btnResta = findViewById(R.id.buttonRestar);
        Button btnMultiplicacion = findViewById(R.id.buttonMultiplicar);
        Button btnDivision = findViewById(R.id.buttonDividir);

        btnSuma.setOnClickListener(v -> suma());
        btnResta.setOnClickListener(v -> resta());
        btnMultiplicacion.setOnClickListener(v -> multiplicacion());
        btnDivision.setOnClickListener(v -> division());

    }
    private void suma()
    {
        try {
            String stringValorA = editTextValorA.getText().toString();
            String stringValorB = editTextValorB.getText().toString();

            if (stringValorA.isEmpty() || stringValorB.isEmpty())
            {
                Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show();
            }
            else {
                double doubleValorA = Double.parseDouble(stringValorA);
                double doubleValorb = Double.parseDouble(stringValorB);
                double doubleResultadoC = 0;

                doubleResultadoC = doubleValorA + doubleValorb;

                editTextResultadoC.setText(" = " + doubleResultadoC);
            }

        } catch (NumberFormatException exception){
            Toast.makeText(this, "Error: "+ exception, Toast.LENGTH_SHORT).show();
        }
    }

    private void resta()
    {
        try {
            String stringValorA = editTextValorA.getText().toString();
            String stringValorB = editTextValorB.getText().toString();

            if (stringValorA.isEmpty() || stringValorB.isEmpty())
            {
                Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show();
            }
            else {
                double doubleValorA = Double.parseDouble(stringValorA);
                double doubleValorb = Double.parseDouble(stringValorB);
                double doubleResultadoC = 0;

                doubleResultadoC = doubleValorA - doubleValorb;

                editTextResultadoC.setText(" = " + doubleResultadoC);
            }

        } catch (NumberFormatException exception){
            Toast.makeText(this, "Error: "+ exception, Toast.LENGTH_SHORT).show();
        }
    }
    
    private void multiplicacion()
    {
        try {
            String stringValorA = editTextValorA.getText().toString();
            String stringValorB = editTextValorB.getText().toString();

            if (stringValorA.isEmpty() || stringValorB.isEmpty())
            {
                Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show();
            }
            else {
                double doubleValorA = Double.parseDouble(stringValorA);
                double doubleValorb = Double.parseDouble(stringValorB);
                double doubleResultadoC = 0;

                doubleResultadoC = doubleValorA * doubleValorb;

                editTextResultadoC.setText(" = " + doubleResultadoC);
            }

        } catch (NumberFormatException exception){
            Toast.makeText(this, "Error: "+ exception, Toast.LENGTH_SHORT).show();
        }
    }
    private void division()
    {
        try {
            String stringValorA = editTextValorA.getText().toString();
            String stringValorB = editTextValorB.getText().toString();

            if (stringValorA.isEmpty() || stringValorB.isEmpty())
            {
                Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show();
            } else if (stringValorB.equals("0")) {
                Toast.makeText(this, "No se puede dividir por 0", Toast.LENGTH_SHORT).show();
            } else {
                double doubleValorA = Double.parseDouble(stringValorA);
                double doubleValorb = Double.parseDouble(stringValorB);
                double doubleResultadoC = 0;

                doubleResultadoC = doubleValorA / doubleValorb;

                editTextResultadoC.setText(" = " + doubleResultadoC);
            }

        } catch (NumberFormatException exception){
            Toast.makeText(this, "Error: "+ exception, Toast.LENGTH_SHORT).show();
        }
    }
}