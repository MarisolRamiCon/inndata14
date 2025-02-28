package com.example.ejercicio1.service.impl;

import com.example.ejercicio1.entity.Persona;
import com.example.ejercicio1.repository.PersonaRepository;
import com.example.ejercicio1.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    PersonaRepository personaRepository;
    @Override
    public List<Persona> readAll() {
        return personaRepository.findAll();
    }
}
