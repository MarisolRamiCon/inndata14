package com.example.ejercicio1.service.impl;

import com.example.ejercicio1.repository.PersonaRepository;
import com.example.ejercicio1.response.PersonaResponse;
import com.example.ejercicio1.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    PersonaRepository personaRepository;
    @Override
    public List<PersonaResponse> readAll() {
        List<PersonaResponse> lista= new ArrayList<>();
        lista=personaRepository.findAll().stream().map(persona ->
        {
            PersonaResponse personaResponse =
                    new PersonaResponse(persona.getNombre(), persona.getEdad(),persona.getIdDepartamento().getIdDepartamento());
            return personaResponse;
        }).toList();
        return lista;

    }
}
