package com.ejercicios.articulocientifico;

public class Principal {
    public static void main(String[] args) {
        ArticuloCientifico articulo1 = new ArticuloCientifico("Articulo 1", "Autor 1");
        articulo1.imprimir();
        System.out.println("-------------------------------------------------");
        ArticuloCientifico articulo2 = new ArticuloCientifico("Articulo 2", "Autor 2", "Palabra clave 1, Palabra clave 2", "Publicacion 1", 2021);
        articulo2.imprimir();
        System.out.println("-------------------------------------------------");
        ArticuloCientifico articulo3 = new ArticuloCientifico("Articulo 3", "Autor 3", "Palabra clave 3, Palabra clave 4", "Publicacion 2", 2020, "Resumen del articulo 3");
        articulo3.imprimir();
    }
}
