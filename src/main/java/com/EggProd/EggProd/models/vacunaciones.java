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
@Entity(name = "vacunaciones")
public class vacunaciones implements  Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod_vacunacion")
    private int cod_vacunacion;
    @ManyToOne
    @JoinColumn (name="cod_galpon")
    private int cod_galpon;
    @Column (name="nombre_numero_galpon")
    private String nombre_numero_galpon;
    @Column (name="enfermedad")
    private String enfermedad;
    @Column (name="nombre_vacuna")
    private String nombre_vacuna;
    @Column (name="laboratorio")
    private String laboratorio;
    @Column (name="dosis_aplicadas")
    private int dosis_aplicadas;
    @Column (name="fecha_vacunacion")
    private Date fecha_vacunacion;
    @Column (name="observaciones")
    private String observaciones;

    public vacunaciones() {
    }

    public vacunaciones(int cod_vacunacion, int cod_galpon, String nombre_numero_galpon, String enfermedad, String nombre_vacuna, String laboratorio, int dosis_aplicadas, Date fecha_vacunacion, String observaciones) {
        this.cod_vacunacion = cod_vacunacion;
        this.cod_galpon = cod_galpon;
        this.nombre_numero_galpon = nombre_numero_galpon;
        this.enfermedad = enfermedad;
        this.nombre_vacuna = nombre_vacuna;
        this.laboratorio = laboratorio;
        this.dosis_aplicadas = dosis_aplicadas;
        this.fecha_vacunacion = fecha_vacunacion;
        this.observaciones = observaciones;
    }

    public int getCod_vacunacion() {
        return cod_vacunacion;
    }

    public void setCod_vacunacion(int cod_vacunacion) {
        this.cod_vacunacion = cod_vacunacion;
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

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getNombre_vacuna() {
        return nombre_vacuna;
    }

    public void setNombre_vacuna(String nombre_vacuna) {
        this.nombre_vacuna = nombre_vacuna;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getDosis_aplicadas() {
        return dosis_aplicadas;
    }

    public void setDosis_aplicadas(int dosis_aplicadas) {
        this.dosis_aplicadas = dosis_aplicadas;
    }

    public Date getFecha_vacunacion() {
        return fecha_vacunacion;
    }

    public void setFecha_vacunacion(Date fecha_vacunacion) {
        this.fecha_vacunacion = fecha_vacunacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
