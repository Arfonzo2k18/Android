package com.example.zafiro.gamebox;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Listado extends AppCompatActivity {

    private ArrayList<String> juegos;
    private ArrayAdapter<String> adaptador;
    ListView lstJuegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        lstJuegos = (ListView)findViewById(R.id.lstJuegos);
        juegos = new ArrayList<String>();
        juegos.add("Fifa08");
        juegos.add("Fifa09");
        juegos.add("Fifa10");
        juegos.add("Fifa11");
        juegos.add("Fifa12");
        juegos.add("Fifa13");
        juegos.add("Fifa14");
        juegos.add("Fifa15");
        juegos.add("Fifa16");
        juegos.add("Fifa17");
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,juegos);
        lstJuegos.setAdapter(adaptador);

        lstJuegos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long id) {
                final int posicion = i;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(Listado.this);
                dialogo.setTitle("¡Atención!");
                dialogo.setMessage("¿Deseas eliminar este juego?");
                dialogo.setCancelable(false);
                dialogo.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        juegos.remove(posicion);
                        adaptador.notifyDataSetChanged();
                    }
                });
                dialogo.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
                dialogo.show();
                return false;
            }

        });

        }

    }
