/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.service;

import com.EggProd.EggProd.models.usuario;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface usuarioService {
    public usuario save (usuario usuario);
    public void delete (String id);
    public usuario findById (String id);
    public List<usuario> findByAll ();    
    public usuario login (String usuario, String contraseña);
}
