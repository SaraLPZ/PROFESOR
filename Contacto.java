/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoagendamysql;

/**
 *
 * @author CDMFP
 */
public class Contacto {
    private String nombre;
    private String telefono;
    private int id;

    public Contacto(String nombre, String telefono, int id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
    }

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return id+" "+nombre+"->"+telefono;
    }
    
}
