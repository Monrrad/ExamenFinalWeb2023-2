package com.example.demo.controllers;

import com.example.demo.entities.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.PokemonService;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{tipo}")
    public ResponseEntity<List<Pokemon>> getPokemonsByType(@PathVariable String tipo) {
        List<Pokemon> pokemons = pokemonService.getPokemonsByType(tipo);
        return ResponseEntity.ok(pokemons);
    }

    @PostMapping
    public ResponseEntity<Pokemon> registerPokemon(@RequestBody Pokemon pokemon) {
        Pokemon registeredPokemon = pokemonService.registerPokemon(pokemon);
        return ResponseEntity.ok(registeredPokemon);
    }
}

