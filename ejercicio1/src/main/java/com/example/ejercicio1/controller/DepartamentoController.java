package com.example.ejercicio1.controller;

import com.example.ejercicio1.entity.Departamento;
import com.example.ejercicio1.service.impl.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v5")
public class DepartamentoController {
    @Autowired
    DepartamentoService departamentoService;
    //Metodos Read - Lectura
    @GetMapping("/departamentos")
    public List<Departamento> readAll(){
        return departamentoService.readAll();
    }
    @GetMapping("/departamentos/{id}")
    public Optional<Departamento> readById(@PathVariable Integer id){
        return departamentoService.readById(id);
    }
    //Metodo create
    @PostMapping("/departamentos")
    public Departamento create(@RequestBody Departamento departamento){
        return departamentoService.create(departamento);
    }
    //Metodo update
    @PutMapping("/departamentos")
    public Departamento update(@RequestBody Departamento departamento){
        return departamentoService.update(departamento);
    }
    //Metodo delete
    @DeleteMapping("/departamentos/{id}")
    public String deleteById(@PathVariable Integer id){
        return departamentoService.deleteById(id);
    }

}
