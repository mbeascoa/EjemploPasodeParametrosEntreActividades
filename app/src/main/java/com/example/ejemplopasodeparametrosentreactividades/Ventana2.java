package com.example.ejemplopasodeparametrosentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.EditText;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity {

    private EditText registroUsuario;
    private TextView registroUsuario2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        this.registroUsuario = (EditText) findViewById(R.id.etxtRegistroUsuario); //  para el campo editText

        this.registroUsuario2 = (TextView) findViewById(R.id.textViewRegistroUsuario2);
        //Recogemos los parámetros enviados por el primer Activity  a través del método getExtras
        Bundle bundle=getIntent().getExtras();  //es una colección, es un map es una caracterísitca del framework
        String dato1=bundle.getString("nombre");
        String dato2=bundle.getString("apellido");
        String dato3=bundle.getString("fecha");
        this.registroUsuario2.setText(Html.fromHtml("<p><h3>Registro Usuario:</h3></p>" + dato1 + "<br/>" + dato2 + "<br/>" + dato3)
                , TextView.BufferType.SPANNABLE);  //SPANNABLE es para que lo cargue de golpe y no aparezca poco a poco

        this.registroUsuario.setText(Html.fromHtml("<p><h3>Registro Usuario:</h3></p>" + dato1 + "<br/>" + dato2 + "<br/>" + dato3),TextView.BufferType.SPANNABLE);  //SPANNABLE es para que lo cargue de golpe y no aparezca poco a poco
    }
}