package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import com.bumptech.glide.Glide;

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
        pokemons.add(new Pokemon ("bulbizarre", "001", "https://www.pokepedia.fr/images/thumb/e/ef/Bulbizarre-RFVF.png/86px-Bulbizarre-RFVF.png"));
        pokemons.add(new Pokemon ("herbizarre", "002", "https://www.pokepedia.fr/images/thumb/4/44/Herbizarre-RFVF.png/86px-Herbizarre-RFVF.png"));
        pokemons.add(new Pokemon ("florizarre", "003", "https://www.pokepedia.fr/images/thumb/4/42/Florizarre-RFVF.png/103px-Florizarre-RFVF.png"));
        pokemons.add(new Pokemon ("salameche", "004", "https://www.pokepedia.fr/images/thumb/8/89/Salam%C3%A8che-RFVF.png/71px-Salam%C3%A8che-RFVF.png"));

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