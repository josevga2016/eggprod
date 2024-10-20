/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;

import com.EggProd.EggProd.models.vacunaciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


/**
 *
 * @author Lenovo
 */
public interface vacunacionesDao extends CrudRepository<vacunaciones, Integer>{
    
    // Método para obtener todas las vacunaciones de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM vacunaciones WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<vacunaciones> findVacunacionesByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener una vacunación por su código
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM vacunaciones WHERE cod_vacunacion = :codVacunacion", nativeQuery = true)
    public vacunaciones findVacunacionById(@Param("codVacunacion") Integer codVacunacion);

    // Método para obtener vacunaciones por enfermedad
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM vacunaciones WHERE enfermedad = :enfermedad AND cod_galpon = :codGalpon", nativeQuery = true)
    public List<vacunaciones> findVacunacionesByEnfermedad(@Param("enfermedad") String enfermedad, @Param("codGalpon") Integer codGalpon);
    
}
