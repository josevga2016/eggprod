/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EggProd.EggProd.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Lenovo
 */
@Table
@Entity(name = "usuario")
public class usuario implements Serializable {
    @Id
    @Column (name="usuario")
    private String usuario;
    @Column (name="nombre_pila")
    private String nombre_pila;
    @Column (name="apellido")
    private String apellido;
    @Column (name="contraseña")
    private String contraseña;
    @Column (name="telefono")
    private int telefono;
    @Column (name="correo")
    private String correo;

    public usuario() {
    }
       
        
    public usuario(String usuario, String nombre_pila, String apellido, String contraseña, Integer telefono, String correo) {
        this.usuario = usuario;
        this.nombre_pila = nombre_pila;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre_pila() {
        return nombre_pila;
    }

    public void setNombre_pila(String nombre_pila) {
        this.nombre_pila = nombre_pila;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
