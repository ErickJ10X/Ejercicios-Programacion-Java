package com.ejercicios.libro;

public class LibroDeTextoDeUniversidadAlemania extends LibroDeTexto{
    private String universidad;

    public LibroDeTextoDeUniversidadAlemania(String titulo, String autor, String curso, String universidad) {
        super(titulo, autor, curso);
        this.universidad = universidad;
    }
}
