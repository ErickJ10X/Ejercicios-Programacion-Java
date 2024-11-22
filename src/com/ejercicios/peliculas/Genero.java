package com.ejercicios.peliculas;

public enum Genero {
    ACCION("Accion"),
    COMEDIA(("Comedia")),
    DRAMA("Drama"),
    SUSPENSO("Suspenso"),;

    private String nombre;

    private Genero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
