/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;

import com.EggProd.EggProd.models.usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lenovo
 */
public interface usuarioDao extends CrudRepository<usuario, String>{
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM usuario WHERE usuario =: usuario AND contraseña =: contraseña",nativeQuery = true)
    public usuario login (@Param("usuario") String usuario, @Param("contraseña") String contraseña);
    
}
