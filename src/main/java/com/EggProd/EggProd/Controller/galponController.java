/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.Controller;

import com.EggProd.EggProd.models.galpon;
import com.EggProd.EggProd.service.galponService;
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
@RequestMapping("/galpon")
public class galponController {
    
    @Autowired
    private galponService galponService;

    // Método para agregar un nuevo galpón
    @PostMapping(value = "/")
    public ResponseEntity<galpon> agregar(@RequestBody galpon galpon) {
        galpon obj = galponService.save(galpon);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    // Método para eliminar un galpón por su ID
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<galpon> eliminar(@PathVariable Integer id) {
        galpon obj = galponService.findById(id);
        if (obj != null) {
            galponService.delete(id);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    // Método para actualizar un galpón existente
    @PutMapping(value = "/")
    public ResponseEntity<galpon> editar(@RequestBody galpon galpon) {
        galpon obj = galponService.findById(galpon.getCod_galpon());
        if (obj != null) {
            obj.setNombre_numero(galpon.getNombre_numero());
            obj.setRaza(galpon.getRaza());
            obj.setFecha_ingreso(galpon.getFecha_ingreso());
            obj.setFecha_inicio_produccion(galpon.getFecha_inicio_produccion());
            obj.setEdad_ingreso(galpon.getEdad_ingreso());
            obj.setCantidad_inicial(galpon.getCantidad_inicial());
            galponService.save(obj);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    // Método para obtener la lista de todos los galpones
    @GetMapping("/list")
    public List<galpon> consultarTodo() {
        return galponService.findByAll();
    }

    // Método para obtener un galpón por su ID
    @GetMapping("/list/{id}")
    public galpon consultaPorId(@PathVariable Integer id) {
        return galponService.findById(id);
    }

    // Método para obtener todos los galpones de un usuario específico
    @GetMapping("/usuario/{usuario}")
    public List<galpon> consultarPorUsuario(@PathVariable String usuario) {
        return galponService.findByUsuario(usuario);
    }
}
