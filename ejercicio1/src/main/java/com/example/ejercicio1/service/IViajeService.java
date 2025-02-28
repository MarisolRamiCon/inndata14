package com.example.ejercicio1.service;

import com.example.ejercicio1.model.Viaje;

import java.util.List;

public interface IViajeService {
    public List<Viaje> getData();
    public Viaje getById(Long id);
}
