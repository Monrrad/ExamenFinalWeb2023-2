package service;

import com.example.demo.entities.Pokemon;
import com.example.demo.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> getPokemonsByType(String tipo) {

    }

    public Pokemon registerPokemon(Pokemon pokemon) {

    }
}

