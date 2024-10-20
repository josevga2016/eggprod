/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.vacunaciones;
import com.EggProd.EggProd.Dao.vacunacionesDao;
import com.EggProd.EggProd.service.vacunacionesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class vacunacionesServiceImpl implements vacunacionesService{
    
    @Autowired
    private vacunacionesDao vacunacionesDao;

    @Override
    @Transactional(readOnly = false)
    public vacunaciones save(vacunaciones vacunacion) {
        return vacunacionesDao.save(vacunacion);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        vacunacionesDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public vacunaciones findById(Integer id) {
        return vacunacionesDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<vacunaciones> findByAll() {
        return (List<vacunaciones>) vacunacionesDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<vacunaciones> findByGalpon(Integer codGalpon) {
        return (List<vacunaciones>) vacunacionesDao.findVacunacionesByGalpon(codGalpon);
    }

    @Override
    public List<vacunaciones> findVacunacionesByEnfermedad(String enfermedad, Integer codGalpon) {
        return (List<vacunaciones>) vacunacionesDao.findVacunacionesByEnfermedad(enfermedad, codGalpon);
    }
    
}
