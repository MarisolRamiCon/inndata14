package com.example.ejercicio1.service.impl;

import com.example.ejercicio1.feign.ViajesClient;
import com.example.ejercicio1.model.Viaje;
import com.example.ejercicio1.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViajeService implements IViajeService {
    @Autowired
    ViajesClient viajesClient;
    @Override
    public List<Viaje> getData() {
        return viajesClient.getData();
    }

    @Override
    public Viaje getById(Long id) {
        return viajesClient.getDataById(id);
    }
}
