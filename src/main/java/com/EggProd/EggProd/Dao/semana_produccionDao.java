/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;

import com.EggProd.EggProd.models.semana_produccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface semana_produccionDao extends CrudRepository<semana_produccion, Integer> {
    // Método para obtener todas las semanas de producción de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM semana_produccion WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<semana_produccion> findSemanasByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener la producción de huevos en una semana específica
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM semana_produccion WHERE cod_semana = :codSemana", nativeQuery = true)
    public semana_produccion findProduccionBySemana(@Param("codSemana") Integer codSemana);
}
