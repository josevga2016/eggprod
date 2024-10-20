/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;

import com.EggProd.EggProd.models.produccion_diaria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface produccion_diariaDao extends CrudRepository<produccion_diaria, Integer>{
    
    // Método para obtener toda la producción diaria de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM produccion_diaria WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<produccion_diaria> findProduccionDiariaByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener la producción de huevos en una fecha específica
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM produccion_diaria WHERE fecha_puesta = :fechaPuesta AND cod_galpon = :codGalpon", nativeQuery = true)
    public produccion_diaria findProduccionByFecha(@Param("fechaPuesta") String fechaPuesta, @Param("codGalpon") Integer codGalpon);
    
}
