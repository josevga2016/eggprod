/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.registro_costos;
import com.EggProd.EggProd.Dao.registro_costosDao;
import com.EggProd.EggProd.service.registro_costosService;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class registro_costosServiceImpl implements registro_costosService{
    @Autowired
    private registro_costosDao registro_costosDao;

    @Override
    @Transactional(readOnly = false)
    public registro_costos save(registro_costos registroCostos) {
        return registro_costosDao.save(registroCostos);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        registro_costosDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public registro_costos findById(Integer id) {
        return registro_costosDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<registro_costos> findByAll() {
        return (List<registro_costos>) registro_costosDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<registro_costos> findByGalpon(Integer codGalpon) {
         return (List<registro_costos>) registro_costosDao.findCostosByGalpon(codGalpon);
    }

    @Override
    @Transactional(readOnly = true)
    public List<registro_costos> findCostosByFecha(String fechaCosto, Integer codGalpon) {
        return (List<registro_costos>) registro_costosDao.findCostosByFecha(fechaCosto,codGalpon);
    }

    
    
}
