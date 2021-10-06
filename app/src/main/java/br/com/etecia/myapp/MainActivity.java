package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Variaveis globais que representam os objetos no xml

    Button btnEntrar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //abrindo a minha activity
        setContentView(R.layout.activity_main);

        //declarei as variáveis do java para apresentar para as variáveis xml


        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);

        //ação do botão entrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    //Toast.makeText(getApplicationContext(), "Bem vindo ao sistema!!!", Toast.LENGTH_SHORT).show();

                    //Abrir janela

                    startActivity(new Intent(getApplicationContext(),Menu_Activity.class));
                    finish();

                    Intent intent = new Intent(getApplicationContext(),Menu_Activity.class);
                    
                    startActivity(intent);





            }
        });
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


    public void sairSistema(View view) {
        finish(); //finalizando a activity
    }
}