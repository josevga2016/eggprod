/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.galpon;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface galponService {
    // Método para guardar o actualizar un galpón
    public galpon save(galpon galpon);
    
    // Método para eliminar un galpón por su ID
    public void delete(Integer id);
    
    // Método para encontrar un galpón por su ID
    public galpon findById(Integer id);
    
    // Método para encontrar todos los galpones
    public List<galpon> findByAll();
    
    // Método para encontrar todos los galpones asociados a un usuario
    public List<galpon> findByUsuario(String usuario);
    
}
