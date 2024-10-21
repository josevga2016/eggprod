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
@Entity(name = "registro_decesos")
public class registro_decesos implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod_deceso")
    private int cod_deceso;
    //@ManyToOne
    @JoinColumn (name="cod_galpon")
    private int cod_galpon;
    @Column (name="nombre_numero_galpon")
    private String nombre_numero_galpon;
    @Column (name="fecha_deceso")
    private Date fecha_deceso;
    @Column (name="cantidad_decesos")
    private int cantidad_decesos;
    @Column (name="causa_deceso")
    private String causa_deceso;
    @Column (name="mortalidad")
    private double mortalidad;

    public registro_decesos() {
    }

    public registro_decesos(int cod_deceso, int cod_galpon, String nombre_numero_galpon, Date fecha_deceso, int cantidad_decesos, String causa_deceso, double mortalidad) {
        this.cod_deceso = cod_deceso;
        this.cod_galpon = cod_galpon;
        this.nombre_numero_galpon = nombre_numero_galpon;
        this.fecha_deceso = fecha_deceso;
        this.cantidad_decesos = cantidad_decesos;
        this.causa_deceso = causa_deceso;
        this.mortalidad = mortalidad;
    }

    public int getCod_deceso() {
        return cod_deceso;
    }

    public void setCod_deceso(int cod_deceso) {
        this.cod_deceso = cod_deceso;
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

    public Date getFecha_deceso() {
        return fecha_deceso;
    }

    public void setFecha_deceso(Date fecha_deceso) {
        this.fecha_deceso = fecha_deceso;
    }

    public int getCantidad_decesos() {
        return cantidad_decesos;
    }

    public void setCantidad_decesos(int cantidad_decesos) {
        this.cantidad_decesos = cantidad_decesos;
    }

    public String getCausa_deceso() {
        return causa_deceso;
    }

    public void setCausa_deceso(String causa_deceso) {
        this.causa_deceso = causa_deceso;
    }

    public double getMortalidad() {
        return mortalidad;
    }

    public void setMortalidad(double mortalidad) {
        this.mortalidad = mortalidad;
    }
    
    


}
