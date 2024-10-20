/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.produccion_diaria;
import com.EggProd.EggProd.Dao.produccion_diariaDao;
import com.EggProd.EggProd.service.produccion_diariaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;
/**

/**
 *
 * @author Lenovo
 */
@Service
public class produccion_diariaServiceImpl implements produccion_diariaService {
    @Autowired
    private produccion_diariaDao produccion_diariaDao;

    @Override
    @Transactional(readOnly = false)
    public produccion_diaria save(produccion_diaria produccionDiaria) {
        return produccion_diariaDao.save(produccionDiaria);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        produccion_diariaDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public produccion_diaria findById(Integer id) {
        return produccion_diariaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<produccion_diaria> findByAll() {
        return (List<produccion_diaria>) produccion_diariaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<produccion_diaria> findByGalpon(Integer codGalpon) {
        return  (List<produccion_diaria>) produccion_diariaDao.findProduccionDiariaByGalpon(codGalpon);
    }
    
}
