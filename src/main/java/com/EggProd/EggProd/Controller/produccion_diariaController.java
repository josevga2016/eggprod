/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Controller;

import com.EggProd.EggProd.models.produccion_diaria;
import com.EggProd.EggProd.service.produccion_diariaService;
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
@RequestMapping("/api/produccion_diaria")
public class produccion_diariaController {

    @Autowired
    private produccion_diariaService produccion_diariaService;

    // Método para guardar o actualizar un registro de producción diaria
    @PostMapping("/save")
    public ResponseEntity<produccion_diaria> save(@RequestBody produccion_diaria produccionDiaria) {
        produccion_diaria savedProduccion = produccion_diariaService.save(produccionDiaria);
        return new ResponseEntity<>(savedProduccion, HttpStatus.CREATED);
    }

    // Método para eliminar un registro de producción diaria por su ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        produccion_diariaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Método para encontrar un registro de producción diaria por su ID
    @GetMapping("/findById/{id}")
    public ResponseEntity<produccion_diaria> findById(@PathVariable("id") Integer id) {
        produccion_diaria produccion = produccion_diariaService.findById(id);
        return produccion != null ? new ResponseEntity<>(produccion, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Método para obtener todos los registros de producción diaria
    @GetMapping("/findAll")
    public ResponseEntity<List<produccion_diaria>> findByAll() {
        List<produccion_diaria> producciones = produccion_diariaService.findByAll();
        return new ResponseEntity<>(producciones, HttpStatus.OK);
    }

    // Método para encontrar todos los registros de producción diaria asociados a un galpón
    @GetMapping("/findByGalpon/{codGalpon}")
    public ResponseEntity<List<produccion_diaria>> findByGalpon(@PathVariable("codGalpon") Integer codGalpon) {
        List<produccion_diaria> producciones = produccion_diariaService.findByGalpon(codGalpon);
        return new ResponseEntity<>(producciones, HttpStatus.OK);
    }
}

