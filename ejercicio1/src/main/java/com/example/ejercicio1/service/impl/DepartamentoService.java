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
        return departamentoRepository.findAll().stream().
                filter(departamento ->
                        departamento.getIsActive()==true).toList();
    }

    @Override
    public Optional<Departamento> readById(Integer id) {
        Optional<Departamento> departamento= departamentoRepository.findById(id);
        return departamento;
    }

    @Override
    public Departamento create(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public Departamento update(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public String deleteById(Integer id) {
        Optional<Departamento> departamento= departamentoRepository.findById(id);
        if (departamento.isPresent()){
            Departamento departamentoObjeto = departamento.get();
            departamentoObjeto.setIsActive(false);
            departamentoRepository.save(departamentoObjeto);
            return "borrado exitosamente";
        }else{
            return "No esta";
        }
    }
}
