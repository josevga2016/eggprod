/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;

import com.EggProd.EggProd.models.indicadores;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


/**
 *
 * @author Lenovo
 */
public interface indicadoresDao extends CrudRepository<indicadores, Integer>{
    
    // Método para obtener todos los indicadores de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM indicadores WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<indicadores> findIndicadoresByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener un indicador por su código
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM indicadores WHERE cod_indicador = :codIndicador", nativeQuery = true)
    public indicadores findIndicadorById(@Param("codIndicador") Integer codIndicador);

    // Método para obtener indicadores por fecha de descarte
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM indicadores WHERE fecha_descarte = :fechaDescarte AND cod_galpon = :codGalpon", nativeQuery = true)
    public List<indicadores> findIndicadoresByFechaDescarte(@Param("fechaDescarte") String fechaDescarte, @Param("codGalpon") Integer codGalpon);
    
}
