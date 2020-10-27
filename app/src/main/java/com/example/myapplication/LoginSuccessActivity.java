package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class LoginSuccessActivity extends AppCompatActivity {
    List<Pokemon> pokemons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);
        final Button backButton = findViewById(R.id.back);

        RecyclerView rvPokemon = (RecyclerView) findViewById(R.id.pkm_list);


        pokemons = new ArrayList<Pokemon>();
        pokemons.add(new Pokemon ("bulbizarre", "001", R.drawable.miniature_001));
        pokemons.add(new Pokemon ("herbizarre", "002", R.drawable.miniature_002));
        pokemons.add(new Pokemon ("florizarre", "003", R.drawable.miniature_003));
        pokemons.add(new Pokemon ("salameche", "004", R.drawable.miniature_004));

        PokemonAdapter adapter = new PokemonAdapter(pokemons, getApplicationContext());
        rvPokemon.setAdapter(adapter);
        rvPokemon.setLayoutManager(new LinearLayoutManager(this));

        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(LoginSuccessActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}