package com.example.cruzadinha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FimJogo extends AppCompatActivity {
    int qtdeErros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim_jogo);
        qtdeErros = getIntent().getIntExtra("AMOUNT_ERRORS", 0);
        TextView erros = (TextView) findViewById(R.id.Erros);
        erros.setText("Seus erros foram: " + qtdeErros);
    }

    public void IrDeNovo(View view){
        Intent instrucoes = new Intent(this, Instrucoes.class);
        startActivity(instrucoes);
    }
}

