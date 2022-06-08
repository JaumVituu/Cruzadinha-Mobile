package com.example.cruzadinha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Fase2 extends AppCompatActivity {

    int qtdeErros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase2);
        qtdeErros = getIntent().getIntExtra("AMOUNT_LOSES", 0);
    }

    int qtdeAcertos = 0;

    public void Checar(View view){
        int qtdeAcertos = 0;

        //Palavra 3 - paralelepipedo

        EditText resposta3 [] = {
                (EditText)findViewById(R.id.p3L1),
                (EditText)findViewById(R.id.p3L2),
                (EditText)findViewById(R.id.p3L3),
                (EditText)findViewById(R.id.p3L4),
                (EditText)findViewById(R.id.p3L5),
                (EditText)findViewById(R.id.p3L6),
                (EditText)findViewById(R.id.p3L7),
                (EditText)findViewById(R.id.p3L8),
                (EditText)findViewById(R.id.p3L9),
                (EditText)findViewById(R.id.p3L10),
                (EditText)findViewById(R.id.p3L11),
                (EditText)findViewById(R.id.p3L12),
                (EditText)findViewById(R.id.p3L13),
                (EditText)findViewById(R.id.p3L14)
        };
        String palavra3 = "Paralelepipedo";

        TextView Palavra3 = (TextView)findViewById(R.id.Palavra3);

        String resposta3Text[] = {
                resposta3[0].getText().toString(),
                resposta3[1].getText().toString(),
                resposta3[2].getText().toString(),
                resposta3[3].getText().toString(),
                resposta3[4].getText().toString(),
                resposta3[5].getText().toString(),
                resposta3[6].getText().toString(),
                resposta3[7].getText().toString(),
                resposta3[8].getText().toString(),
                resposta3[9].getText().toString(),
                resposta3[10].getText().toString(),
                resposta3[11].getText().toString(),
                resposta3[12].getText().toString(),
                resposta3[13].getText().toString()
        };
        String resposta3Palavra = resposta3Text[0] + resposta3Text[1] + resposta3Text[2] + resposta3Text[3] +  resposta3Text[4] + resposta3Text[5] + resposta3Text[6] + resposta3Text[7] +  resposta3Text[8] + resposta3Text[9] + resposta3Text[10] + resposta3Text[11] + resposta3Text[12] + resposta3Text[13];
        if(palavra3.trim().toLowerCase(Locale.ROOT).equals(resposta3Palavra.trim().toLowerCase(Locale.ROOT))){
            Palavra3.setText("3 - Você Acertou!");
            Palavra3.setTextColor(Color.GREEN);
            qtdeAcertos +=1;
        }
        else{
            Palavra3.setTextColor(Color.RED);
            qtdeErros +=1;
        }

        //Palavra 4 - Rato

        EditText resposta4 [] = {
                (EditText)findViewById(R.id.p3L3),
                (EditText)findViewById(R.id.p4L2),
                (EditText)findViewById(R.id.p4L3),
                (EditText)findViewById(R.id.p4L4),
        };
        String palavra4 = "Rato";

        TextView Palavra4 = (TextView)findViewById(R.id.Palavra4);

        String resposta4Text[] = {
                resposta4[0].getText().toString(),
                resposta4[1].getText().toString(),
                resposta4[2].getText().toString(),
                resposta4[3].getText().toString()
        };
        String resposta4Palavra = resposta4Text[0] + resposta4Text[1] + resposta4Text[2] + resposta4Text[3];
        if(palavra4.trim().toLowerCase(Locale.ROOT).equals(resposta4Palavra.trim().toLowerCase(Locale.ROOT))){
            Palavra4.setText("4 - Você Acertou!");
            Palavra4.setTextColor(Color.GREEN);
            qtdeAcertos +=1;
        }
        else{
            Palavra4.setTextColor(Color.RED);
            qtdeErros +=1;
        }

        //Palavra 5 - Tilapia

        EditText resposta5 [] = {
                (EditText)findViewById(R.id.p4L3),
                (EditText)findViewById(R.id.p5L2),
                (EditText)findViewById(R.id.p5L3),
                (EditText)findViewById(R.id.p5L4),
                (EditText)findViewById(R.id.p5L5),
                (EditText)findViewById(R.id.p5L6),
                (EditText)findViewById(R.id.p5L7),
        };
        String palavra5 = "Tilapia";

        TextView Palavra5 = (TextView)findViewById(R.id.Palavra5);

        String resposta5Text[] = {
                resposta5[0].getText().toString(),
                resposta5[1].getText().toString(),
                resposta5[2].getText().toString(),
                resposta5[3].getText().toString(),
                resposta5[4].getText().toString(),
                resposta5[5].getText().toString(),
                resposta5[6].getText().toString(),
        };
        String resposta5Palavra = resposta5Text[0] + resposta5Text[1] + resposta5Text[2] + resposta5Text[3] + resposta5Text[4] + resposta5Text[5] + resposta5Text[6];
        if(palavra5.trim().toLowerCase(Locale.ROOT).equals(resposta5Palavra.trim().toLowerCase(Locale.ROOT))){
            Palavra5.setText("5 - Você Acertou!");
            Palavra5.setTextColor(Color.GREEN);
            qtdeAcertos +=1;
        }
        else{
            Palavra5.setTextColor(Color.RED);
            qtdeErros +=1;
        }

        if(qtdeAcertos == 3){
            Intent fase3 = new Intent(this,Fase3.class);
            fase3.putExtra("AMOUNT_LOSES", qtdeErros);
            startActivity(fase3);
        }
    }
}