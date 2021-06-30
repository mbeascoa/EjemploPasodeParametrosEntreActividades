package com.example.ejemplopasodeparametrosentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtnombre,txtapellidos,txtfecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtnombre = (EditText)findViewById(R.id.txtNombre);
        this.txtapellidos = (EditText)findViewById(R.id.txtApellido);
        this.txtfecha = (EditText)findViewById(R.id.txtFecha);


    }

    public void mostrarDatos(View view) {
        Intent i = new Intent(this, Ventana2.class );
        // Añadimos tres parámetros con el método putExtra

        i.putExtra("nombre", this.txtnombre.getText().toString());
        i.putExtra("apellido", this.txtapellidos.getText().toString());
        i.putExtra("fecha", this.txtfecha.getText().toString());

        startActivity(i);
    }
}