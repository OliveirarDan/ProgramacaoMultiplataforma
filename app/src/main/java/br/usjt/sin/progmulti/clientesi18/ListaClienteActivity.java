/** Danilo Rodrigues Oliveira    RA: 81612248    SIN3AN-BUA */

package br.usjt.sin.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaClienteActivity extends Activity {
    public static final String MENSAGEM = "br.usjt.sin.progmulti.clientesi18";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cliente);

        final Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.BUSCA);
        final ListView listView = findViewById(R.id.lista_clientes);

        ArrayList<String> clientes = this.clientes();
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, clientes);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent (ListaClienteActivity.this, Activity_resposta.class);
                String texto = adapter.getItem(position);
                intent.putExtra(MENSAGEM, texto);
                startActivity(intent);
            }
        });





     /*   listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaClienteActivity.this,Activity_resposta.class);
                String texto = editText.getText().toString();
                intent.putExtra(MENSAGEM, texto);
                startActivity(intent);
            }
        });

*/
     }

     private ArrayList<String> clientes(){
        ArrayList<String> lista = new ArrayList<>();
         lista.add("Carlos Drummond de Andrade");
         lista.add("Manuel Bandeira");
         lista.add("Olavo Bilac");
         lista.add("Vinícius de Moraes");
         lista.add("Cecília Meireles");
         lista.add("Castro Alves");
         lista.add("Gonçalves Dias");
         lista.add("Ferreira Gullar");
         lista.add("Machado de Assis");
         lista.add("Mário de Andrade");
         lista.add("Cora Coralina");
         lista.add("Manoel de Barros");
         lista.add("João Cabral de Melo Neto");
         lista.add("Casimiro de Abreu");
         lista.add("Paulo Leminski");
         lista.add("Álvares de Azevedo");
         lista.add("Guilherme de Almeida");
         lista.add("Alphonsus de Guimarães");
         lista.add("Mário Quintana");
         lista.add("Gregório de Matos");
         lista.add("Augusto dos Anjos");


         return lista;
     }


   /** public void enviarCliente(View view) {
        Intent intent = new Intent(this, Activity_resposta.class);
        //String texto = listView.getSelectedItem().toString();
        intent.putExtra(MENSAGEM, texto);
        startActivity(intent);
    }*/







}
