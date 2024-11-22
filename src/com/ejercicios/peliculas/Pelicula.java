package com.ejercicios.peliculas;

import java.util.List;

public class Pelicula {
    private String nombre;
    private String director;
    private List<Genero> genero;
    private int duracion;
    private int año;
    private double calificacion;

    //constructor


    public Pelicula(String nombre, String director, List<Genero> genero, int duracion, int año, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
    }

    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Genero> getGenero() {
        return genero;
    }

    public void setGenero(List<Genero> genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    //methods

    public boolean esPeliculaEpica() {
        if (this.duracion >= 180) {
            return true;
        } else {
            return false;
        }
    }

    public String calcularValoracion() {
        if (this.calificacion > 8 && this.calificacion <= 10) {
            return "Excelente";
        } else if (this.calificacion > 7 && this.calificacion <= 8) {
            return "Buena";
        } else if (this.calificacion > 5 && this.calificacion <= 7) {
            return "Regular";
        } else if (this.calificacion > 2 && this.calificacion <= 5) {
            return "Mala";
        } else {
            return "Muy mala";
        }
    }

    public boolean esSimilar(Pelicula p) {
        if (this.genero == p.getGenero() && calcularValoracion().equals(p.calcularValoracion())) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirCartel() {
        System.out.println("-------" + this.nombre + "-------");
        switch (calcularValoracion()) {
            case "Excelente":
                System.out.println("\t*****");
                break;
            case "Buena":
                System.out.println("\t****");
                break;
            case "Regular":
                System.out.println("\t***");
                break;
            case "Mala":
                System.out.println("\t**");
                break;
            case "Muy mala":
                System.out.println("\t*");
                break;
            default:
                System.out.println("\tn/s");
        }
        System.out.println("\t" + this.año);
        System.out.printf("\t");
        genero.forEach(g -> System.out.printf("| " + g.toString() + " |"));
        System.out.println("\n\t" + this.director);
    }

    //To String

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                ", genero=" + genero +
                ", duracion=" + duracion +
                ", año=" + año +
                ", calificacion=" + calificacion;
    }
}
