/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;


import com.EggProd.EggProd.models.desparasitaciones_vitaminas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface desparasitaciones_vitaminasDao extends CrudRepository<desparasitaciones_vitaminas, Integer>{
    
    // Método para obtener todas las desparasitaciones o vitaminizaciones de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM desparasitaciones_vitaminas WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<desparasitaciones_vitaminas> findByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener una desparasitación o vitaminización por su código
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM desparasitaciones_vitaminas WHERE cod_desp = :codDesp", nativeQuery = true)
    public desparasitaciones_vitaminas findDespById(@Param("codDesp") Integer codDesp);

    // Método para obtener todas las desparasitaciones de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM desparasitaciones_vitaminas WHERE cod_galpon = :codGalpon AND tipo = 'Desparasitación'", nativeQuery = true)
    public List<desparasitaciones_vitaminas> findDesparasitacionesByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener todas las vitaminizaciones de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM desparasitaciones_vitaminas WHERE cod_galpon = :codGalpon AND tipo = 'vitaminización'", nativeQuery = true)
    public List<desparasitaciones_vitaminas> findVitaminizacionesByGalpon(@Param("codGalpon") Integer codGalpon);
    
 
}
