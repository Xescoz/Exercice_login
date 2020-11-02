package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class LoginSuccessActivity extends AppCompatActivity {
    List<Pokemon> pokemons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);
        final Button backButton = findViewById(R.id.back);
        final ImageButton miniatureButton = findViewById(R.id.miniaturePokemon);

        RecyclerView rvPokemon = (RecyclerView) findViewById(R.id.pokemon_list);

        pokemons = new ArrayList<Pokemon>();
        pokemons.add(new Pokemon ("Bulbizarre", "001", "https://www.pokepedia.fr/images/thumb/e/ef/Bulbizarre-RFVF.png/86px-Bulbizarre-RFVF.png","https://www.pokepedia.fr/images/thumb/e/ef/Bulbizarre-RFVF.png/644px-Bulbizarre-RFVF.png"));
        pokemons.add(new Pokemon ("Herbizarre", "002", "https://www.pokepedia.fr/images/thumb/4/44/Herbizarre-RFVF.png/86px-Herbizarre-RFVF.png", "https://www.pokepedia.fr/images/thumb/4/44/Herbizarre-RFVF.png/644px-Herbizarre-RFVF.png"));
        pokemons.add(new Pokemon ("Florizarre", "003", "https://www.pokepedia.fr/images/thumb/4/42/Florizarre-RFVF.png/103px-Florizarre-RFVF.png", "https://www.pokepedia.fr/images/thumb/4/42/Florizarre-RFVF.png/773px-Florizarre-RFVF.png"));
        pokemons.add(new Pokemon ("Salamèche", "004", "https://www.pokepedia.fr/images/thumb/8/89/Salam%C3%A8che-RFVF.png/71px-Salam%C3%A8che-RFVF.png","https://www.pokepedia.fr/images/thumb/8/89/Salam%C3%A8che-RFVF.png/530px-Salam%C3%A8che-RFVF.png"));

        PokemonAdapter adapter = new PokemonAdapter(pokemons, getApplicationContext());
        rvPokemon.setAdapter(adapter);
        rvPokemon.setLayoutManager(new LinearLayoutManager(this));

        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }
}