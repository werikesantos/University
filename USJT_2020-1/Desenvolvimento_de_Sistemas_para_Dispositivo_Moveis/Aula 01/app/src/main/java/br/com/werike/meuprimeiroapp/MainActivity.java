package br.com.werike.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //SERÁ CHAMADO QUANDO O USUÁRIO CLICAR EM ENVIAR
    public void sendMessage(View view){

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    //CONSTANTE STATIC PARA IDENTIFICAR A MENSAGEM
    public final static String EXTRA_MESSAGE = "br.com.werike.meuprimeiroapp";
}