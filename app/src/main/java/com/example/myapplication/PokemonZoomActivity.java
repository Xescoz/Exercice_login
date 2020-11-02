package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;

public class PokemonZoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_zoom);
        final ImageButton pokemonZoom = findViewById(R.id.pokemonZoom);

        pokemonZoom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        String imageZoom = getIntent().getExtras().getString("ImageZoom");
        Glide.with(pokemonZoom).load(imageZoom).into(pokemonZoom);
    }
}