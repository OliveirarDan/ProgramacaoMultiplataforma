/** Danilo Rodrigues Oliveira    RA: 81612248    SIN3AN-BUA */

package com.example.danilo.filmesdb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalheFilmeActivity extends Activity {
    private TextView titulo, descricao, diretor, popularidade;
    private ImageView foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);
        TextView nome = (TextView)findViewById(R.id.filme_selecionado);
        Intent intent = getIntent();
        nome.setText(intent.getStringExtra(ListaFilmesActivity.FILME));
    }
}
