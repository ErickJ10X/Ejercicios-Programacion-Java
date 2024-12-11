package com.ejercicios.articulocientifico;

public class ArticuloCientifico {
    private String nombreDelArticulo;
    private String autor;
    private String palabrasClave;
    private String nombreDeLaPublicacion;
    private int año;
    private String resumen;

     // Constructor

    public ArticuloCientifico(String nombreDelArticulo, String autor) {
        this.nombreDelArticulo = nombreDelArticulo;
        this.autor = autor;
    }

    public ArticuloCientifico(String nombreDelArticulo, String autor, String palabrasClave, String nombreDeLaPublicacion, int anioDePublicacion) {
        this(nombreDelArticulo, autor);
        this.palabrasClave = palabrasClave;
        this.nombreDeLaPublicacion = nombreDeLaPublicacion;
        this.año = anioDePublicacion;
    }

    public ArticuloCientifico(String nombreDelArticulo, String autor, String palabrasClave, String nombreDeLaPublicacion, int anioDePublicacion, String resumen) {
        this(nombreDelArticulo, autor, palabrasClave, nombreDeLaPublicacion, anioDePublicacion);
        this.resumen = resumen;
    }

    // metodos

    public void imprimir() {
        System.out.println("Nombre del articulo: " + nombreDelArticulo);
        System.out.println("Autor: " + autor);
        System.out.println("Palabras clave: " + palabrasClave);
        System.out.println("Nombre de la publicacion: " + nombreDeLaPublicacion);
        System.out.println("Año de publicacion: " + año);
        System.out.println("Resumen: " + resumen);
    }
}
