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
@Entity(name = "registro_ventas")
public class registro_ventas implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod_venta")
    private int cod_venta;
    //@ManyToOne
    @JoinColumn (name="cod_galpon")
    private int cod_galpon;
    @Column (name="nombre_numero_galpon")
    private String nombre_numero_galpon;
    @Column (name="nombre_comprador")
    private String nombre_comprador;
    @Column (name="fecha_venta")
    private Date fecha_venta;
    @Column (name="valor_venta")
    private double valor_venta;
    @Column (name="tipo_huevo")
    private String tipo_huevo;

    public registro_ventas() {
    }

    public registro_ventas(int cod_venta, int cod_galpon, String nombre_numero_galpon, String nombre_comprador, Date fecha_venta, double valor_venta, String tipo_huevo) {
        this.cod_venta = cod_venta;
        this.cod_galpon = cod_galpon;
        this.nombre_numero_galpon = nombre_numero_galpon;
        this.nombre_comprador = nombre_comprador;
        this.fecha_venta = fecha_venta;
        this.valor_venta = valor_venta;
        this.tipo_huevo = tipo_huevo;
    }

    public int getCod_venta() {
        return cod_venta;
    }

    public void setCod_venta(int cod_venta) {
        this.cod_venta = cod_venta;
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

    public String getNombre_comprador() {
        return nombre_comprador;
    }

    public void setNombre_comprador(String nombre_comprador) {
        this.nombre_comprador = nombre_comprador;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(double valor_venta) {
        this.valor_venta = valor_venta;
    }

    public String getTipo_huevo() {
        return tipo_huevo;
    }

    public void setTipo_huevo(String tipo_huevo) {
        this.tipo_huevo = tipo_huevo;
    }
    
}
