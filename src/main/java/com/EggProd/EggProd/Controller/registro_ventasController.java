/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Controller;

import com.EggProd.EggProd.models.registro_ventas;
import com.EggProd.EggProd.service.registro_ventasService;
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
@RequestMapping("/api/ventas")
public class registro_ventasController {

    @Autowired
    private registro_ventasService registroVentasService;

    // Obtener todas las ventas
    @GetMapping("/all")
    public List<registro_ventas> findAllVentas() {
        return registroVentasService.findByAll();
    }

    // Obtener una venta por su ID
    @GetMapping("/{id}")
    public ResponseEntity<registro_ventas> getVentaById(@PathVariable("id") Integer id) {
        registro_ventas venta = registroVentasService.findById(id);
        if (venta != null) {
            return new ResponseEntity<>(venta, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Guardar una nueva venta o actualizar una existente
    @PostMapping("/save")
    public ResponseEntity<registro_ventas> saveVenta(@RequestBody registro_ventas registroVentas) {
        return new ResponseEntity<>(registroVentasService.save(registroVentas), HttpStatus.CREATED);
    }

    // Eliminar una venta por su ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<registro_ventas> deleteVenta(@PathVariable("id") Integer id) {
        registro_ventas venta = registroVentasService.findById(id);
        if (venta != null) {
            registroVentasService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Obtener todas las ventas de un galpón específico
    @GetMapping("/galpon/{codGalpon}")
    public List<registro_ventas> findVentasByGalpon(@PathVariable("codGalpon") Integer codGalpon) {
        return registroVentasService.findByGalpon(codGalpon);
    }

    // Obtener las ventas de un galpón en una fecha específica
    @GetMapping("/fecha")
    public List<registro_ventas> findVentasByFecha(@RequestParam("fecha") String fechaVenta, @RequestParam("codGalpon") Integer codGalpon) {
        return registroVentasService.findVentasByFecha(fechaVenta, codGalpon);
    }
}
