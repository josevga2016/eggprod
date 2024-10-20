/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.registro_decesos;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface registro_decesosService {
    
    // Método para guardar o actualizar un registro de decesos
    public registro_decesos save(registro_decesos registroDecesos);
    
    // Método para eliminar un registro de decesos por su ID
    public void delete(Integer id);
    
    // Método para encontrar un registro de decesos por su ID
    public registro_decesos findById(Integer id);
    
    // Método para encontrar todos los registros de decesos
    public List<registro_decesos> findByAll();
    
    // Método para encontrar todos los decesos asociados a un galpón
    public List<registro_decesos> findByGalpon(Integer codGalpon);
    
    // Métodos adicionales
    public List<registro_decesos> findDecesosByFecha(String fechaDeceso, Integer codGalpon);
    
}
