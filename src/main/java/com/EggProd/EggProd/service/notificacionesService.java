/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.notificaciones;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface notificacionesService {
    
    
    // Método para guardar o actualizar una notificación
    public notificaciones save(notificaciones notificacion);
    
    // Método para eliminar una notificación por su ID
    public void delete(Integer id);
    
    // Método para encontrar una notificación por su ID
    public notificaciones findById(Integer id);
    
    // Método para encontrar todas las notificaciones
    public List<notificaciones> findByAll();
    
    // Método para encontrar todas las notificaciones asociadas a un galpón
    public List<notificaciones> findByGalpon(Integer codGalpon);
    
    // Método para encontrar todas las notificaciones por tipo
    public List<notificaciones> findNotificacionesByTipo(String tipo,Integer codGalpon);
    
}
