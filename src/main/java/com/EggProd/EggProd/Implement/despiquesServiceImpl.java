/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.despiques;
import com.EggProd.EggProd.Dao.despiquesDao;
import com.EggProd.EggProd.service.despiquesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class despiquesServiceImpl implements despiquesService{
    @Autowired
    private despiquesDao despiquesDao;

    @Override
    @Transactional(readOnly = false)
    public despiques save(despiques despiques) {
        return despiquesDao.save(despiques);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        despiquesDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public despiques findById(Integer id) {
        return despiquesDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<despiques> findByAll() {
        return (List<despiques>) despiquesDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<despiques> findDespiquesByGalpon(Integer codGalpon) {
        return (List<despiques>) despiquesDao.findDespiquesByGalpon(codGalpon);
    }
    
}
