package com.example.pesquisadordeprecos;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastrarProduto extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atividade_cadastrar_produto);

        this.editText = (EditText) findViewById(R.id.editTextNomeProduto);
    }

    public void cliqueAdicionarProduto(View view){
        Toast.makeText(getApplicationContext(), this.editText.getText().toString(), Toast.LENGTH_SHORT).show();
        finish();
    }
}