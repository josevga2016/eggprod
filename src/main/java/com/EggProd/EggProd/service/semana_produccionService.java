/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.semana_produccion;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface semana_produccionService {
    // Método para guardar o actualizar una semana de producción
    public semana_produccion save(semana_produccion semanaProduccion);
    
    // Método para eliminar una semana de producción por su ID
    public void delete(Integer id);
    
    // Método para encontrar una semana de producción por su ID
    public semana_produccion findById(Integer id);
    
    // Método para encontrar todas las semanas de producción
    public List<semana_produccion> findByAll();
    
    // Método para encontrar todas las semanas de producción asociadas a un galpón
    public List<semana_produccion> findByGalpon(Integer codGalpon);
    
}
