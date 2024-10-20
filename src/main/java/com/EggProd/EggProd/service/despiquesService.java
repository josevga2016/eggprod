/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.despiques;
import java.util.List;


/**
 *
 * @author Lenovo
 */
public interface despiquesService {
    
    // Método para guardar o actualizar un despique
    public despiques save(despiques despiques);
    
    // Método para eliminar un despique por su ID
    public void delete(Integer id);
    
    // Método para encontrar un despique por su ID
    public despiques findById(Integer id);
    
    // Método para encontrar todos los despiques
    public List<despiques> findByAll();
    
    // Método para encontrar todos los despiques asociados a un galpón
    public List<despiques> findDespiquesByGalpon(Integer codGalpon);
    
}
