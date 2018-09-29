/** Danilo Rodrigues Oliveira    RA: 81612248    SIN3AN-BUA */

package com.example.danilo.filmesdb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalheFilmeActivity extends Activity {
    private TextView titulo, descricao, diretor;
    private ImageView foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);
        titulo = findViewById(R.id.detalha_txt_titulo);
        descricao = findViewById(R.id.detalhe_txt_descricao);
        diretor = findViewById(R.id.detalhe_txt_diretor);
        foto = findViewById(R.id.detalhe_foto_filme);

        Intent intent = getIntent();
        Filme filme = (Filme)intent.getSerializableExtra(ListaFilmesActivity.FILME);
        titulo.setText(filme.getTitulo().toString());
        descricao.setText(filme.getDescricao().toString());
        diretor.setText(filme.getDiretor().toString());
        foto.setImageDrawable(Util.getImagem(this,filme.getFoto()));
    }
}
