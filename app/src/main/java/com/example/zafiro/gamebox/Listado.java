package com.example.zafiro.gamebox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Listado extends AppCompatActivity {

    ListView lstJuegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        lstJuegos = (ListView)findViewById(R.id.lstJuegos);

    }
}
