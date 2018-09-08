/** Danilo Rodrigues Oliveira    RA: 81612248    SIN3AN-BUA */

package br.usjt.sin.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class Activity_resposta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        //Pegando dados da "MENSAGEM"
        Intent intent = getIntent();
        String cliente = intent.getStringExtra(ListaClienteActivity.MENSAGEM);

        //Definindo TextView
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(cliente);

        //Inserindo textView no layout
        ViewGroup layout = findViewById(R.id.activity_resposta);
        layout.addView(textView);


    }
}
