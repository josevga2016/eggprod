/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.indicadores;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface indicadoresService {
    
    // Método para guardar o actualizar un indicador
    public indicadores save(indicadores indicador);
    
    // Método para eliminar un indicador por su ID
    public void delete(Integer id);
    
    // Método para encontrar un indicador por su ID
    public indicadores findById(Integer id);
    
    // Método para encontrar todos los indicadores
    public List<indicadores> findByAll();
    
    // Método para encontrar todos los indicadores asociados a un galpón
    public List<indicadores> findByGalpon(Integer codGalpon);
    
}
