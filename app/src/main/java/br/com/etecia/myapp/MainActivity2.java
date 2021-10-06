package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btnEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnEntrar = findViewById(R.id.btnEntrar);

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
    }
}