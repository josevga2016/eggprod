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
@Entity(name = "registro_costos")
public class registro_costos implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod_costo")
    private int cod_costo;
    @ManyToOne
    @JoinColumn (name="cod_galpon")
    private int cod_galpon;
    @Column (name="nombre_numero_galpon")
    private String nombre_numero_galpon;
    @Column (name="nombre_costo")
    private String nombre_costo;
    @Column (name="fecha_costo")
    private Date fecha_costo;
    @Column (name="valor_costo")
    private double valor_costo;

    public registro_costos() {
    }

    public registro_costos(int cod_costo, int cod_galpon, String nombre_numero_galpon, String nombre_costo, Date fecha_costo, double valor_costo) {
        this.cod_costo = cod_costo;
        this.cod_galpon = cod_galpon;
        this.nombre_numero_galpon = nombre_numero_galpon;
        this.nombre_costo = nombre_costo;
        this.fecha_costo = fecha_costo;
        this.valor_costo = valor_costo;
    }

    public int getCod_costo() {
        return cod_costo;
    }

    public void setCod_costo(int cod_costo) {
        this.cod_costo = cod_costo;
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

    public String getNombre_costo() {
        return nombre_costo;
    }

    public void setNombre_costo(String nombre_costo) {
        this.nombre_costo = nombre_costo;
    }

    public Date getFecha_costo() {
        return fecha_costo;
    }

    public void setFecha_costo(Date fecha_costo) {
        this.fecha_costo = fecha_costo;
    }

    public double getValor_costo() {
        return valor_costo;
    }

    public void setValor_costo(double valor_costo) {
        this.valor_costo = valor_costo;
    }
    
    
}
