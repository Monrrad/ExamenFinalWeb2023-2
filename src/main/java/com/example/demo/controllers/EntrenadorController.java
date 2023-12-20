package com.example.demo.controllers;

import com.example.demo.entities.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.EntrenadorService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> request) {
        String email = request.get("email");
        String uuid = entrenadorService.getUuidByEmail(email);
        Map<String, String> response = new HashMap<>();
        response.put("uuid", uuid);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{uuid}/pokemons")
    public ResponseEntity<List<Pokemon>> getPokemonsByEntrenador(@PathVariable String uuid) {
        List<Pokemon> pokemons = entrenadorService.getPokemonsByEntrenador(uuid);
        return ResponseEntity.ok(pokemons);
    }

    @GetMapping("/{uuid}/pokemons/{pokemonUuid}")
    public ResponseEntity<?> addPokemonToEntrenador(@PathVariable String uuid, @PathVariable String pokemonUuid) {
        // Verificar si el pokemon ya está asociado al entrenador
        if (entrenadorService.isPokemonAssociated(uuid, pokemonUuid)) {
            Map<String, String> response = new HashMap<>();
            response.put("error", "true");
            response.put("message", "El pokemon ya está registrado al entrenador");
            return ResponseEntity.badRequest().body(response);
        }

        // Asociar el pokemon al entrenador
        List<Pokemon> updatedPokemons = entrenadorService.addPokemonToEntrenador(uuid, pokemonUuid);
        return ResponseEntity.ok(updatedPokemons);
    }
}
