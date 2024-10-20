/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Implement;

import com.EggProd.EggProd.models.usuario;
import com.EggProd.EggProd.Dao.usuarioDao;
import com.EggProd.EggProd.service.usuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation. Transactional;
import org.springframework.stereotype.Service;
/**
 *
 * @author Lenovo
 */
@Service
public class usuarioServiceImpl implements usuarioService{
    @Autowired
    private usuarioDao usuarioDao;

    @Override
    @Transactional(readOnly = false)
    public usuario save(usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String id) {
        usuarioDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public usuario findById(String id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<usuario> findByAll() {
        return (List<usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public usuario login(String usuario, String contraseña) {
        return usuarioDao.login(usuario, contraseña);
    }
    
}
