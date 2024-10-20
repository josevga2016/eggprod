/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.desparasitaciones_vitaminas;
import com.EggProd.EggProd.Dao.desparasitaciones_vitaminasDao;
import com.EggProd.EggProd.service.desparasitaciones_vitaminasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class desparasitaciones_vitaminasServiceImpl implements desparasitaciones_vitaminasService{
    @Autowired
    private desparasitaciones_vitaminasDao desparasitaciones_vitaminasDao;

    @Override
    @Transactional(readOnly = false)
    public desparasitaciones_vitaminas save(desparasitaciones_vitaminas desparasitacion) {
        return desparasitaciones_vitaminasDao.save(desparasitacion);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        desparasitaciones_vitaminasDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public desparasitaciones_vitaminas findById(Integer id) {
        return desparasitaciones_vitaminasDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<desparasitaciones_vitaminas> findByAll() {
         return (List<desparasitaciones_vitaminas>) desparasitaciones_vitaminasDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<desparasitaciones_vitaminas> findByGalpon(Integer codGalpon) {
        return (List<desparasitaciones_vitaminas>) desparasitaciones_vitaminasDao.findByGalpon(codGalpon);
    }

    @Override
    @Transactional(readOnly = true)
    public List<desparasitaciones_vitaminas> findDesparasitacionesByGalpon(Integer codGalpon) {
        return (List<desparasitaciones_vitaminas>) desparasitaciones_vitaminasDao.findDesparasitacionesByGalpon(codGalpon);
    }

    @Override
    @Transactional(readOnly = true)
    public List<desparasitaciones_vitaminas> findVitaminizacionesByGalpon(Integer codGalpon) {
         return (List<desparasitaciones_vitaminas>) desparasitaciones_vitaminasDao.findVitaminizacionesByGalpon(codGalpon);
    }
    
}
