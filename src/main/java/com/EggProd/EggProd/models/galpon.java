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
@Entity(name = "galpon")
public class galpon implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod_galpon")
    private int cod_galpon;
    //@ManyToOne
    @JoinColumn (name="usuario")
    private String usuario;
    @Column (name="nombre_numero")
    private String nombre_numero;
    @Column (name="raza")
    private String raza;
    @Column (name="fecha_ingreso")
    private Date fecha_ingreso;
    @Column (name="fecha_inicio_produccion")
    private Date fecha_inicio_produccion;
    @Column (name="edad_ingreso")
    private int edad_ingreso;
    @Column (name="edad_actual")
    private int edad_actual;
    @Column (name="cantidad_inicial")
    private int cantidad_inicial;
    @Column (name="cantidad_actual")
    private int cantidad_actual;
    
    
    public galpon() {
    }

    public galpon(int cod_galpon, String usuario, String nombre_numero, String raza, Date fecha_ingreso, Date fecha_inicio_produccion, int edad_ingreso, int edad_actual, int cantidad_inicial, int cantidad_actual) {
        this.cod_galpon = cod_galpon;
        this.usuario = usuario;
        this.nombre_numero = nombre_numero;
        this.raza = raza;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_inicio_produccion = fecha_inicio_produccion;
        this.edad_ingreso = edad_ingreso;
        this.edad_actual = edad_actual;
        this.cantidad_inicial = cantidad_inicial;
        this.cantidad_actual = cantidad_actual;
    }

    public int getCod_galpon() {
        return cod_galpon;
    }

    public void setCod_galpon(int cod_galpon) {
        this.cod_galpon = cod_galpon;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre_numero() {
        return nombre_numero;
    }

    public void setNombre_numero(String nombre_numero) {
        this.nombre_numero = nombre_numero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_inicio_produccion() {
        return fecha_inicio_produccion;
    }

    public void setFecha_inicio_produccion(Date fecha_inicio_produccion) {
        this.fecha_inicio_produccion = fecha_inicio_produccion;
    }

    public int getEdad_ingreso() {
        return edad_ingreso;
    }

    public void setEdad_ingreso(int edad_ingreso) {
        this.edad_ingreso = edad_ingreso;
    }

    public int getEdad_actual() {
        return edad_actual;
    }

    public void setEdad_actual(int edad_actual) {
        this.edad_actual = edad_actual;
    }

    public int getCantidad_inicial() {
        return cantidad_inicial;
    }

    public void setCantidad_inicial(int cantidad_inicial) {
        this.cantidad_inicial = cantidad_inicial;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }


    
}

