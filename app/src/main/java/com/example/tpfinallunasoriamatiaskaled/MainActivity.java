package com.example.tpfinallunasoriamatiaskaled;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button botonprueba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonprueba = findViewById(R.id.botonprueba);
        botonprueba.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId()==botonprueba.getId())
        {
            Toast.makeText(getApplicationContext(), "HOLA ESTOY ANDANDO", Toast.LENGTH_LONG).show();
        }
    }
}
