package model;

import java.io.Serializable;

public class Producto implements Serializable {

    private String nombre;
    private int cantidad;
    private double precio;    
    private String descripcion;

    public Producto(String nombre, int cantidad, double precio, String descripcion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;        
        this.descripcion = descripcion;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
