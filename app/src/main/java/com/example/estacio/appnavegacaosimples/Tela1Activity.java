package com.example.estacio.appnavegacaosimples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        inicializarBotoes();
    }

    private void inicializarBotoes(){
        Button btnTela2 = (Button) findViewById(R.id.button1);
        btnTela2.setOnClickListener(this);

        Button btnSair = (Button) findViewById(R.id.button2);
        btnSair.setOnClickListener(this);



    }


    //TODO: faze o envio nde dados para tela 2 .
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent i = new Intent(this, Tela2Activity.class);
                startActivity(i);
                break;
            case R.id.button2:
                finish();
                break;
        }
    }
}
