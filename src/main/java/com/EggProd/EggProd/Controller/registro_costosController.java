/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Controller;

import com.EggProd.EggProd.models.registro_costos;
import com.EggProd.EggProd.service.registro_costosService;
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
@RequestMapping("/api/registro_costos")
public class registro_costosController {

    @Autowired
    private registro_costosService registro_costosService;

    // Método para guardar o actualizar un registro de costos
    @PostMapping("/save")
    public ResponseEntity<registro_costos> save(@RequestBody registro_costos registroCostos) {
        registro_costos savedRegistroCostos = registro_costosService.save(registroCostos);
        return new ResponseEntity<>(savedRegistroCostos, HttpStatus.CREATED);
    }

    // Método para eliminar un registro de costos por su ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        registro_costosService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Método para encontrar un registro de costos por su ID
    @GetMapping("/findById/{id}")
    public ResponseEntity<registro_costos> findById(@PathVariable("id") Integer id) {
        registro_costos registroCostos = registro_costosService.findById(id);
        return registroCostos != null ? new ResponseEntity<>(registroCostos, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Método para obtener todos los registros de costos
    @GetMapping("/findAll")
    public ResponseEntity<List<registro_costos>> findByAll() {
        List<registro_costos> registroCostosList = registro_costosService.findByAll();
        return new ResponseEntity<>(registroCostosList, HttpStatus.OK);
    }

    // Método para obtener todos los registros de costos asociados a un galpón
    @GetMapping("/findByGalpon/{codGalpon}")
    public ResponseEntity<List<registro_costos>> findByGalpon(@PathVariable("codGalpon") Integer codGalpon) {
        List<registro_costos> registroCostosList = registro_costosService.findByGalpon(codGalpon);
        return new ResponseEntity<>(registroCostosList, HttpStatus.OK);
    }

    // Método para obtener los costos en una fecha específica para un galpón
    @GetMapping("/findByFecha/{fechaCosto}/{codGalpon}")
    public ResponseEntity<List<registro_costos>> findCostosByFecha(
            @PathVariable("fechaCosto") String fechaCosto, 
            @PathVariable("codGalpon") Integer codGalpon) {
        List<registro_costos> registroCostosList = registro_costosService.findCostosByFecha(fechaCosto, codGalpon);
        return new ResponseEntity<>(registroCostosList, HttpStatus.OK);
    }
}

