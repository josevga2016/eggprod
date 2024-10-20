/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;

import com.EggProd.EggProd.models.notificaciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface notificacionesDao extends CrudRepository<notificaciones, Integer>{
    // Método para obtener todas las notificaciones de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM notificaciones WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<notificaciones> findNotificacionesByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener una notificación por su código
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM notificaciones WHERE cod_notificacion = :codNotificacion", nativeQuery = true)
    public notificaciones findNotificacionById(@Param("codNotificacion") Integer codNotificacion);

    // Método para obtener notificaciones por tipo
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM notificaciones WHERE tipo = :tipo AND cod_galpon = :codGalpon", nativeQuery = true)
    public List<notificaciones> findNotificacionesByTipo(@Param("tipo") String tipo, @Param("codGalpon") Integer codGalpon);
    
}
