/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.contabilidad_mensual;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface contabilidad_mensualService {
    
    // Método para guardar o actualizar una entrada de contabilidad
    public contabilidad_mensual save(contabilidad_mensual contabilidad);

    // Método para eliminar una entrada de contabilidad por su ID
    public void delete(Integer id);

    // Método para encontrar una entrada de contabilidad por su ID
    public contabilidad_mensual findById(Integer id);

    // Método para encontrar todas las entradas de contabilidad
    public List<contabilidad_mensual> findByAll();

    // Método para encontrar todas las entradas de contabilidad de un galpón
    public List<contabilidad_mensual> findByGalpon(Integer codGalpon);

    // Método para encontrar entradas de contabilidad dentro de un rango de fechas
    public List<contabilidad_mensual> findByFechaRange(String fechaInicio, String fechaFin);

    // Método para encontrar entradas con ganancia estimada mayor a un valor
    public List<contabilidad_mensual> findByGananciaEstimadaGreaterThan(Double ganancia);
}
