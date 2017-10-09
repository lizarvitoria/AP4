package com.example.dm2.ap4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText dni, letra;
    private Button validar;
    private TextView resultado;
    private  String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dni = (EditText)findViewById(R.id.text1);
        letra = (EditText)findViewById(R.id.text2);
        validar = (Button)findViewById(R.id.btn1);
        resultado = (TextView)findViewById(R.id.lbl1);

        validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(letra.getText().toString().charAt(0)== letras.charAt(Integer.parseInt(dni.getText().toString())%23))
                    resultado.setText("El DNI es correcto");
                else
                    resultado.setText("El DNI no es correcto");

            }
        });
    }
}
