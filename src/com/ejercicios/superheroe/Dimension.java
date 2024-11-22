package com.ejercicios.superheroe;

public class Dimension {
    private int alto;
    private int ancho;
    private int profundidad;

    //Constructors

    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public Dimension(int alto, int ancho, int profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    //Getters & Setters

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    //Methods

    public int getVolumen(){
        return alto*ancho*profundidad;
    }

    //To String

    @Override
    public String toString() {
        return "Dimension\n" +
                "Alto=" + alto + "\n" +
                "Ancho=" + ancho + "\n" +
                "Profundidad=" + profundidad;
    }
}
