package com.example.ejercicio1.service.impl;

import com.example.ejercicio1.entity.Departamento;
import com.example.ejercicio1.repository.DepartamentoRepository;
import com.example.ejercicio1.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService implements IDepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> readAll() {
        return departamentoRepository.findAll();
    }

    @Override
    public Optional<Departamento> readById(Integer id) {
        Optional<Departamento> departamento= departamentoRepository.findById(id);
        return departamento;
    }
}
