/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;

import com.EggProd.EggProd.models.contabilidad_mensual;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


/**
 *
 * @author Lenovo
 */
public interface contabilidad_mensualDao extends CrudRepository<contabilidad_mensual, Integer> {
    // Método para obtener todas las entradas de contabilidad de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM contabilidad_mensual WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<contabilidad_mensual> findByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener una entrada de contabilidad por su código
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM contabilidad_mensual WHERE cod_contabilidad = :codContabilidad", nativeQuery = true)
    public contabilidad_mensual findContById(@Param("codContabilidad") Integer codContabilidad);

    // Método para obtener las entradas de contabilidad dentro de un rango de fechas
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM contabilidad_mensual WHERE fecha_inicio >= :fechaInicio AND fecha_fin <= :fechaFin", nativeQuery = true)
    public List<contabilidad_mensual> findByFechaRange(@Param("fechaInicio") String fechaInicio, @Param("fechaFin") String fechaFin);

    // Método para obtener las entradas con ganancia estimada mayor a un valor específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM contabilidad_mensual WHERE ganacia_estimada > :ganancia", nativeQuery = true)
    public List<contabilidad_mensual> findByGananciaEstimadaGreaterThan(@Param("ganancia") Double ganancia);
    
}
