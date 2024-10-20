/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.registro_ventas;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface registro_ventasService {
    
    // Método para guardar o actualizar un registro de venta
    public registro_ventas save(registro_ventas registroVentas);
    
    // Método para eliminar un registro de venta por su ID
    public void delete(Integer id);
    
    // Método para encontrar un registro de venta por su ID
    public registro_ventas findById(Integer id);
    
    // Método para encontrar todos los registros de ventas
    public List<registro_ventas> findByAll();
    
    // Método para encontrar todas las ventas asociadas a un galpón
    public List<registro_ventas> findByGalpon(Integer codGalpon);
    
    // Método para encontrar todas las ventas asociadas a una fecha
    public List<registro_ventas> findVentasByFecha(String fechaVenta,Integer codGalpon);
    
}
