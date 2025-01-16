package com.ejercicios.ProductoFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Producto {
    int id;
    String nombre;
    int cantidad;
    double precio;

    public Producto(int id, String nombre, int cantidad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    private String ajustarNombre(String nombre) {
        if (nombre.length() > 20) {
            return nombre.substring(0, 20);
        } else {
            return String.format("%-20s", nombre);
        }
    }

    public void escribir (RandomAccessFile file) throws IOException {

    }

    private void leer (RandomAccessFile file, int posicion) throws IOException {

    }
}
