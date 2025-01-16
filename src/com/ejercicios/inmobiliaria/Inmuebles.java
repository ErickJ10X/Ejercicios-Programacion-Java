package com.ejercicios.inmobiliaria;

import java.io.Serializable;

public class Inmuebles implements Serializable {
    private String direccion;
    private String ciudad;
    private Tipo tipo;

    public Inmuebles(String direccion, String ciudad, Tipo tipo) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
