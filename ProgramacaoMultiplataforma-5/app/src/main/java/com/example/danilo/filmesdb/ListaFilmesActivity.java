/** Danilo Rodrigues Oliveira    RA: 81612248    SIN3AN-BUA */


package com.example.danilo.filmesdb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaFilmesActivity extends Activity {
    Activity activity;

    ArrayList<String> lista;
    Activity atividade;

    public static final String FILME = "com.example.danilo.filmesdb.filme";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);
        atividade = this;
        final Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.BUSCA);
        lista = this.buscaFilmes(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView) findViewById(R.id.lista_filmes);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1 = new Intent(atividade, DetalheFilmeActivity.class);
                intent1.putExtra(FILME, lista.get(i));
                startActivity(intent1);
            }
        });

    }


    public ArrayList<String> buscaFilmes (String chave){
        ArrayList<String> lista = geraListaFilmes();
        if (chave == null || chave.length() == 0){
            return lista;
        } else {
            ArrayList<String> subLista = new ArrayList<>();
            for (String nome:lista){
                if (nome.toUpperCase().contains(chave.toUpperCase())){
                    subLista.add(nome);
                }
            }
            return subLista;
        }
    }

    public ArrayList<String> geraListaFilmes(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Duro de Matar");
        lista.add("De volta para o futuro");
        lista.add("Pinóquio");
        lista.add("Rei leão");
        lista.add("Piratas do Vale do silicio");
        lista.add("Poderoso chefão");
        lista.add("Poderoso chefão 2");
        lista.add("Poderoso chefão 3");
        lista.add("Tropa de elite");

        return lista;
    }




}
