package com.example.ejercicio1.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonaResponse {
    private String nombre;
    private Integer edad;
    private Integer idDepartamento;
}
