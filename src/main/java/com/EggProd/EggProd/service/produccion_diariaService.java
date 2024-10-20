/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.produccion_diaria;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface produccion_diariaService {
    
    // Método para guardar o actualizar un registro de producción diaria
    public produccion_diaria save(produccion_diaria produccionDiaria);
    
    // Método para eliminar un registro de producción diaria por su ID
    public void delete(Integer id);
    
    // Método para encontrar un registro de producción diaria por su ID
    public produccion_diaria findById(Integer id);
    
    // Método para encontrar todos los registros de producción diaria
    public List<produccion_diaria> findByAll();
    
    // Método para encontrar todos los registros de producción diaria asociados a un galpón
    public List<produccion_diaria> findByGalpon(Integer codGalpon);
    
}
