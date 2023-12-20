package service;

import com.example.demo.entities.Pokemon;
import com.example.demo.repositories.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService {

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public String getUuidByEmail(String email) {

    }

    public List<Pokemon> getPokemonsByEntrenador(String uuid) {

    }

    public boolean isPokemonAssociated(String entrenadorUuid, String pokemonUuid) {

    }

    public List<Pokemon> addPokemonToEntrenador(String entrenadorUuid, String pokemonUuid) {

    }
}
