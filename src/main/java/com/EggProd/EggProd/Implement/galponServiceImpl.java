/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.galpon;
import com.EggProd.EggProd.Dao.galponDao;
import com.EggProd.EggProd.service.galponService;
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
public class galponServiceImpl implements galponService{
    
    @Autowired
    private galponDao galponDao;

    @Override
    @Transactional(readOnly = false)
    public galpon save(galpon galpon) {
        return galponDao.save(galpon);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        galponDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public galpon findById(Integer id) {
        return galponDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<galpon> findByAll() {
        return (List<galpon>) galponDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<galpon> findByUsuario(String usuario) {
        return (List<galpon>) galponDao.findGalponesByUsuario(usuario);
    }
    
    
}
