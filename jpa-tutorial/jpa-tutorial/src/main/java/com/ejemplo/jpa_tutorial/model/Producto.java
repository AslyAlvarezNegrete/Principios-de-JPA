package com.ejemplo.jpa_tutorial.model;

import java.util.Locale;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    private String descripcion;

    
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setProductoId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return String.format(Locale.US, "%.2f", precio);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
