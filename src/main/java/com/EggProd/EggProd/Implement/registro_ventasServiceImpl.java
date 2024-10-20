/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.registro_ventas;
import com.EggProd.EggProd.Dao.registro_ventasDao;
import com.EggProd.EggProd.service.registro_ventasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class registro_ventasServiceImpl implements registro_ventasService{
    
    @Autowired
    private registro_ventasDao registro_ventasDao;

    @Override
    @Transactional(readOnly = false)
    public registro_ventas save(registro_ventas registroVentas) {
        return registro_ventasDao.save(registroVentas);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        registro_ventasDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public registro_ventas findById(Integer id) {
         return registro_ventasDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<registro_ventas> findByAll() {
         return (List<registro_ventas>) registro_ventasDao.findAll();
    }
    

    @Override
    @Transactional(readOnly = true)
    public List<registro_ventas> findByGalpon(Integer codGalpon) {
        return (List<registro_ventas>) registro_ventasDao.findVentasByGalpon(codGalpon);
    }

    @Override
    public List<registro_ventas> findVentasByFecha(String fechaVenta, Integer codGalpon) {
        return (List<registro_ventas>) registro_ventasDao.findVentasByFecha(fechaVenta,codGalpon);
    }


    
    
}
