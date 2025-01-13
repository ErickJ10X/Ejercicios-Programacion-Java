package com.ejercicios.libro;

public class LibroDeTexto extends Libro {
    private String curso;

    public LibroDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }
}
