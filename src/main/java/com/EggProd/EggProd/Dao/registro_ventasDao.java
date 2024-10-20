/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Dao;
import com.EggProd.EggProd.models.registro_ventas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface registro_ventasDao extends CrudRepository<registro_ventas, Integer> {
    
    // Método para obtener todas las ventas de un galpón específico
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM registro_ventas WHERE cod_galpon = :codGalpon", nativeQuery = true)
    public List<registro_ventas> findVentasByGalpon(@Param("codGalpon") Integer codGalpon);

    // Método para obtener las ventas en una fecha específica
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM registro_ventas WHERE fecha_venta = :fechaVenta AND cod_galpon = :codGalpon", nativeQuery = true)
    public List<registro_ventas> findVentasByFecha(@Param("fechaVenta") String fechaVenta, @Param("codGalpon") Integer codGalpon);

    // Método para obtener una venta por su código
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM registro_ventas WHERE cod_venta = :codVenta", nativeQuery = true)
    public registro_ventas findVentaById(@Param("codVenta") Integer codVenta);
    
}
