/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;

import com.EggProd.EggProd.models.despiques;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface despiquesDao extends CrudRepository <despiques, Integer> {
    // Método para obtener todos los despique de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM despiques WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<despiques> findDespiquesByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener un despique por su código
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM despiques WHERE cod_despique = :codDespique", nativeQuery = true)
    public despiques findDespiqueById(@Param("codDespique") Integer codDespique);
    
}
