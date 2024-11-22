package com.ejercicios.claseempleado;

public class Empleados {
    private String nombre;
    private String direccion;
    private String poblacion;

    public Empleados(String nombre, String direccion, String poblacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", poblacion='" + poblacion + '\'';
    }
}
