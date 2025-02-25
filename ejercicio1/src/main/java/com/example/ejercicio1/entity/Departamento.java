package com.example.ejercicio1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departamento")
@AllArgsConstructor //Constructor con todos los datos
@NoArgsConstructor //Constructor sin argumentos
@Data //Getter y Setter
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Integer idDepartamento;

    @Column(name = "m2")
    private Integer m2;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "is_active")
    private Boolean isActive;

/*
    public Departamento() {
    }

    public Departamento(Integer idDepartamento, Integer m2, Double precio) {
        this.idDepartamento = idDepartamento;
        this.m2 = m2;
        this.precio = precio;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }*/
}
