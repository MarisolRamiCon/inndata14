package com.example.ejercicio1.service;

import com.example.ejercicio1.entity.Departamento;

import java.util.List;
import java.util.Optional;

public interface IDepartamentoService {
    public List<Departamento> readAll();
    public Optional<Departamento> readById(Integer id);
    public Departamento create(Departamento departamento);
    public Departamento update(Departamento departamento);
    public String deleteById(Integer id);
}
