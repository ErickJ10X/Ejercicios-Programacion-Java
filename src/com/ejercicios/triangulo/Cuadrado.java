package com.ejercicios.triangulo;

public class Cuadrado {
    private int lado;

    //constructor

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    //methods

    public double calcularArea() {
        return lado * lado;
    }
    public double calcularPerimetro() {
        return lado*4;
    }
}
