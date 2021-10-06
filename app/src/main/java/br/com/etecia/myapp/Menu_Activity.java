package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Activity extends AppCompatActivity {
    Button btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        btnSair = findViewById(R.id.btnEntrar);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //Toast.makeText(getApplicationContext(), "Bem vindo ao sistema!!!", Toast.LENGTH_SHORT).show();

                //Abrir janela

                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                finish();

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);

                startActivity(intent);





            }
        });

    }
}

 /*else {
        Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos!!!", Toast.LENGTH_SHORT).show();
        edtUsuario.setText("");
        edtSenha.setText("");
        edtUsuario.requestFocus();
        }

  */