/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.models;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Table
@Entity(name = "desparasitaciones_vitaminas")
public class desparasitaciones_vitaminas implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod_desp")
    private int cod_desp;
    //@ManyToOne
    @JoinColumn (name="cod_galpon")
    private int cod_galpon;
    @Column (name="nombre_numero_galpon")
    private String nombre_numero_galpon;
    @Column (name="tipo")
    private String tipo;
    @Column (name="nombre_producto")
    private String nombre_producto;
    @Column (name="dosis_aplicadas")
    private int dosis_aplicadas;
    @Column (name="fecha_aplicacion")
    private Date fecha_aplicacion;
    @Column (name="observaciones")
    private String observaciones;

    public desparasitaciones_vitaminas() {
    }

    public desparasitaciones_vitaminas(int cod_desp, int cod_galpon, String nombre_numero_galpon, String tipo, String nombre_producto, int dosis_aplicadas, Date fecha_aplicacion, String observaciones) {
        this.cod_desp = cod_desp;
        this.cod_galpon = cod_galpon;
        this.nombre_numero_galpon = nombre_numero_galpon;
        this.tipo = tipo;
        this.nombre_producto = nombre_producto;
        this.dosis_aplicadas = dosis_aplicadas;
        this.fecha_aplicacion = fecha_aplicacion;
        this.observaciones = observaciones;
    }

    public int getCod_desp() {
        return cod_desp;
    }

    public void setCod_desp(int cod_desp) {
        this.cod_desp = cod_desp;
    }

    public int getCod_galpon() {
        return cod_galpon;
    }

    public void setCod_galpon(int cod_galpon) {
        this.cod_galpon = cod_galpon;
    }

    public String getNombre_numero_galpon() {
        return nombre_numero_galpon;
    }

    public void setNombre_numero_galpon(String nombre_numero_galpon) {
        this.nombre_numero_galpon = nombre_numero_galpon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getDosis_aplicadas() {
        return dosis_aplicadas;
    }

    public void setDosis_aplicadas(int dosis_aplicadas) {
        this.dosis_aplicadas = dosis_aplicadas;
    }

    public Date getFecha_aplicacion() {
        return fecha_aplicacion;
    }

    public void setFecha_aplicacion(Date fecha_aplicacion) {
        this.fecha_aplicacion = fecha_aplicacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
