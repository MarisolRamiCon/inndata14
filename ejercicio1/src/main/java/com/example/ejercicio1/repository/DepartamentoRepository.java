package com.example.ejercicio1.repository;

import com.example.ejercicio1.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento,Integer> {
    //Métodos personalizados con metodos de JpaRepository select * from departamento where m2<=:m2 and precio<=:precio
    public List<Departamento> findByM2LessThanEqualAndPrecioLessThanEqual(Integer m2, Double precio);

    //Mayores que GreaterThan findByPrecioGreaterThan(Double precio)

    //Métodos personalizados pero con Query
    @Query(value = "select * from departamento where m2>=:m2 and precio>:precio;",
            nativeQuery = true)
    public List<Departamento> precioAndM2(Integer m2, Double precio);

}
