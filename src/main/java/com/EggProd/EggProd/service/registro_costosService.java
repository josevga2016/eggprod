/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.registro_costos;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface registro_costosService {
    // Método para guardar o actualizar un registro de costos
    public registro_costos save(registro_costos registroCostos);
    
    // Método para eliminar un registro de costos por su ID
    public void delete(Integer id);
    
    // Método para encontrar un registro de costos por su ID
    public registro_costos findById(Integer id);
    
    // Método para encontrar todos los registros de costos
    public List<registro_costos> findByAll();
    
    // Método para encontrar todos los registros de costos asociados a un galpón
    public List<registro_costos> findByGalpon(Integer codGalpon);
    
    public List<registro_costos> findCostosByFecha(String fechaCosto,Integer codGalpon);

}
