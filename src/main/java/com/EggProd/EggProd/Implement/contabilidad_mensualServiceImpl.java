/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.contabilidad_mensual;
import com.EggProd.EggProd.Dao.contabilidad_mensualDao;
import com.EggProd.EggProd.service.contabilidad_mensualService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class contabilidad_mensualServiceImpl implements contabilidad_mensualService{
    
    @Autowired
    private contabilidad_mensualDao contabilidad_mensualDao;

    @Override
    @Transactional(readOnly = false)
    public contabilidad_mensual save(contabilidad_mensual contabilidad) {
        return contabilidad_mensualDao.save(contabilidad);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        contabilidad_mensualDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public contabilidad_mensual findById(Integer id) {
        return contabilidad_mensualDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<contabilidad_mensual> findByAll() {
        return (List<contabilidad_mensual>) contabilidad_mensualDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<contabilidad_mensual> findByGalpon(Integer codGalpon) {
        return (List<contabilidad_mensual>) contabilidad_mensualDao.findByGalpon(codGalpon);
    }

    @Override
    @Transactional(readOnly = true)
    public List<contabilidad_mensual> findByFechaRange(String fechaInicio, String fechaFin) {
        return (List<contabilidad_mensual>) contabilidad_mensualDao.findByFechaRange(fechaInicio, fechaFin);
    }

    @Override
    @Transactional(readOnly = true)
    public List<contabilidad_mensual> findByGananciaEstimadaGreaterThan(Double ganancia) {
        return (List<contabilidad_mensual>) contabilidad_mensualDao.findByGananciaEstimadaGreaterThan(ganancia);
    }
    
}
