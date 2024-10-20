/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.vacunaciones;
import java.util.List;
/**
 *
 * @author Lenovo
 */
public interface vacunacionesService {
    // Método para guardar o actualizar una vacunación
    public vacunaciones save(vacunaciones vacunacion);
    
    // Método para eliminar una vacunación por su ID
    public void delete(Integer id);
    
    // Método para encontrar una vacunación por su ID
    public vacunaciones findById(Integer id);
    
    // Método para encontrar todas las vacunaciones
    public List<vacunaciones> findByAll();
    
    // Método para encontrar todas las vacunaciones asociadas a un galpón
    public List<vacunaciones> findByGalpon(Integer codGalpon);
    
    // Método para encontrar todas las vacunaciones asociadas a un galpón
    public List<vacunaciones> findVacunacionesByEnfermedad(String enfermedad,Integer codGalpon);
}
