package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder> {

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameTextView;
        public ImageView imageV;
        public TextView idTextView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.namePokemon);
            idTextView = (TextView) itemView.findViewById(R.id.pokemonId);
            imageV = (ImageView) itemView.findViewById(R.id.image);
        }
    }

    private List<Pokemon> pokemons;
    private Context context;

    // Pass in the contact array into the constructor
    public PokemonAdapter(List<Pokemon> pokemons, Context context) {
        this.pokemons = pokemons;
        this.context = context;
    }

    @Override
    public PokemonAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View pokemonView = inflater.inflate(R.layout.pokemon_view, parent, false);

        // Return a new holder instance
        return  new ViewHolder(pokemonView);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(PokemonAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        Pokemon pokemon = pokemons.get(position);

        holder.idTextView.setText(pokemon.getId());
        holder.nameTextView.setText(pokemon.getName());
        holder.imageV.setImageResource(pokemon.getImage());
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return pokemons.size();
    }
}