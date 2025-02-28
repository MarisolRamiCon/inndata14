package com.example.ejercicio1.controller;

import com.example.ejercicio1.model.Viaje;
import com.example.ejercicio1.service.impl.ViajeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v5")
public class ViajeController {
    @Autowired
    ViajeService viajeService;
    @GetMapping("/viaje")
    public List<Viaje> getData(){
        return viajeService.getData();
    }
    @GetMapping("/viaje/{id}")
    public Viaje getById(@PathVariable Long id){
        return viajeService.getById(id);
    }
}
