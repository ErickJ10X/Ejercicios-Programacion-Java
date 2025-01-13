package com.ejercicios.libro;

public class Novelas extends Libro {
    private Generos genero;

    public Novelas(String titulo, String autor, Generos genero) {
        super(titulo, autor);
        this.genero = genero;
    }
}
