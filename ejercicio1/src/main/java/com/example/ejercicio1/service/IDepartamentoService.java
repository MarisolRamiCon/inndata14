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
    public List<Departamento> m2AndPrecio(Integer m2, Double precio);
    public List<Departamento> precioAndM2(Integer m2, Double precio);
}
