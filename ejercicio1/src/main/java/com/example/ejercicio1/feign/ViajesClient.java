package com.example.ejercicio1.feign;

import com.example.ejercicio1.model.Viaje;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "viajes", url = "https://6721642e98bbb4d93ca84a26.mockapi.io/api/v4")
public interface ViajesClient {
    @GetMapping("/viajes")
    public List<Viaje> getData();
    @GetMapping("/viajes/{id}")
    public Viaje getDataById(@PathVariable Long id);

}
