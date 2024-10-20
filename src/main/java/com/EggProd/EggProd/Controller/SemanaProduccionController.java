/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Controller;


import com.EggProd.EggProd.models.semana_produccion;
import com.EggProd.EggProd.service.semana_produccionService;
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
@RequestMapping("/api/semana-produccion")
public class SemanaProduccionController {

    @Autowired
    private semana_produccionService semanaProduccionService;

    // Guardar o actualizar una semana de producción
    @PostMapping("/save")
    public ResponseEntity<semana_produccion> save(@RequestBody semana_produccion semanaProduccion) {
        semana_produccion nuevaSemanaProduccion = semanaProduccionService.save(semanaProduccion);
        return new ResponseEntity<>(nuevaSemanaProduccion, HttpStatus.CREATED);
    }

    // Eliminar una semana de producción por su ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        semanaProduccionService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Encontrar una semana de producción por su ID
    @GetMapping("/find/{id}")
    public ResponseEntity<semana_produccion> findById(@PathVariable Integer id) {
        semana_produccion semanaProduccion = semanaProduccionService.findById(id);
        if (semanaProduccion != null) {
            return new ResponseEntity<>(semanaProduccion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Obtener todas las semanas de producción
    @GetMapping("/all")
    public ResponseEntity<List<semana_produccion>> findAll() {
        List<semana_produccion> listaSemanas = semanaProduccionService.findByAll();
        return new ResponseEntity<>(listaSemanas, HttpStatus.OK);
    }

    // Obtener todas las semanas de producción de un galpón específico
    @GetMapping("/galpon/{codGalpon}")
    public ResponseEntity<List<semana_produccion>> findByGalpon(@PathVariable Integer codGalpon) {
        List<semana_produccion> semanasPorGalpon = semanaProduccionService.findByGalpon(codGalpon);
        return new ResponseEntity<>(semanasPorGalpon, HttpStatus.OK);
    }
}
