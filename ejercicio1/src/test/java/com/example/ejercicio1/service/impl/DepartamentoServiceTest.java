package com.example.ejercicio1.service.impl;

import com.example.ejercicio1.entity.Departamento;
import com.example.ejercicio1.repository.DepartamentoRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class DepartamentoServiceTest {
    @InjectMocks //Como estamos usando objetos falsos no podemos usar Autowired, entonces usamos esta anotation
    DepartamentoService departamentoService;

    @Mock//creamos objetos falsos para testear el metodo completo
    DepartamentoRepository departamentoRepository;

    List<Departamento> listaDepartamentos= new ArrayList<>();
    Departamento departamento= new Departamento(1,200,2000.0,true);
    Departamento departamento1= new Departamento(2,300,3000.0,true);
    Departamento departamento2= new Departamento(3,400,4000.0,true);

    @BeforeEach
    void setUp() {
        System.out.println("Método setUp");
        listaDepartamentos.add(departamento);
        listaDepartamentos.add(departamento1);
        listaDepartamentos.add(departamento2);

    }

    @AfterEach
    void tearDown() {
        System.out.println("Metodo tearDown");
    }

    @Test
    void suma() {
        double resultado= departamentoService.suma(5.0, 7.0);
        assertEquals(12.0,resultado );
        System.out.println("Método suma");
    }


    @Test
    void readAll() {
        Mockito.when(departamentoRepository.findAll()).
                thenReturn(listaDepartamentos);
        List<Departamento> listaResultante= departamentoService.readAll();
        Assertions.assertEquals(listaDepartamentos,listaResultante);
        System.out.println("Método readAll");

    }

    @Test
    void deleteById() {
        Mockito.when(departamentoRepository.findById(1))
                .thenReturn(Optional.of(departamento));
        departamento.setIsActive(false);
        Mockito.when(departamentoRepository.save(departamento)).thenReturn(departamento);
        String res= departamentoService.deleteById(1);
        Assertions.assertEquals("borrado exitosamente", res);
    }

    @Test
    void readById() {
        Mockito.when(departamentoRepository.findById(1)).thenReturn(Optional.of(departamento));
        Optional<Departamento> listaOptional = departamentoService.readById(1);
        Assertions.assertEquals(departamento,listaOptional.get());
        //.get() compara lo que hay dentro del optional en sí o sea los datos de departamento

    }
}