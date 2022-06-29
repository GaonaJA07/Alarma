package com.example.alarm20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Definicion de las variables
    TextView txtEtii;
    Switch switchE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Declaracion de la variable
        txtEtii = (TextView) findViewById(R.id.etiSeleccion);
        switchE = (Switch) findViewById(R.id.idSwitch);
    }
    public void onclick(View view){
        if (view.getId()==R.id.idSwitch){
            //Es checar si esta activo la Opcion.
            if (switchE.isChecked()){
                txtEtii.setText("Fue activado");
            }else{
                txtEtii.setText("Fue desactivado");
            }
        }
    }
}