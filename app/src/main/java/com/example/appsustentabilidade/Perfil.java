package com.example.appsustentabilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Perfil extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);


        // Instanciando Objetos

        btn_home = findViewById(R.id.img_btn_home);
        btn_tipos = findViewById(R.id.img_btn_tipo);
        btn_perfil = findViewById(R.id.img_btn_perfil);
        txt_nome_usuario = findViewById(R.id.txt_nome_usuario);
        txt_id_usuario = findViewById(R.id.txt_id_usuario);
        dados = findViewById(R.id.txt_ver_mais);
        titulo = findViewById(R.id.txt_titulo_perfil);
        txt_nome = findViewById(R.id.txt_nome);
        txt_usuario = findViewById(R.id.txt_usuario);
        txt_email = findViewById(R.id.txt_email);
        txt_senha = findViewById(R.id.txt_senha);
        edit_nome = findViewById(R.id.edit_txt_nome);
        edit_usu = findViewById(R.id.edit_txt_usuario);
        edit_email = findViewById(R.id.edit_txt_email);
        edit_senha = findViewById(R.id.edit_txt_senha);
        ll_login = findViewById(R.id.Layout_Base_Login);
        btn_cadastrar = findViewById(R.id.btn_cadastrar);


        txt_id_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                ll_login.setVisibility(View.VISIBLE);
                txt_id_usuario.setVisibility(View.INVISIBLE);
            }
        });

        btn_cadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                String nome = edit_nome.getText().toString();
                String usuario = edit_usu.getText().toString();
                String email = edit_email.getText().toString();
                String senha = edit_senha.getText().toString();

                if((nome != null) && (usuario != null) && (email != null) && (senha != null)){

                    dados.setVisibility(View.VISIBLE);
                    ll_login.setVisibility(View.INVISIBLE);
                    txt_id_usuario.setVisibility(View.VISIBLE);
                    txt_nome_usuario.setText(nome);
                    txt_id_usuario.setText(usuario);

                    dados.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            dados.setVisibility(View.INVISIBLE);
                            ll_login.setVisibility(View.VISIBLE);
                            titulo.setText(R.string.show_datas);
                            txt_nome.setText(R.string.nome_cadastrado);
                            edit_nome.setText(nome);
                            txt_usuario.setText(R.string.usuario_cadastrado);
                            edit_usu.setText(usuario);
                            txt_email.setText(R.string.email_cadastrado);
                            edit_email.setText(email);
                            txt_senha.setVisibility(View.INVISIBLE);
                            edit_senha.setVisibility(View.INVISIBLE);
                            btn_cadastrar.setText("Fechar");

                            btn_cadastrar.setOnClickListener(new View.OnClickListener(){
                                @Override
                                public void onClick(View v){
                                    ll_login.setVisibility(View.INVISIBLE);
                                }
                            });
                        }
                    });
                }
                else{

                }
            }
        });




        // Navegation Bar
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent home = new Intent(Perfil.this, MainActivity.class);
                startActivity(home);
            }
        });

        btn_tipos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent tipos = new Intent(Perfil.this, Tipos.class);
                startActivity(tipos);
            }
        });

        btn_perfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent perfil = new Intent(Perfil.this, Perfil.class);
                startActivity(perfil);
            }
        });
    }

    ImageButton btn_home;
    ImageButton btn_tipos;
    ImageButton btn_perfil;
    EditText edit_nome;
    EditText edit_usu;
    EditText edit_email;
    EditText edit_senha;
    TextView txt_nome_usuario;
    TextView txt_id_usuario;
    TextView dados;
    TextView titulo;
    TextView txt_nome;
    TextView txt_usuario;
    TextView txt_email;
    TextView txt_senha;
    LinearLayout ll_login;
    Button btn_cadastrar;
}