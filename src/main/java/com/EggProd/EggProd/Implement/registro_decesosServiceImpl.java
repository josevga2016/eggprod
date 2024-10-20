/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.registro_decesos;
import com.EggProd.EggProd.Dao.registro_decesosDao;
import com.EggProd.EggProd.service.registro_decesosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class registro_decesosServiceImpl implements registro_decesosService{
    @Autowired
    private registro_decesosDao registro_decesosDao;

    @Override
    @Transactional(readOnly = false)
    public registro_decesos save(registro_decesos registroDecesos) {
        return registro_decesosDao.save(registroDecesos);
    }

    @Override
     @Transactional(readOnly = false)
    public void delete(Integer id) {
        registro_decesosDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public registro_decesos findById(Integer id) {
        return registro_decesosDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<registro_decesos> findByAll() {
        return (List<registro_decesos>) registro_decesosDao.findAll();        
    }

    @Override
    @Transactional(readOnly = true)
    public List<registro_decesos> findByGalpon(Integer codGalpon) {
        return (List<registro_decesos>) registro_decesosDao.findDecesosByGalpon(codGalpon);
    }

    @Override
    @Transactional(readOnly = true)
    public List<registro_decesos> findDecesosByFecha(String fechaDeceso, Integer codGalpon) {
        return (List<registro_decesos>) registro_decesosDao.findDecesosByFecha(fechaDeceso, codGalpon);
    }
    
}
