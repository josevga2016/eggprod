/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;

import com.EggProd.EggProd.models.galpon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface galponDao extends CrudRepository<galpon, Integer>{
    // Método para obtener todos los galpones de un usuario específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM galpon WHERE usuario = :usuario", nativeQuery = true)
    public List<galpon> findGalponesByUsuario(@Param("usuario") String usuario);
    
}
