package com.example.ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Viaje {
    private Long id;
    private String destino;
    private Double precio;
    private LocalDateTime fechaSalida;
}
