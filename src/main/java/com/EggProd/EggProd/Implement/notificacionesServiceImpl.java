/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.notificaciones;
import com.EggProd.EggProd.Dao.notificacionesDao;
import com.EggProd.EggProd.service.notificacionesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;
/**
 *
 * @author Lenovo
 */
@Service
public class notificacionesServiceImpl implements notificacionesService{
    @Autowired
    private notificacionesDao notificacionesDao;

    @Override
    @Transactional(readOnly = false)
    public notificaciones save(notificaciones notificacion) {
        return notificacionesDao.save(notificacion);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        notificacionesDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public notificaciones findById(Integer id) {
        return notificacionesDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<notificaciones> findByAll() {
        return (List<notificaciones>) notificacionesDao.findAll();
    }

    @Override
    public List<notificaciones> findByGalpon(Integer codGalpon) {
        return (List<notificaciones>)notificacionesDao.findNotificacionesByGalpon(codGalpon);
    }

    @Override
    public List<notificaciones> findNotificacionesByTipo(String tipo, Integer codGalpon) {
        return (List<notificaciones>)notificacionesDao.findNotificacionesByTipo(tipo,codGalpon);
    }
    
}
