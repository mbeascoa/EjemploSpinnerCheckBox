package com.example.ejemplospinnercheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private Spinner spColor;
    private CheckBox chkTexto, chkFondo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.txtTextView1);
        spColor = (Spinner) findViewById(R.id.spnSpinner1);
        //Array de String para volcar sobre el Spinner
       String []opciones={"Azul","Verde"};
        // Podemos decidir el tipo de lista que mostraremos en el primer
        // argumento del constructor de la clase ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);

        //  android.R.layout.simple_spinner_item  este es el spinner más básico se carga simplemente texto.
        // hay otros spinner que cargan textos y checkbox
        // spinner que son como maestro detalle,
        // hay 12 tipos de spinner


        // Asociar el ArrayAdapter al Spinner
        spColor.setAdapter(adapter);
        chkTexto=(CheckBox)findViewById(R.id.chbCheckBox1);
        chkFondo=(CheckBox)findViewById(R.id.chbCheckBox2);

    }

    public void mostrarColor(View view) {
        String dato=spColor.getSelectedItem().toString();

        if (chkTexto.isChecked()==true && dato.equals("Azul") ) {
            tv1.setTextColor(Color.BLUE);
        }
        if (chkTexto.isChecked()==true && dato.equals("Verde") ) {
            tv1.setTextColor(Color.GREEN);
        }
        if (chkFondo.isChecked()==true && dato.equals("Azul") ) {
            tv1.setBackgroundColor(Color.BLUE);
        }
        if (chkFondo.isChecked()==true && dato.equals("Verde") ) {
            tv1.setBackgroundColor(Color.GREEN);
        }


    }
}