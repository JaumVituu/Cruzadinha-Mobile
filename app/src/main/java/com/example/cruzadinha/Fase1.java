package com.example.cruzadinha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.Debug;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Fase1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase1);
    }

    int qtdeErros = 0;

    public void Checar(View view){
        int qtdeAcertos = 0;


        //palavra 1 - Casa
        EditText resposta1 [] = {
                (EditText)findViewById(R.id.P1L1),
                (EditText)findViewById(R.id.P1L2),
                (EditText)findViewById(R.id.P1L3),
                (EditText)findViewById(R.id.P1L4)
        };
        String palavra1 = "casa";

        TextView Palavra1 = (TextView)findViewById(R.id.Palavra1);

        String resposta1Text[] = {
                resposta1[0].getText().toString(),
                resposta1[1].getText().toString(),
                resposta1[2].getText().toString(),
                resposta1[3].getText().toString()
                        };
        String resposta1Palavra = resposta1Text[0] + resposta1Text[1] + resposta1Text[2] + resposta1Text[3];
        if(palavra1.trim().toLowerCase(Locale.ROOT).equals(resposta1Palavra.trim().toLowerCase(Locale.ROOT))){
            Palavra1.setText("1 - Você Acertou!");
            Palavra1.setTextColor(Color.GREEN);
            qtdeAcertos +=1;

        }
        else{
            Palavra1.setTextColor(Color.RED);
            qtdeErros +=1;
        }

        //palavra 2 - Avião

        String palavra2 = "aviao";

        EditText resposta2[] = {
                (EditText)findViewById(R.id.P1L4),
                (EditText)findViewById(R.id.P2L2),
                (EditText)findViewById(R.id.P2L3),
                (EditText)findViewById(R.id.P2L4),
                (EditText)findViewById(R.id.P2L5)
        };

        TextView Palavra2 = (TextView)findViewById(R.id.Palavra2);
        String resposta2Text[] = {
                resposta2[0].getText().toString(),
                resposta2[1].getText().toString(),
                resposta2[2].getText().toString(),
                resposta2[3].getText().toString(),
                resposta2[4].getText().toString(),
        };
        String resposta2Palavra = resposta2Text[0] + resposta2Text [1] + resposta2Text [2] + resposta2Text [3] + resposta2Text [4];

        if(palavra2.trim().toLowerCase(Locale.ROOT).equals(resposta2Palavra.trim().toLowerCase(Locale.ROOT))){
            Palavra2.setText("2 - Você Acertou!");
            Palavra2.setTextColor(Color.GREEN);
            qtdeAcertos += 1;
        }
        else{
            Palavra2.setTextColor(Color.RED);
            qtdeErros +=1;
        }

        if(qtdeAcertos == 2){
            Intent Fase2 = new Intent(this, Fase2.class);
            Fase2.putExtra("AMOUNT_LOSES",qtdeErros);
            startActivity(Fase2);
        }
    }
}