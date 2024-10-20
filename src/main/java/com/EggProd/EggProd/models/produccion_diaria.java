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
@Entity(name = "produccion_diaria")
public class produccion_diaria implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod_produccion")
    private int cod_produccion;
    @ManyToOne
    @JoinColumn (name="cod_galpon")
    private int cod_galpon;
    @Column (name="nombre_numero_galpon")
    private String nombre_numero_galpon;
    @Column (name="fecha_puesta")
    private Date fecha_puesta;
    @Column (name="procentaje_produccion")
    private double procentaje_produccion;
    @Column (name="huevos_jumbo")
    private int huevos_jumbo;
    @Column (name="huevos_AAA")
    private int huevos_AAA;
    @Column (name="huevos_AA")
    private int huevos_AA;
    @Column (name="huevos_A")
    private int huevos_A;
    @Column (name="huevos_B")
    private int huevos_B;
    @Column (name="huevos_e")
    private int huevos_e;
    @Column (name="total_huevos")
    private int total_huevos;
    @Column (name="huevos_rotos")
    private int huevos_rotos;

    public produccion_diaria() {
    }

    public produccion_diaria(int cod_produccion, int cod_galpon, String nombre_numero_galpon, Date fecha_puesta, double procentaje_produccion, int huevos_jumbo, int huevos_AAA, int huevos_AA, int huevos_A, int huevos_B, int huevos_e, int total_huevos, int huevos_rotos) {
        this.cod_produccion = cod_produccion;
        this.cod_galpon = cod_galpon;
        this.nombre_numero_galpon = nombre_numero_galpon;
        this.fecha_puesta = fecha_puesta;
        this.procentaje_produccion = procentaje_produccion;
        this.huevos_jumbo = huevos_jumbo;
        this.huevos_AAA = huevos_AAA;
        this.huevos_AA = huevos_AA;
        this.huevos_A = huevos_A;
        this.huevos_B = huevos_B;
        this.huevos_e = huevos_e;
        this.total_huevos = total_huevos;
        this.huevos_rotos = huevos_rotos;
    }

    public int getCod_produccion() {
        return cod_produccion;
    }

    public void setCod_produccion(int cod_produccion) {
        this.cod_produccion = cod_produccion;
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

    public Date getFecha_puesta() {
        return fecha_puesta;
    }

    public void setFecha_puesta(Date fecha_puesta) {
        this.fecha_puesta = fecha_puesta;
    }

    public double getProcentaje_produccion() {
        return procentaje_produccion;
    }

    public void setProcentaje_produccion(double procentaje_produccion) {
        this.procentaje_produccion = procentaje_produccion;
    }

    public int getHuevos_jumbo() {
        return huevos_jumbo;
    }

    public void setHuevos_jumbo(int huevos_jumbo) {
        this.huevos_jumbo = huevos_jumbo;
    }

    public int getHuevos_AAA() {
        return huevos_AAA;
    }

    public void setHuevos_AAA(int huevos_AAA) {
        this.huevos_AAA = huevos_AAA;
    }

    public int getHuevos_AA() {
        return huevos_AA;
    }

    public void setHuevos_AA(int huevos_AA) {
        this.huevos_AA = huevos_AA;
    }

    public int getHuevos_A() {
        return huevos_A;
    }

    public void setHuevos_A(int huevos_A) {
        this.huevos_A = huevos_A;
    }

    public int getHuevos_B() {
        return huevos_B;
    }

    public void setHuevos_B(int huevos_B) {
        this.huevos_B = huevos_B;
    }

    public int getHuevos_e() {
        return huevos_e;
    }

    public void setHuevos_e(int huevos_e) {
        this.huevos_e = huevos_e;
    }

    public int getTotal_huevos() {
        return total_huevos;
    }

    public void setTotal_huevos(int total_huevos) {
        this.total_huevos = total_huevos;
    }

    public int getHuevos_rotos() {
        return huevos_rotos;
    }

    public void setHuevos_rotos(int huevos_rotos) {
        this.huevos_rotos = huevos_rotos;
    }
    
    
}
