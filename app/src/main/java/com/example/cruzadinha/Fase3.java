package com.example.cruzadinha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Fase3 extends AppCompatActivity {

    int qtdeErros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase3);
        qtdeErros = getIntent().getIntExtra("AMOUNT_LOSES", 0);
    }

    int qtdeAcertos = 0;

    public void Checar(View view){
        EditText resposta6 [] = {
                (EditText)findViewById(R.id.p6L1),
                (EditText)findViewById(R.id.p6L2),
                (EditText)findViewById(R.id.p6L3),
                (EditText)findViewById(R.id.p6L4),
                (EditText)findViewById(R.id.p6L5),
                (EditText)findViewById(R.id.p6L6),
                (EditText)findViewById(R.id.p6L7),
        };
        String palavra6 = "Hussein";

        TextView Palavra6 = (TextView)findViewById(R.id.Palavra6);

        String resposta6Text[] = {
                resposta6[0].getText().toString(),
                resposta6[1].getText().toString(),
                resposta6[2].getText().toString(),
                resposta6[3].getText().toString(),
                resposta6[4].getText().toString(),
                resposta6[5].getText().toString(),
                resposta6[6].getText().toString(),
        };
        String resposta6Palavra = resposta6Text[0] + resposta6Text[1] + resposta6Text[2] + resposta6Text[3] + resposta6Text[4] + resposta6Text[5] + resposta6Text[6];
        if(palavra6.trim().toLowerCase(Locale.ROOT).equals(resposta6Palavra.trim().toLowerCase(Locale.ROOT))){
            Palavra6.setText("5 - Você Acertou!");
            Palavra6.setTextColor(Color.GREEN);
            Intent fimJogo = new Intent(this, FimJogo.class);
            fimJogo.putExtra("AMOUNT_ERRORS", qtdeErros);
            startActivity(fimJogo);
        }
        else{
            Palavra6.setTextColor(Color.RED);
            qtdeErros +=1;
        }
    }
}