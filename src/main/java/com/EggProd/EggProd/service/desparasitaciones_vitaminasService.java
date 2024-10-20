/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.desparasitaciones_vitaminas;
import java.util.List;


/**
 *
 * @author Lenovo
 */
public interface desparasitaciones_vitaminasService {
    
        // Método para guardar o actualizar una desparasitacion o vitaminización
    public desparasitaciones_vitaminas save(desparasitaciones_vitaminas desparasitacion);
    
    // Método para eliminar una desparasitacion o vitaminización por su ID
    public void delete(Integer id);
    
    // Método para encontrar una desparasitacion o vitaminización por su ID
    public desparasitaciones_vitaminas findById(Integer id);
    
    // Método para encontrar todas las desparasitaciones y vitaminizaciones
    public List<desparasitaciones_vitaminas> findByAll();
    
    // Método para encontrar todas las desparasitaciones y vitaminizaciones asociadas a un galpón
    public List<desparasitaciones_vitaminas> findByGalpon(Integer codGalpon);
    
    // Método para encontrar todas las desparasitaciones y vitaminizaciones asociadas a un galpón
    public List<desparasitaciones_vitaminas> findDesparasitacionesByGalpon(Integer codGalpon);
    
    // Método para encontrar todas las desparasitaciones y vitaminizaciones asociadas a un galpón
    public List<desparasitaciones_vitaminas> findVitaminizacionesByGalpon(Integer codGalpon);
}
