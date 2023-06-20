package com.example.appsustentabilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String ENVIAR_TITULO = null;
    public static final String ENVIAR_DETALHE = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_home = findViewById(R.id.img_btn_home);
        btn_tipo = findViewById(R.id.img_btn_tipo);
        btn_perfil = findViewById(R.id.img_btn_perfil);
        img_lirio = findViewById(R.id.img_planta1);
        img_evonimo = findViewById(R.id.img_planta2);
        img_bambu = findViewById(R.id.img_planta3);
        img_hera = findViewById(R.id.img_planta4);


        // Plantas
        img_lirio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent enviar_dados = new Intent(MainActivity.this, Descricao_Planta.class);

                String titulo = getString(R.string.titulo_planta1);
                String detalhe = getString(R.string.texto_lirio_da_paz);

                enviar_dados.putExtra(ENVIAR_TITULO, titulo);
                enviar_dados.putExtra(ENVIAR_DETALHE, detalhe);
                startActivity(enviar_dados);
            }
        });
        img_evonimo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent enviar_dados = new Intent(MainActivity.this, Descricao_Planta.class);

                String titulo = getString(R.string.titulo_planta2);
                String detalhe = getString(R.string.texto_evonimo_do_japao);

                enviar_dados.putExtra(ENVIAR_TITULO, titulo);
                enviar_dados.putExtra(ENVIAR_DETALHE, detalhe);
                startActivity(enviar_dados);
            }
        });
        img_bambu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent enviar_dados = new Intent(MainActivity.this, Descricao_Planta.class);

                String titulo = getString(R.string.titulo_planta3);
                String detalhe = getString(R.string.texto_bamdu_da_sorte);

                enviar_dados.putExtra(ENVIAR_TITULO, titulo);
                enviar_dados.putExtra(ENVIAR_DETALHE, detalhe);
                startActivity(enviar_dados);
            }
        });
        img_hera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent enviar_dados = new Intent(MainActivity.this, Descricao_Planta.class);

                String titulo = getString(R.string.titulo_planta4);
                String detalhe = getString(R.string.texto_hera);

                enviar_dados.putExtra(ENVIAR_TITULO, titulo);
                enviar_dados.putExtra(ENVIAR_DETALHE, detalhe);
                startActivity(enviar_dados);
            }
        });

        // Botões NavBar
        btn_tipo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tipos = new Intent(MainActivity.this, Tipos.class);
                startActivity(tipos);
            }
        });

        btn_perfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent perfil = new Intent(MainActivity.this, Perfil.class);
                startActivity(perfil);
            }
        });

    }


    ImageButton btn_home;
    ImageButton btn_tipo;
    ImageButton btn_perfil;
    ImageView img_lirio;
    ImageView img_evonimo;
    ImageView img_bambu;
    ImageView img_hera;
}