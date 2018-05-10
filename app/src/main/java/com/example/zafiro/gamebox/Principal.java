package com.example.zafiro.gamebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;

public class Principal extends AppCompatActivity implements View.OnClickListener{

    ImageButton imbAyuda;
    ImageButton imbAñadir;
    ImageButton imbLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ArrayList<Juegos> category = new ArrayList<Juegos>();

        imbAyuda = (ImageButton)findViewById(R.id.imbAyuda);
        imbAñadir = (ImageButton)findViewById(R.id.imbAñadir);
        imbLista = (ImageButton)findViewById(R.id.imbLista);

        View viewimbAyuda = findViewById(R.id.imbAyuda);
        viewimbAyuda.setOnClickListener(this);

        View viewimbAñadir = findViewById(R.id.imbAñadir);
        viewimbAñadir.setOnClickListener(this);

        View viewimbLista = findViewById(R.id.imbLista);
        viewimbLista.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==findViewById(R.id.imbAyuda).getId()) {
            Intent Ayuda = new Intent(getApplicationContext(),Ayuda.class);
            startActivity(Ayuda);
        }
        else if(v.getId()==findViewById(R.id.imbLista).getId()) {
            Intent Listado = new Intent(getApplicationContext(),Listado.class);
            startActivity(Listado);
        }
    }
}
