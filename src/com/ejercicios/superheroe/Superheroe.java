package com.ejercicios.superheroe;

public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    //Constructor

    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    //Getters & Setters

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

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    //To String

    @Override
    public String toString() {
        return "Nombre del heroe ='" + nombre + "'\n" +
                "Descripcion='" + descripcion + "'\n" +
                "capa=" + capa;
    }
}
