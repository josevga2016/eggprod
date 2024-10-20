/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;


import com.EggProd.EggProd.models.registro_costos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface registro_costosDao extends CrudRepository<registro_costos, Integer>{
    
    // Método para obtener todos los costos de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM registro_costos WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<registro_costos> findCostosByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener los costos en una fecha específica
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM registro_costos WHERE fecha_costo = :fechaCosto AND cod_galpon = :codGalpon", nativeQuery = true)
    public List<registro_costos> findCostosByFecha(@Param("fechaCosto") String fechaCosto, @Param("codGalpon") Integer codGalpon);
    
}
