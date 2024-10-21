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
@Entity(name = "indicadores")
public class indicadores implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod_indicador")
    private int cod_indicador;
    //@ManyToOne
    @JoinColumn (name="cod_galpon")
    private int cod_galpon;
    @Column (name="nombre_numero_galpon")
    private String nombre_numero_galpon;
    @Column (name="mortalidad_acumulada")
    private double mortalidad_acumulada;
    @Column (name="produccion_promedio")
    private double produccion_promedio;
    @Column (name="fecha_descarte")
    private Date fecha_descarte;

    public indicadores() {
    }

    public indicadores(int cod_indicador, int cod_galpon, String nombre_numero_galpon, double mortalidad_acumulada, double produccion_promedio, Date fecha_descarte) {
        this.cod_indicador = cod_indicador;
        this.cod_galpon = cod_galpon;
        this.nombre_numero_galpon = nombre_numero_galpon;
        this.mortalidad_acumulada = mortalidad_acumulada;
        this.produccion_promedio = produccion_promedio;
        this.fecha_descarte = fecha_descarte;
    }

    public int getCod_indicador() {
        return cod_indicador;
    }

    public void setCod_indicador(int cod_indicador) {
        this.cod_indicador = cod_indicador;
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

    public double getMortalidad_acumulada() {
        return mortalidad_acumulada;
    }

    public void setMortalidad_acumulada(double mortalidad_acumulada) {
        this.mortalidad_acumulada = mortalidad_acumulada;
    }

    public double getProduccion_promedio() {
        return produccion_promedio;
    }

    public void setProduccion_promedio(double produccion_promedio) {
        this.produccion_promedio = produccion_promedio;
    }

    public Date getFecha_descarte() {
        return fecha_descarte;
    }

    public void setFecha_descarte(Date fecha_descarte) {
        this.fecha_descarte = fecha_descarte;
    }
    
    

}
