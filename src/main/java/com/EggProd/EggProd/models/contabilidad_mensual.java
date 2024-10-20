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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Table
@Entity(name = "contabilidad_mensual")
public class contabilidad_mensual implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod_contabilidad")
    private int cod_contabilidad;
    @ManyToOne
    @JoinColumn (name="cod_galpon")
    private int cod_galpon;
    @Column (name="nombre_numero_galpon")
    private String nombre_numero_galpon;
    @Column (name="fecha_inicio")
    private Date fecha_inicio;
    @Column (name="fecha_fin")
    private Date fecha_fin;
    @Column (name="total_ventas")
    private double total_ventas;
    @Column (name="total_costos")
    private double total_costos;
    @Column (name="ganacia_estimada")
    private double ganacia_estimada;
    @Column (name="observaciones")
    private String observaciones;

    public contabilidad_mensual() {
    }

    public contabilidad_mensual(int cod_contabilidad, int cod_galpon, String nombre_numero_galpon, Date fecha_inicio, Date fecha_fin, double total_ventas, double total_costos, double ganacia_estimada, String observaciones) {
        this.cod_contabilidad = cod_contabilidad;
        this.cod_galpon = cod_galpon;
        this.nombre_numero_galpon = nombre_numero_galpon;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.total_ventas = total_ventas;
        this.total_costos = total_costos;
        this.ganacia_estimada = ganacia_estimada;
        this.observaciones = observaciones;
    }

    public int getCod_contabilidad() {
        return cod_contabilidad;
    }

    public void setCod_contabilidad(int cod_contabilidad) {
        this.cod_contabilidad = cod_contabilidad;
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

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public double getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(double total_ventas) {
        this.total_ventas = total_ventas;
    }

    public double getTotal_costos() {
        return total_costos;
    }

    public void setTotal_costos(double total_costos) {
        this.total_costos = total_costos;
    }

    public double getGanacia_estimada() {
        return ganacia_estimada;
    }

    public void setGanacia_estimada(double ganacia_estimada) {
        this.ganacia_estimada = ganacia_estimada;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    

}
