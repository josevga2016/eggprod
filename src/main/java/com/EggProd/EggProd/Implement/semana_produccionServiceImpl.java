/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;


import com.EggProd.EggProd.models.semana_produccion;
import com.EggProd.EggProd.Dao.semana_produccionDao;
import com.EggProd.EggProd.service.semana_produccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;
/**
 *
 * @author Lenovo
 */
@Service
public class semana_produccionServiceImpl implements semana_produccionService{
    @Autowired
    private semana_produccionDao semana_produccionDao;

    @Override
    @Transactional(readOnly = false)
    public semana_produccion save(semana_produccion semanaProduccion) {
         return semana_produccionDao.save(semanaProduccion);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
         semana_produccionDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public semana_produccion findById(Integer id) {
        return semana_produccionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<semana_produccion> findByAll() {
        return (List<semana_produccion>) semana_produccionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<semana_produccion> findByGalpon(Integer codGalpon) {
        return (List<semana_produccion>) semana_produccionDao.findSemanasByGalpon(codGalpon);
    }

    
}
