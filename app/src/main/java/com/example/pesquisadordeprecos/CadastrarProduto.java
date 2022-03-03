package com.example.pesquisadordeprecos;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastrarProduto extends AppCompatActivity {

    EditText editTextNomeProduto;
    EditText editTextPrecoProduto;

    BancoDados bancoDados = new BancoDados(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atividade_cadastrar_produto);

        this.editTextNomeProduto = (EditText) findViewById(R.id.editTextNomeProduto);
        this.editTextPrecoProduto = (EditText) findViewById(R.id.editTextPrecoProduto);
    }

    public void cliqueAdicionarProduto(View view){
        // bancoDados.adicionarProduto(new Produto("Abacaxi",3.1));

        String mensagem = "Produto: " + this.editTextNomeProduto.getText().toString()
                + "\n" + "Preço: " + this.editTextPrecoProduto.getText().toString();

        Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_SHORT).show();
        finish();
    }
}