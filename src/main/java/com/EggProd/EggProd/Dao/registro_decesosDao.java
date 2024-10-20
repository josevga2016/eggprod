/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;

import com.EggProd.EggProd.models.registro_decesos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


/**
 *
 * @author Lenovo
 */
public interface registro_decesosDao extends CrudRepository<registro_decesos, Integer>{
    
    // Método para obtener todos los decesos de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM registro_decesos WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<registro_decesos> findDecesosByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener los decesos en una fecha específica
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM registro_decesos WHERE fecha_deceso = :fechaDeceso AND cod_galpon = :codGalpon", nativeQuery = true)
    public List<registro_decesos> findDecesosByFecha(@Param("fechaDeceso") String fechaDeceso, @Param("codGalpon") Integer codGalpon);

    // Método para obtener un deceso por su código
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM registro_decesos WHERE cod_deceso = :codDeceso", nativeQuery = true)
    public registro_decesos findDecesoById(@Param("codDeceso") Integer codDeceso);
    
}
