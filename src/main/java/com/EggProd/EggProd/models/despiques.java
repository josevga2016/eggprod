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
@Entity(name = "despiques")
public class despiques implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod_despique")
    private int cod_despique;
    //@ManyToOne
    @JoinColumn (name="cod_galpon")
    private int cod_galpon;
    @Column (name="nombre_numero_galpon")
    private String nombre_numero_galpon;
    @Column (name="fecha_despique")
    private Date fecha_despique;
    @Column (name="observaciones")
    private String observaciones;

    public despiques() {
    }

    public despiques(int cod_despique, int cod_galpon, String nombre_numero_galpon, Date fecha_despique, String observaciones) {
        this.cod_despique = cod_despique;
        this.cod_galpon = cod_galpon;
        this.nombre_numero_galpon = nombre_numero_galpon;
        this.fecha_despique = fecha_despique;
        this.observaciones = observaciones;
    }

    public int getCod_despique() {
        return cod_despique;
    }

    public void setCod_despique(int cod_despique) {
        this.cod_despique = cod_despique;
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

    public Date getFecha_despique() {
        return fecha_despique;
    }

    public void setFecha_despique(Date fecha_despique) {
        this.fecha_despique = fecha_despique;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
