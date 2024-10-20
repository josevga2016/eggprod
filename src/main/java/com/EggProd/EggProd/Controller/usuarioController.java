/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Controller;

import com.EggProd.EggProd.models.usuario;
import com.EggProd.EggProd.service.usuarioService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Lenovo
 */

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class usuarioController {
    @Autowired
    private usuarioService usuarioService;
    
    @PostMapping(value = "/")
    public ResponseEntity<usuario> agregar (@RequestBody usuario usuario){
        usuario obj = usuarioService.save (usuario);
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    
    
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<usuario> eliminar(@PathVariable String id){ 
        usuario obj = usuarioService.findById(id); 
        if(obj!=null) 
            usuarioService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @PutMapping(value="/") 
    public ResponseEntity<usuario> editar(@RequestBody usuario usuario){ 
        usuario obj = usuarioService.findById(usuario.getUsuario()); 
        if(obj!=null) {
            obj.setNombre_pila(usuario.getNombre_pila());
            obj.setContraseña(usuario.getContraseña());
            usuarioService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @GetMapping("/list")
    public List<usuario> consultarTodo(){
        return usuarioService.findByAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public usuario consultaPorId(@PathVariable String id){ 
        return usuarioService.findById(id); 
    }
    
    @GetMapping("/login") 
    public usuario login(@RequestParam("usuario") String usuario,@RequestParam("contraseña") String contraseña){ 
        return usuarioService.login(usuario, contraseña); 
    }




}
