package com.example.ejercicio1.service;

import com.example.ejercicio1.entity.Persona;
import com.example.ejercicio1.response.PersonaResponse;

import java.util.List;

public interface IPersonaService {
    public List<PersonaResponse> readAll();
}
